//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.31 at 10:29:41 AM IST 
//


package com.londonhydro.datamigration.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="electricity"/&gt;
 *     &lt;enumeration value="gas"/&gt;
 *     &lt;enumeration value="water"/&gt;
 *     &lt;enumeration value="time"/&gt;
 *     &lt;enumeration value="heat"/&gt;
 *     &lt;enumeration value="refuse"/&gt;
 *     &lt;enumeration value="sewerage"/&gt;
 *     &lt;enumeration value="rates"/&gt;
 *     &lt;enumeration value="tvLicence"/&gt;
 *     &lt;enumeration value="internet"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceKind")
@XmlEnum
public enum ServiceKind {


    /**
     * Electricity service.
     * 
     */
    @XmlEnumValue("electricity")
    ELECTRICITY("electricity"),

    /**
     * Gas service.
     * 
     */
    @XmlEnumValue("gas")
    GAS("gas"),

    /**
     * Water service.
     * 
     */
    @XmlEnumValue("water")
    WATER("water"),

    /**
     * Time service.
     * 
     */
    @XmlEnumValue("time")
    TIME("time"),

    /**
     * Heat service.
     * 
     */
    @XmlEnumValue("heat")
    HEAT("heat"),

    /**
     * Refuse (waster) service.
     * 
     */
    @XmlEnumValue("refuse")
    REFUSE("refuse"),

    /**
     * Sewerage service.
     * 
     */
    @XmlEnumValue("sewerage")
    SEWERAGE("sewerage"),

    /**
     * Rates (e.g. tax, charge, toll, duty, tariff, etc.) service.
     * 
     */
    @XmlEnumValue("rates")
    RATES("rates"),

    /**
     * TV license service.
     * 
     */
    @XmlEnumValue("tvLicence")
    TV_LICENCE("tvLicence"),

    /**
     * Internet service.
     * 
     */
    @XmlEnumValue("internet")
    INTERNET("internet"),

    /**
     * Other kind of service.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ServiceKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceKind fromValue(String v) {
        for (ServiceKind c: ServiceKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
