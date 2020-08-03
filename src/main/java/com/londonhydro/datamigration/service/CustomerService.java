package com.londonhydro.datamigration.service;

import com.londonhydro.datamigration.domain.Customer;
import com.londonhydro.datamigration.models.atom.ContentType;
import com.londonhydro.datamigration.models.atom.EntryType;
import com.londonhydro.datamigration.models.atom.LinkType;
import com.londonhydro.datamigration.repository.CustomerRepo;
import com.londonhydro.datamigration.utils.UUIDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    UUIDGenerator uuidGenerator;
    @Autowired
    CustomerRepo customerRepo;

    public String getAllCustomers() throws JAXBException, XMLStreamException, UnsupportedEncodingException {
        List<Customer> customers = customerRepo.findAll();

        List<EntryType> entries = new ArrayList<>();
        StringWriter sw = new StringWriter();

        customers.forEach(customer -> {
            EntryType entry = new EntryType();
            LinkType link = new LinkType();
            ContentType content = new ContentType();

            content.setCustomer(customer);
            entry.setContent(content);
            entry.setId("123456789");
            entry.setTitle("Customer Entry");
            entry.setPublished(Instant.now().truncatedTo(ChronoUnit.SECONDS).toString());
            entry.setUpdated(Instant.now().truncatedTo(ChronoUnit.SECONDS).toString());
            entry.setLinks(Collections.singletonList(new LinkType("self","http://localhost:4200/api/customer")));
            entries.add(entry);
        });


        XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
        XMLStreamWriter xmlStreamWriter = xmlOutputFactory.createXMLStreamWriter(sw);
        xmlStreamWriter.writeStartDocument("UTF-8", "1.0");
        xmlStreamWriter.writeCharacters("\n");
        xmlStreamWriter.writeStartElement("feed");
        xmlStreamWriter.writeNamespace("","http://www.w3.org/2005/Atom");
        xmlStreamWriter.writeNamespace("xsi","http://www.w3.org/2001/XMLSchema-instance");
        xmlStreamWriter.writeCharacters("\n");

        xmlStreamWriter.writeStartElement("id");
        xmlStreamWriter.writeCharacters("urn:uuid:"+uuidGenerator.generateType3UUID("https://www.greenbutton.londonhydro.com","feed").toString());
        xmlStreamWriter.writeEndElement();
        xmlStreamWriter.writeCharacters("\n");

        xmlStreamWriter.writeStartElement("title");
        xmlStreamWriter.writeCharacters("Green Button Usage Feed");
        xmlStreamWriter.writeEndElement();
        xmlStreamWriter.writeCharacters("\n");

        xmlStreamWriter.writeStartElement("updated");
        xmlStreamWriter.writeCharacters(Instant.now().truncatedTo(ChronoUnit.SECONDS).toString());
        xmlStreamWriter.writeEndElement();
        xmlStreamWriter.writeCharacters("\n");

        xmlStreamWriter.writeStartElement("link");
        xmlStreamWriter.writeAttribute("href","https://api.londonhydro.com/espi/1_1/resource/Batch/RetailCustomer/1000123637/UsagePoint/1000453363");
        xmlStreamWriter.writeAttribute("rel","self");
        xmlStreamWriter.writeEndElement();
        xmlStreamWriter.writeCharacters("\n");


        JAXBContext context = JAXBContext.newInstance(EntryType.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://naesb.org/espi espiDerived.xsd");
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
        entries.forEach(entry -> {
            try {
                marshaller.marshal(entry,xmlStreamWriter);
            } catch (JAXBException e) {
                e.printStackTrace();
            }
        });

        xmlStreamWriter.writeCharacters("\n");
        xmlStreamWriter.writeEndElement();
        xmlStreamWriter.writeEndDocument();

        return sw.toString();
    }
}
