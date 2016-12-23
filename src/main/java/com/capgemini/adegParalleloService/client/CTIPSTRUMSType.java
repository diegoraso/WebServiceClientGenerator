
package com.capgemini.adegParalleloService.client;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CTIPSTRUM-S-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTIPSTRUM-S-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COD-ENTITA-S" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="COD-GRUPPO-S" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="COD-SGRUPPO-S" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTIPSTRUM-S-Type", propOrder = {
    "codentitas",
    "codgruppos",
    "codsgruppos"
})
public class CTIPSTRUMSType {

    @XmlElement(name = "COD-ENTITA-S", required = true)
    protected BigInteger codentitas;
    @XmlElement(name = "COD-GRUPPO-S", required = true)
    protected BigInteger codgruppos;
    @XmlElement(name = "COD-SGRUPPO-S", required = true)
    protected BigInteger codsgruppos;

    /**
     * Gets the value of the codentitas property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCODENTITAS() {
        return codentitas;
    }

    /**
     * Sets the value of the codentitas property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCODENTITAS(BigInteger value) {
        this.codentitas = value;
    }

    /**
     * Gets the value of the codgruppos property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCODGRUPPOS() {
        return codgruppos;
    }

    /**
     * Sets the value of the codgruppos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCODGRUPPOS(BigInteger value) {
        this.codgruppos = value;
    }

    /**
     * Gets the value of the codsgruppos property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCODSGRUPPOS() {
        return codsgruppos;
    }

    /**
     * Sets the value of the codsgruppos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCODSGRUPPOS(BigInteger value) {
        this.codsgruppos = value;
    }

}
