package com.londonhydro.datamigration.controller;

import com.londonhydro.datamigration.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping(value = "/api/customer",produces = MediaType.APPLICATION_ATOM_XML_VALUE)
    public String getAllCustomers() throws JAXBException, XMLStreamException {
        return customerService.getAllCustomers();
    }
}
