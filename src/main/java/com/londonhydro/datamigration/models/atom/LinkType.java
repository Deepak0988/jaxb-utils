package com.londonhydro.datamigration.models.atom;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import java.io.Serializable;
@XmlAccessorType(XmlAccessType.FIELD)
public class LinkType implements Serializable {
    public static final String SELF = "self";
    public static final String UP = "up";
    public static final String RELATED = "related";
    public static final String HREF = "href";

    @XmlAttribute(name = HREF, required = true)
    @XmlSchemaType(name = "anyURI")
    protected String href;

    @XmlAttribute(name = "rel")
    protected String rel;

    public LinkType() {
    }

    public LinkType(String rel, String href) {
        this.href = href;
        this.rel = rel;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }
}
