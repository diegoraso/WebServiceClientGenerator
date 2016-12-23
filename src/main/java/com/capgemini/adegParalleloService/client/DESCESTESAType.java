
package com.capgemini.adegParalleloService.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DESC-ESTESAType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DESC-ESTESAType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DESC-ESTESA-L">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;maxInclusive value="9999"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DESC-ESTESA-T" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DESC-ESTESAType", propOrder = {
    "descestesal",
    "descestesat"
})
public class DESCESTESAType {

    @XmlElement(name = "DESC-ESTESA-L")
    protected int descestesal;
    @XmlElement(name = "DESC-ESTESA-T", required = true)
    protected String descestesat;

    /**
     * Gets the value of the descestesal property.
     * 
     */
    public int getDESCESTESAL() {
        return descestesal;
    }

    /**
     * Sets the value of the descestesal property.
     * 
     */
    public void setDESCESTESAL(int value) {
        this.descestesal = value;
    }

    /**
     * Gets the value of the descestesat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCESTESAT() {
        return descestesat;
    }

    /**
     * Sets the value of the descestesat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCESTESAT(String value) {
        this.descestesat = value;
    }

}
