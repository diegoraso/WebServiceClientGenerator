
package com.capgemini.adegParalleloService.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CTV-RIS-PAC-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTV-RIS-PAC-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SEG-RIS-PAC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IMP-RIS-PAC">
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
@XmlType(name = "CTV-RIS-PAC-Type", propOrder = {
    "segrispac",
    "imprispac"
})
public class CTVRISPACType {

    @XmlElement(name = "SEG-RIS-PAC", required = true)
    protected String segrispac;
    @XmlElement(name = "IMP-RIS-PAC", required = true)
    protected BigDecimal imprispac;

    /**
     * Gets the value of the segrispac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGRISPAC() {
        return segrispac;
    }

    /**
     * Sets the value of the segrispac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGRISPAC(String value) {
        this.segrispac = value;
    }

    /**
     * Gets the value of the imprispac property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIMPRISPAC() {
        return imprispac;
    }

    /**
     * Sets the value of the imprispac property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIMPRISPAC(BigDecimal value) {
        this.imprispac = value;
    }

}
