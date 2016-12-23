
package com.capgemini.adegParalleloService.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Fill1-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fill1-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CTV" type="{http://www.accenture.com/ADEG0/WSADEG1/}CTV-Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fill1-Type", propOrder = {
    "ctv"
})
public class Fill1Type {

    @XmlElement(name = "CTV", required = true)
    protected CTVType ctv;

    /**
     * Gets the value of the ctv property.
     * 
     * @return
     *     possible object is
     *     {@link CTVType }
     *     
     */
    public CTVType getCTV() {
        return ctv;
    }

    /**
     * Sets the value of the ctv property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTVType }
     *     
     */
    public void setCTV(CTVType value) {
        this.ctv = value;
    }

}
