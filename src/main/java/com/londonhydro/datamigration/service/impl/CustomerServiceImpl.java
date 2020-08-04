package com.londonhydro.datamigration.service.impl;

import com.londonhydro.datamigration.domain.Customer;
import com.londonhydro.datamigration.models.atom.ContentType;
import com.londonhydro.datamigration.models.atom.EntryType;
import com.londonhydro.datamigration.models.atom.LinkType;
import com.londonhydro.datamigration.repository.CustomerRepo;
import com.londonhydro.datamigration.service.CustomerService;
import com.londonhydro.datamigration.utils.FeedGenerator;
import com.londonhydro.datamigration.utils.UUIDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;
import java.io.UnsupportedEncodingException;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    UUIDGenerator uuidGenerator;
    @Autowired
    CustomerRepo customerRepo;
    @Autowired
    FeedGenerator feedGenerator;

    @Override
    public String getAllCustomers(HttpServletRequest request) throws JAXBException, XMLStreamException, UnsupportedEncodingException {
        String url = request.getRequestURL().toString();
        List<Customer> customers = customerRepo.findAll();
        List<EntryType> entries = generateCustomerEntries(customers,url);
        return feedGenerator.generateFeed(url,entries);
    }

    @Override
    public String getCustomerById(HttpServletRequest request, String id) throws JAXBException, XMLStreamException, UnsupportedEncodingException {
        String requestUrl = request.getRequestURL().toString();
        String url = requestUrl.substring(0,requestUrl.lastIndexOf("/"));
        Customer customer = customerRepo.findById(id).get();
        List<EntryType> entries =  generateCustomerEntries(Collections.singletonList(customer),url);
        return feedGenerator.generateFeed(url,entries);
    }

    private List<EntryType> generateCustomerEntries(List<Customer> customers,String url){
            List<EntryType> entries = new ArrayList<>();
            customers.forEach(customer -> {
            EntryType entry = new EntryType();
            List<LinkType> links = new ArrayList<>();
            ContentType content = new ContentType();
            String selfUrl = url+"/"+customer.getId();
            content.setCustomer(customer);
            entry.setContent(content);
            entry.setId("urn:uuid:"+uuidGenerator.generateType3UUID(selfUrl).toString());
            entry.setTitle("Customer Entry");
            entry.setPublished(Instant.now().truncatedTo(ChronoUnit.SECONDS).toString());
            entry.setUpdated(Instant.now().truncatedTo(ChronoUnit.SECONDS).toString());
            links.add(new LinkType("up",url));
            links.add(new LinkType("self",selfUrl));
            entry.setLinks(links);
            entries.add(entry);
        });
        return entries;
    }
}
