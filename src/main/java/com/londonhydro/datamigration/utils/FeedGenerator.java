package com.londonhydro.datamigration.utils;

import com.londonhydro.datamigration.models.atom.EntryType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.StringWriter;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Component
public class FeedGenerator {

    @Autowired
    UUIDGenerator uuidGenerator;

    public String generateFeed(String url, List<EntryType> entries) throws XMLStreamException, JAXBException {
        StringWriter sw = new StringWriter();
        XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
        XMLStreamWriter xmlStreamWriter = xmlOutputFactory.createXMLStreamWriter(sw);
        xmlStreamWriter.writeStartDocument("UTF-8", "1.0");
        xmlStreamWriter.writeCharacters("\n");
        xmlStreamWriter.writeStartElement("feed");
        xmlStreamWriter.writeNamespace("","http://www.w3.org/2005/Atom");
        xmlStreamWriter.writeNamespace("xsi","http://www.w3.org/2001/XMLSchema-instance");
        xmlStreamWriter.writeCharacters("\n");

        xmlStreamWriter.writeStartElement("id");
        xmlStreamWriter.writeCharacters("urn:uuid:"+uuidGenerator.generateType3UUID("https://www.londonhydro.com").toString());
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
        xmlStreamWriter.writeAttribute("href",url);
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
