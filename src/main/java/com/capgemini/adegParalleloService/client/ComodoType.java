
package com.capgemini.adegParalleloService.client;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Comodo-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Comodo-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FILL1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="REQ_DUMP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NSG-ORDINANTE" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="FILL2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Comodo-Type", propOrder = {
    "fill1",
    "reqdump",
    "nsgordinante",
    "fill2"
})
public class ComodoType {

    @XmlElement(name = "FILL1", required = true)
    protected String fill1;
    @XmlElement(name = "REQ_DUMP", required = true)
    protected String reqdump;
    @XmlElement(name = "NSG-ORDINANTE", required = true)
    protected BigInteger nsgordinante;
    @XmlElement(name = "FILL2", required = true)
    protected String fill2;

    /**
     * Gets the value of the fill1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFILL1() {
        return fill1;
    }

    /**
     * Sets the value of the fill1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFILL1(String value) {
        this.fill1 = value;
    }

    /**
     * Gets the value of the reqdump property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREQDUMP() {
        return reqdump;
    }

    /**
     * Sets the value of the reqdump property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREQDUMP(String value) {
        this.reqdump = value;
    }

    /**
     * Gets the value of the nsgordinante property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNSGORDINANTE() {
        return nsgordinante;
    }

    /**
     * Sets the value of the nsgordinante property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNSGORDINANTE(BigInteger value) {
        this.nsgordinante = value;
    }

    /**
     * Gets the value of the fill2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFILL2() {
        return fill2;
    }

    /**
     * Sets the value of the fill2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFILL2(String value) {
        this.fill2 = value;
    }

}
