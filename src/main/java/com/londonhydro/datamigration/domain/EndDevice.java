//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.31 at 10:29:41 AM IST 
//


package com.londonhydro.datamigration.domain;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Asset container that performs one or more end device functions. One type of end device is a meter which can perform metering, load management, connect/disconnect, accounting functions, etc. Some end devices, such as ones monitoring and controlling air conditioners, refrigerators, pool pumps may be connected to a meter. All end devices may have communication capability defined by the associated communication function(s). An end device may be owned by a consumer, a service provider, utility or otherwise.
 * There may be a related end device function that identifies a sensor or control point within a metering application or communications systems (e.g., water, gas, electricity).
 * Some devices may use an optical port that conforms to the ANSI C12.18 standard for communications.
 * 
 * <p>Java class for EndDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndDevice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://naesb.org/espi/customer}AssetContainer"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isVirtual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isPan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="installCode" type="{http://naesb.org/espi/customer}String256" minOccurs="0"/&gt;
 *         &lt;element name="amrSystem" type="{http://naesb.org/espi/customer}String256" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndDevice", propOrder = {
    "isVirtual",
    "isPan",
    "installCode",
    "amrSystem"
})
@XmlSeeAlso({
    Meter.class
})
@MappedSuperclass
public class EndDevice
    extends AssetContainer
{

    @Column(name="is_virtual")
    protected Boolean isVirtual;

    @Column(name="is_pan")
    protected Boolean isPan;

    @Column(name="install_code")
    protected String installCode;

    @Column(name="amr_system")
    protected String amrSystem;

    /**
     * Gets the value of the isVirtual property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsVirtual() {
        return isVirtual;
    }

    /**
     * Sets the value of the isVirtual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsVirtual(Boolean value) {
        this.isVirtual = value;
    }

    /**
     * Gets the value of the isPan property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPan() {
        return isPan;
    }

    /**
     * Sets the value of the isPan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPan(Boolean value) {
        this.isPan = value;
    }

    /**
     * Gets the value of the installCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallCode() {
        return installCode;
    }

    /**
     * Sets the value of the installCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallCode(String value) {
        this.installCode = value;
    }

    /**
     * Gets the value of the amrSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmrSystem() {
        return amrSystem;
    }

    /**
     * Sets the value of the amrSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmrSystem(String value) {
        this.amrSystem = value;
    }

}
