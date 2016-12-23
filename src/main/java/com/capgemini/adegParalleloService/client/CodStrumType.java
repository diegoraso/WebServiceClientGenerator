
package com.capgemini.adegParalleloService.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodStrum-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodStrum-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODSTRUM-AF" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CODSTRUM-FILL">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
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
@XmlType(name = "CodStrum-Type", propOrder = {
    "codstrumaf",
    "codstrumfill"
})
public class CodStrumType {

    @XmlElement(name = "CODSTRUM-AF")
    protected int codstrumaf;
    @XmlElement(name = "CODSTRUM-FILL", required = true)
    protected String codstrumfill;

    /**
     * Gets the value of the codstrumaf property.
     * 
     */
    public int getCODSTRUMAF() {
        return codstrumaf;
    }

    /**
     * Sets the value of the codstrumaf property.
     * 
     */
    public void setCODSTRUMAF(int value) {
        this.codstrumaf = value;
    }

    /**
     * Gets the value of the codstrumfill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODSTRUMFILL() {
        return codstrumfill;
    }

    /**
     * Sets the value of the codstrumfill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODSTRUMFILL(String value) {
        this.codstrumfill = value;
    }

}
