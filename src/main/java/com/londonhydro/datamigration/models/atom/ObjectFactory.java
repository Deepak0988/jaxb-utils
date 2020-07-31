package com.londonhydro.datamigration.models.atom;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {
    public ObjectFactory() {
    }
    public final static QName SourceTypeLink_QNAME = new QName("http://www.w3.org/2005/Atom", "link");
    public final static QName EntryTypeContent_QNAME = new QName("http://www.w3.org/2005/Atom", "content");
    public final static QName Entry_QNAME = new QName("http://www.w3.org/2005/Atom", "entry");

    public EntryType createEntryType() {
        return new EntryType();
    }
    public LinkType createLinkType() {
        return new LinkType();
    }
    public ContentType createContentType() {
        return new ContentType();
    }

    @XmlElementDecl(namespace = "http://www.w3.org/2005/Atom", name = "entry")
    public JAXBElement<EntryType> createEntry(EntryType value) {
        return new JAXBElement<EntryType>(Entry_QNAME, EntryType.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.w3.org/2005/Atom", name = "link", scope = EntryType.class)
    public JAXBElement<LinkType> createEntryTypeLink(LinkType value) {
        return new JAXBElement<LinkType>(SourceTypeLink_QNAME, LinkType.class, EntryType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.w3.org/2005/Atom", name = "content", scope = EntryType.class)
    public JAXBElement<ContentType> createEntryTypeContent(ContentType value) {
        return new JAXBElement<ContentType>(EntryTypeContent_QNAME, ContentType.class, EntryType.class, value);
    }
}
