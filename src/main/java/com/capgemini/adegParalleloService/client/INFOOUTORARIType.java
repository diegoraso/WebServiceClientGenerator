
package com.capgemini.adegParalleloService.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INFO-OUT-ORARIType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INFO-OUT-ORARIType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MSEC-INI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="19"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MSEC-INI-F" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MSEC-END">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="19"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INFO-OUT-ORARIType", propOrder = {
    "msecini",
    "msecinif",
    "msecend"
})
public class INFOOUTORARIType {

    @XmlElement(name = "MSEC-INI", required = true)
    protected String msecini;
    @XmlElement(name = "MSEC-INI-F", required = true)
    protected String msecinif;
    @XmlElement(name = "MSEC-END", required = true)
    protected String msecend;

    /**
     * Gets the value of the msecini property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSECINI() {
        return msecini;
    }

    /**
     * Sets the value of the msecini property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSECINI(String value) {
        this.msecini = value;
    }

    /**
     * Gets the value of the msecinif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSECINIF() {
        return msecinif;
    }

    /**
     * Sets the value of the msecinif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSECINIF(String value) {
        this.msecinif = value;
    }

    /**
     * Gets the value of the msecend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSECEND() {
        return msecend;
    }

    /**
     * Sets the value of the msecend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSECEND(String value) {
        this.msecend = value;
    }

}
