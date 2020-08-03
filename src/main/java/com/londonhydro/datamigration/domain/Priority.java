//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.31 at 10:29:41 AM IST 
//


package com.londonhydro.datamigration.domain;

import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Priority definition.
 * 
 * <p>Java class for Priority complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Priority"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://naesb.org/espi/customer}Object"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rank" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="type" type="{http://naesb.org/espi/customer}String256" minOccurs="0"/&gt;
 *         &lt;element name="justification" type="{http://naesb.org/espi/customer}String256" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Priority", propOrder = {
    "rank",
    "type",
    "justification"
})
@Embeddable
public class Priority
    extends java.lang.Object
{

    @XmlElement(required = true)
    @Column(name="_rank")
    protected BigInteger rank;

    @Column(name="type")
    protected String type;

    @Column(name="justification")
    protected String justification;

    /**
     * Gets the value of the rank property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRank(BigInteger value) {
        this.rank = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the justification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustification() {
        return justification;
    }

    /**
     * Sets the value of the justification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustification(String value) {
        this.justification = value;
    }

}
