
package com.capgemini.adegParalleloService.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SOGLIEType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SOGLIEType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RISERVA-REALE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="18"/>
 *               &lt;fractionDigits value="3"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RISERVA-MODIF">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="18"/>
 *               &lt;fractionDigits value="3"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SOGLIA-RISERVA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="18"/>
 *               &lt;fractionDigits value="3"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SOGLIA-SPESA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="18"/>
 *               &lt;fractionDigits value="3"/>
 *               &lt;minInclusive value="0"/>
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
@XmlType(name = "SOGLIEType", propOrder = {
    "riservareale",
    "riservamodif",
    "sogliariserva",
    "sogliaspesa"
})
public class SOGLIEType {

    @XmlElement(name = "RISERVA-REALE", required = true)
    protected BigDecimal riservareale;
    @XmlElement(name = "RISERVA-MODIF", required = true)
    protected BigDecimal riservamodif;
    @XmlElement(name = "SOGLIA-RISERVA", required = true)
    protected BigDecimal sogliariserva;
    @XmlElement(name = "SOGLIA-SPESA", required = true)
    protected BigDecimal sogliaspesa;

    /**
     * Gets the value of the riservareale property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRISERVAREALE() {
        return riservareale;
    }

    /**
     * Sets the value of the riservareale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRISERVAREALE(BigDecimal value) {
        this.riservareale = value;
    }

    /**
     * Gets the value of the riservamodif property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRISERVAMODIF() {
        return riservamodif;
    }

    /**
     * Sets the value of the riservamodif property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRISERVAMODIF(BigDecimal value) {
        this.riservamodif = value;
    }

    /**
     * Gets the value of the sogliariserva property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSOGLIARISERVA() {
        return sogliariserva;
    }

    /**
     * Sets the value of the sogliariserva property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSOGLIARISERVA(BigDecimal value) {
        this.sogliariserva = value;
    }

    /**
     * Gets the value of the sogliaspesa property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSOGLIASPESA() {
        return sogliaspesa;
    }

    /**
     * Sets the value of the sogliaspesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSOGLIASPESA(BigDecimal value) {
        this.sogliaspesa = value;
    }

}
