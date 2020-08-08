//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.31 at 10:29:41 AM IST 
//


package com.londonhydro.datamigration.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.*;


/**
 * An aggregated summary measurement reading
 * 
 * <p>Java class for SummaryMeasurement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SummaryMeasurement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://naesb.org/espi/customer}Object"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="powerOfTenMultiplier" type="{http://naesb.org/espi/customer}UnitMultiplierKind" minOccurs="0"/&gt;
 *         &lt;element name="timeStamp" type="{http://naesb.org/espi/customer}TimeType" minOccurs="0"/&gt;
 *         &lt;element name="uom" type="{http://naesb.org/espi/customer}UnitSymbolKind" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://naesb.org/espi/customer}Int48" minOccurs="0"/&gt;
 *         &lt;element name="readingTypeRef" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummaryMeasurement", propOrder = {
    "powerOfTenMultiplier",
    "timeStamp",
    "uom",
    "value",
    "readingTypeRef"
})
@Entity
@Table(name="summary_measurement")
public class SummaryMeasurement
    extends java.lang.Object
{
    @XmlTransient
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column(name="power_of_ten_multiplier")
    protected String powerOfTenMultiplier;

    @Column(name="timestamp")
    protected Long timeStamp;

    @Column(name="uom")
    protected String uom;

    @Column(name="value")
    protected Long value;

    @Column(name="reading_type_ref")
    @XmlSchemaType(name = "anyURI")
    protected String readingTypeRef;

    /**
     * Gets the value of the powerOfTenMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerOfTenMultiplier() {
        return powerOfTenMultiplier;
    }

    /**
     * Sets the value of the powerOfTenMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerOfTenMultiplier(String value) {
        this.powerOfTenMultiplier = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeStamp(Long value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUom(String value) {
        this.uom = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValue(Long value) {
        this.value = value;
    }

    /**
     * Gets the value of the readingTypeRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadingTypeRef() {
        return readingTypeRef;
    }

    /**
     * Sets the value of the readingTypeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadingTypeRef(String value) {
        this.readingTypeRef = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
