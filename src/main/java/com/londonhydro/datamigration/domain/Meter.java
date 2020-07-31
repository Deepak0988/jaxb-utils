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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Physical asset that performs the metering role of the usage point. Used for measuring consumption and detection of events.
 * 
 * <p>Java class for Meter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Meter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://naesb.org/espi/customer}EndDevice"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="formNumber" type="{http://naesb.org/espi/customer}String256" minOccurs="0"/&gt;
 *         &lt;element name="MeterMultipliers" type="{http://naesb.org/espi/customer}MeterMultiplier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="intervalLength" type="{http://naesb.org/espi/customer}UInt32" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Meter", propOrder = {
    "formNumber",
    "meterMultipliers",
    "intervalLength"
})
public class Meter
    extends EndDevice
{

    protected String formNumber;
    @XmlElement(name = "MeterMultipliers")
    protected List<MeterMultiplier> meterMultipliers;
    @XmlSchemaType(name = "unsignedInt")
    protected Long intervalLength;

    /**
     * Gets the value of the formNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormNumber() {
        return formNumber;
    }

    /**
     * Sets the value of the formNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormNumber(String value) {
        this.formNumber = value;
    }

    /**
     * Gets the value of the meterMultipliers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meterMultipliers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeterMultipliers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeterMultiplier }
     * 
     * 
     */
    public List<MeterMultiplier> getMeterMultipliers() {
        if (meterMultipliers == null) {
            meterMultipliers = new ArrayList<MeterMultiplier>();
        }
        return this.meterMultipliers;
    }

    /**
     * Gets the value of the intervalLength property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIntervalLength() {
        return intervalLength;
    }

    /**
     * Sets the value of the intervalLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIntervalLength(Long value) {
        this.intervalLength = value;
    }

}
