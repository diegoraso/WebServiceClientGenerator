
package com.capgemini.adegParalleloService.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodRapp-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodRapp-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODRAPP-FIL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODRAPP-CAT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODRAPP-RAP" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodRapp-Type", propOrder = {
    "codrappfil",
    "codrappcat",
    "codrapprap"
})
public class CodRappType {

    @XmlElement(name = "CODRAPP-FIL", required = true)
    protected String codrappfil;
    @XmlElement(name = "CODRAPP-CAT", required = true)
    protected String codrappcat;
    @XmlElement(name = "CODRAPP-RAP")
    protected long codrapprap;

    /**
     * Gets the value of the codrappfil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODRAPPFIL() {
        return codrappfil;
    }

    /**
     * Sets the value of the codrappfil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODRAPPFIL(String value) {
        this.codrappfil = value;
    }

    /**
     * Gets the value of the codrappcat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODRAPPCAT() {
        return codrappcat;
    }

    /**
     * Sets the value of the codrappcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODRAPPCAT(String value) {
        this.codrappcat = value;
    }

    /**
     * Gets the value of the codrapprap property.
     * 
     */
    public long getCODRAPPRAP() {
        return codrapprap;
    }

    /**
     * Sets the value of the codrapprap property.
     * 
     */
    public void setCODRAPPRAP(long value) {
        this.codrapprap = value;
    }

}
