package com.londonhydro.datamigration.service.impl;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;
import java.io.UnsupportedEncodingException;

public interface CustomerService {
    public String getAllCustomers(HttpServletRequest request) throws JAXBException, XMLStreamException, UnsupportedEncodingException;
}
