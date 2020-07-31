package com.londonhydro.datamigration.models.atom;

import com.londonhydro.datamigration.models.atom.adapters.ContentAdapter;
import com.londonhydro.datamigration.models.atom.adapters.LinkAdapter;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@XmlRootElement(name = "entry")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entryType", propOrder = {
        "id",
        "links",
        "title",
        "content"
})
public class EntryType {

    @XmlElement
    protected String id;

    @XmlElementRefs({
            @XmlElementRef(name = "link", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
    })
    @XmlAnyElement(lax = true)
    @XmlJavaTypeAdapter(LinkAdapter.class)
    protected List<LinkType> links = new ArrayList<LinkType>();

    @XmlElement
    private String title;

    @XmlElementRefs({
            @XmlElementRef(name = "content", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
    })
    @XmlAnyElement(lax = true)
    @XmlJavaTypeAdapter(ContentAdapter.class)
    protected ContentType content = new ContentType();


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<LinkType> getLinks() {
        return links;
    }

    public void setLinks(List<LinkType> links) {
        this.links = links;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ContentType getContent() {
        return content;
    }

    public void setContent(ContentType content) {
        this.content = content;
    }
}
