
package com.capgemini.adegParalleloService.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HEAD-INFO-TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HEAD-INFO-TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idChiamata" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HEAD-INFO-TYPE", propOrder = {
    "idChiamata"
})
public class HEADINFOTYPE {

    @XmlElement(required = true)
    protected String idChiamata;

    /**
     * Gets the value of the idChiamata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdChiamata() {
        return idChiamata;
    }

    /**
     * Sets the value of the idChiamata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdChiamata(String value) {
        this.idChiamata = value;
    }

}
