//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.31 at 10:29:41 AM IST 
//


package com.londonhydro.datamigration.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * General purpose street and postal address information.
 * 
 * <p>Java class for StreetAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StreetAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://naesb.org/espi/customer}Object"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="streetDetail" type="{http://naesb.org/espi/customer}StreetDetail" minOccurs="0"/&gt;
 *         &lt;element name="townDetail" type="{http://naesb.org/espi/customer}TownDetail" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://naesb.org/espi/customer}Status" minOccurs="0"/&gt;
 *         &lt;element name="postalCode" type="{http://naesb.org/espi/customer}String256" minOccurs="0"/&gt;
 *         &lt;element name="poBox" type="{http://naesb.org/espi/customer}String256" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreetAddress", propOrder = {
    "streetDetail",
    "townDetail",
    "status",
    "postalCode",
    "poBox"
})
public class StreetAddress
    extends java.lang.Object
{

    protected StreetDetail streetDetail;
    protected TownDetail townDetail;
    protected Status status;
    protected String postalCode;
    protected String poBox;

    /**
     * Gets the value of the streetDetail property.
     * 
     * @return
     *     possible object is
     *     {@link StreetDetail }
     *     
     */
    public StreetDetail getStreetDetail() {
        return streetDetail;
    }

    /**
     * Sets the value of the streetDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetDetail }
     *     
     */
    public void setStreetDetail(StreetDetail value) {
        this.streetDetail = value;
    }

    /**
     * Gets the value of the townDetail property.
     * 
     * @return
     *     possible object is
     *     {@link TownDetail }
     *     
     */
    public TownDetail getTownDetail() {
        return townDetail;
    }

    /**
     * Sets the value of the townDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TownDetail }
     *     
     */
    public void setTownDetail(TownDetail value) {
        this.townDetail = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the poBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoBox() {
        return poBox;
    }

    /**
     * Sets the value of the poBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoBox(String value) {
        this.poBox = value;
    }

}
