
package com.capgemini.adegParalleloService.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CTV-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTV-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CTV-SEG">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CTV-IMP">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="18"/>
 *               &lt;fractionDigits value="3"/>
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
@XmlType(name = "CTV-Type", propOrder = {
    "ctvseg",
    "ctvimp"
})
public class CTVType {

    @XmlElement(name = "CTV-SEG", required = true)
    protected String ctvseg;
    @XmlElement(name = "CTV-IMP", required = true)
    protected BigDecimal ctvimp;

    /**
     * Gets the value of the ctvseg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTVSEG() {
        return ctvseg;
    }

    /**
     * Sets the value of the ctvseg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTVSEG(String value) {
        this.ctvseg = value;
    }

    /**
     * Gets the value of the ctvimp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCTVIMP() {
        return ctvimp;
    }

    /**
     * Sets the value of the ctvimp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCTVIMP(BigDecimal value) {
        this.ctvimp = value;
    }

}
