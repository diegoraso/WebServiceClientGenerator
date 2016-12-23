
package com.capgemini.adegParalleloService.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIQU-FLEXType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIQU-FLEXType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NO-X-FLEX">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SOGLIA-NON-FLEX">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="6"/>
 *               &lt;fractionDigits value="3"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PERC-NON-FLEX">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="6"/>
 *               &lt;fractionDigits value="3"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NO-X-LIQU" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FILLER2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIQU-FLEXType", propOrder = {
    "noxflex",
    "soglianonflex",
    "percnonflex",
    "noxliqu",
    "filler2"
})
public class LIQUFLEXType {

    @XmlElement(name = "NO-X-FLEX", required = true)
    protected String noxflex;
    @XmlElement(name = "SOGLIA-NON-FLEX", required = true)
    protected BigDecimal soglianonflex;
    @XmlElement(name = "PERC-NON-FLEX", required = true)
    protected BigDecimal percnonflex;
    @XmlElement(name = "NO-X-LIQU", required = true)
    protected String noxliqu;
    @XmlElement(name = "FILLER2", required = true)
    protected String filler2;

    /**
     * Gets the value of the noxflex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOXFLEX() {
        return noxflex;
    }

    /**
     * Sets the value of the noxflex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOXFLEX(String value) {
        this.noxflex = value;
    }

    /**
     * Gets the value of the soglianonflex property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSOGLIANONFLEX() {
        return soglianonflex;
    }

    /**
     * Sets the value of the soglianonflex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSOGLIANONFLEX(BigDecimal value) {
        this.soglianonflex = value;
    }

    /**
     * Gets the value of the percnonflex property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPERCNONFLEX() {
        return percnonflex;
    }

    /**
     * Sets the value of the percnonflex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPERCNONFLEX(BigDecimal value) {
        this.percnonflex = value;
    }

    /**
     * Gets the value of the noxliqu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOXLIQU() {
        return noxliqu;
    }

    /**
     * Sets the value of the noxliqu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOXLIQU(String value) {
        this.noxliqu = value;
    }

    /**
     * Gets the value of the filler2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFILLER2() {
        return filler2;
    }

    /**
     * Sets the value of the filler2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFILLER2(String value) {
        this.filler2 = value;
    }

}
