
package com.capgemini.adegParalleloService.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpePac-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpePac-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IND-OPER">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CTV-RIS-RED" type="{http://www.accenture.com/ADEG0/WSADEG1/}CTV-RIS-PAC-Type"/>
 *         &lt;element name="PAC-FIL">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
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
@XmlType(name = "OpePac-Type", propOrder = {
    "indoper",
    "ctvrisred",
    "pacfil"
})
public class OpePacType {

    @XmlElement(name = "IND-OPER", required = true)
    protected String indoper;
    @XmlElement(name = "CTV-RIS-RED", required = true)
    protected CTVRISPACType ctvrisred;
    @XmlElement(name = "PAC-FIL", required = true)
    protected String pacfil;

    /**
     * Gets the value of the indoper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDOPER() {
        return indoper;
    }

    /**
     * Sets the value of the indoper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDOPER(String value) {
        this.indoper = value;
    }

    /**
     * Gets the value of the ctvrisred property.
     * 
     * @return
     *     possible object is
     *     {@link CTVRISPACType }
     *     
     */
    public CTVRISPACType getCTVRISRED() {
        return ctvrisred;
    }

    /**
     * Sets the value of the ctvrisred property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTVRISPACType }
     *     
     */
    public void setCTVRISRED(CTVRISPACType value) {
        this.ctvrisred = value;
    }

    /**
     * Gets the value of the pacfil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPACFIL() {
        return pacfil;
    }

    /**
     * Sets the value of the pacfil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPACFIL(String value) {
        this.pacfil = value;
    }

}
