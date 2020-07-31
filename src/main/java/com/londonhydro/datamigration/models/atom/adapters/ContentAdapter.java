package com.londonhydro.datamigration.models.atom.adapters;

import com.londonhydro.datamigration.models.atom.ContentType;
import com.londonhydro.datamigration.models.atom.ObjectFactory;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class ContentAdapter extends XmlAdapter<JAXBElement<ContentType>, ContentType> {
    @Override
    public ContentType unmarshal(JAXBElement<ContentType> contentTypeJAXBElement) throws Exception {
        return contentTypeJAXBElement.getValue();
    }

    @Override
    public JAXBElement<ContentType> marshal(ContentType contentType) throws Exception {
        return new JAXBElement<>(ObjectFactory.EntryTypeContent_QNAME, ContentType.class, contentType);
    }
}
