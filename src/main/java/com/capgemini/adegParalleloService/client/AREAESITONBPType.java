
package com.capgemini.adegParalleloService.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AREA-ESITO-NBPType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AREA-ESITO-NBPType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ESITO-NBP">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ERR-DESC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="132"/>
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
@XmlType(name = "AREA-ESITO-NBPType", propOrder = {
    "esitonbp",
    "errdesc"
})
public class AREAESITONBPType {

    @XmlElement(name = "ESITO-NBP", required = true)
    protected String esitonbp;
    @XmlElement(name = "ERR-DESC", required = true)
    protected String errdesc;

    /**
     * Gets the value of the esitonbp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESITONBP() {
        return esitonbp;
    }

    /**
     * Sets the value of the esitonbp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESITONBP(String value) {
        this.esitonbp = value;
    }

    /**
     * Gets the value of the errdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERRDESC() {
        return errdesc;
    }

    /**
     * Sets the value of the errdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERRDESC(String value) {
        this.errdesc = value;
    }

}
