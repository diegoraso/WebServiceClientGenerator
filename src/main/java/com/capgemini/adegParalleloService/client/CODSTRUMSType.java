
package com.capgemini.adegParalleloService.client;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CODSTRUM-S-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CODSTRUM-S-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODSTRUM-S-AF" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="CODSTRUM-S-FILL">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="9"/>
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
@XmlType(name = "CODSTRUM-S-Type", propOrder = {
    "codstrumsaf",
    "codstrumsfill"
})
public class CODSTRUMSType {

    @XmlElement(name = "CODSTRUM-S-AF", required = true)
    protected BigInteger codstrumsaf;
    @XmlElement(name = "CODSTRUM-S-FILL", required = true)
    protected String codstrumsfill;

    /**
     * Gets the value of the codstrumsaf property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCODSTRUMSAF() {
        return codstrumsaf;
    }

    /**
     * Sets the value of the codstrumsaf property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCODSTRUMSAF(BigInteger value) {
        this.codstrumsaf = value;
    }

    /**
     * Gets the value of the codstrumsfill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODSTRUMSFILL() {
        return codstrumsfill;
    }

    /**
     * Sets the value of the codstrumsfill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODSTRUMSFILL(String value) {
        this.codstrumsfill = value;
    }

}
