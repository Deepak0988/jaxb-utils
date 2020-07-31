package com.londonhydro.datamigration.models.atom.adapters;

import com.londonhydro.datamigration.models.atom.LinkType;
import com.londonhydro.datamigration.models.atom.ObjectFactory;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class LinkAdapter extends XmlAdapter<JAXBElement<LinkType>, LinkType> {
    @Override
    public LinkType unmarshal(JAXBElement<LinkType> linkTypeJAXBElement) throws Exception {
        return linkTypeJAXBElement.getValue();
    }

    @Override
    public JAXBElement<LinkType> marshal(LinkType linkType) throws Exception {
        return new JAXBElement<LinkType>(ObjectFactory.SourceTypeLink_QNAME, LinkType.class, linkType);
    }
}
