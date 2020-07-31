//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.31 at 10:29:41 AM IST 
//


package com.londonhydro.datamigration.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A real estate location, commonly referred to as premises.
 * 
 * <p>Java class for ServiceLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://naesb.org/espi/customer}WorkLocation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accessMethod" type="{http://naesb.org/espi/customer}String256" minOccurs="0"/&gt;
 *         &lt;element name="siteAccessProblem" type="{http://naesb.org/espi/customer}String256" minOccurs="0"/&gt;
 *         &lt;element name="needsInspection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UsagePoints" type="{http://naesb.org/espi/customer}UsagePoints" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="outageBlock" type="{http://naesb.org/espi/customer}String32" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceLocation", propOrder = {
    "accessMethod",
    "siteAccessProblem",
    "needsInspection",
    "usagePoints",
    "outageBlock"
})
public class ServiceLocation
    extends WorkLocation
{

    protected String accessMethod;
    protected String siteAccessProblem;
    protected Boolean needsInspection;
    @XmlElement(name = "UsagePoints")
    protected List<UsagePoints> usagePoints;
    protected String outageBlock;

    /**
     * Gets the value of the accessMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessMethod() {
        return accessMethod;
    }

    /**
     * Sets the value of the accessMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessMethod(String value) {
        this.accessMethod = value;
    }

    /**
     * Gets the value of the siteAccessProblem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteAccessProblem() {
        return siteAccessProblem;
    }

    /**
     * Sets the value of the siteAccessProblem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteAccessProblem(String value) {
        this.siteAccessProblem = value;
    }

    /**
     * Gets the value of the needsInspection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNeedsInspection() {
        return needsInspection;
    }

    /**
     * Sets the value of the needsInspection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNeedsInspection(Boolean value) {
        this.needsInspection = value;
    }

    /**
     * Gets the value of the usagePoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usagePoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsagePoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsagePoints }
     * 
     * 
     */
    public List<UsagePoints> getUsagePoints() {
        if (usagePoints == null) {
            usagePoints = new ArrayList<UsagePoints>();
        }
        return this.usagePoints;
    }

    /**
     * Gets the value of the outageBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutageBlock() {
        return outageBlock;
    }

    /**
     * Sets the value of the outageBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutageBlock(String value) {
        this.outageBlock = value;
    }

}
