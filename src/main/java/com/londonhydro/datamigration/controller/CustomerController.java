package com.londonhydro.datamigration.controller;

import com.londonhydro.datamigration.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;
import java.io.UnsupportedEncodingException;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping(value = "/api/customer",produces = MediaType.APPLICATION_ATOM_XML_VALUE)
    public String getAllCustomers(HttpServletRequest request) throws JAXBException, XMLStreamException, UnsupportedEncodingException {
        return customerService.getAllCustomers(request);
    }
    @GetMapping(value = "/api/customer/{id}",produces = MediaType.APPLICATION_ATOM_XML_VALUE)
    public String getCustomerById(HttpServletRequest request, @PathVariable String id) throws JAXBException, XMLStreamException, UnsupportedEncodingException {
        return customerService.getCustomerById(request,id);
    }

}
