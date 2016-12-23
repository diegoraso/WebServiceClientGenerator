
package com.capgemini.adegParalleloService.client;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NUM-PROPOSTA-ABC-X-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NUM-PROPOSTA-ABC-X-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUM-PROPOSTA-ABC-S" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NUM-PROPOSTA-ABC-N" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NUM-PROPOSTA-ABC-X-Type", propOrder = {
    "numpropostaabcs",
    "numpropostaabcn"
})
public class NUMPROPOSTAABCXType {

    @XmlElement(name = "NUM-PROPOSTA-ABC-S", required = true)
    protected String numpropostaabcs;
    @XmlElement(name = "NUM-PROPOSTA-ABC-N", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger numpropostaabcn;

    /**
     * Gets the value of the numpropostaabcs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMPROPOSTAABCS() {
        return numpropostaabcs;
    }

    /**
     * Sets the value of the numpropostaabcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMPROPOSTAABCS(String value) {
        this.numpropostaabcs = value;
    }

    /**
     * Gets the value of the numpropostaabcn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNUMPROPOSTAABCN() {
        return numpropostaabcn;
    }

    /**
     * Sets the value of the numpropostaabcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNUMPROPOSTAABCN(BigInteger value) {
        this.numpropostaabcn = value;
    }

}
