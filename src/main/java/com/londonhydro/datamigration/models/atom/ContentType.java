package com.londonhydro.datamigration.models.atom;

import com.londonhydro.datamigration.domain.Customer;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "content")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contentType", propOrder = {
        "customer"
})
@XmlSeeAlso({
        Customer.class
})

public class ContentType {
    @XmlElementRefs({
            @XmlElementRef(name = "Customer", namespace = "http://naesb.org/espi/cust", type = Customer.class, required = false),
    })
    @XmlAnyElement(lax = true)
    protected Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
