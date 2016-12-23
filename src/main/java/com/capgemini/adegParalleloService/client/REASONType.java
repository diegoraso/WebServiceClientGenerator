
package com.capgemini.adegParalleloService.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REASONType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REASONType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIP_ERR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="REASON-CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REASONType", propOrder = {
    "tiperr",
    "reasoncode"
})
public class REASONType {

    @XmlElement(name = "TIP_ERR", required = true)
    protected String tiperr;
    @XmlElement(name = "REASON-CODE", required = true)
    protected String reasoncode;

    /**
     * Gets the value of the tiperr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPERR() {
        return tiperr;
    }

    /**
     * Sets the value of the tiperr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPERR(String value) {
        this.tiperr = value;
    }

    /**
     * Gets the value of the reasoncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREASONCODE() {
        return reasoncode;
    }

    /**
     * Sets the value of the reasoncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREASONCODE(String value) {
        this.reasoncode = value;
    }

}
