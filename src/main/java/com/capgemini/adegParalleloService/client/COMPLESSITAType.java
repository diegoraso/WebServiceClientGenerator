
package com.capgemini.adegParalleloService.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COMPLESSITAType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COMPLESSITAType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COMPLEX-SOGLIA-20">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COMPLEX-PERC-20">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COMPLEX-SOGLIA-40">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COMPLEX-PERC-40">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
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
@XmlType(name = "COMPLESSITAType", propOrder = {
    "complexsoglia20",
    "complexperc20",
    "complexsoglia40",
    "complexperc40"
})
public class COMPLESSITAType {

    @XmlElement(name = "COMPLEX-SOGLIA-20", required = true)
    protected BigDecimal complexsoglia20;
    @XmlElement(name = "COMPLEX-PERC-20", required = true)
    protected BigDecimal complexperc20;
    @XmlElement(name = "COMPLEX-SOGLIA-40", required = true)
    protected BigDecimal complexsoglia40;
    @XmlElement(name = "COMPLEX-PERC-40", required = true)
    protected BigDecimal complexperc40;

    /**
     * Gets the value of the complexsoglia20 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCOMPLEXSOGLIA20() {
        return complexsoglia20;
    }

    /**
     * Sets the value of the complexsoglia20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCOMPLEXSOGLIA20(BigDecimal value) {
        this.complexsoglia20 = value;
    }

    /**
     * Gets the value of the complexperc20 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCOMPLEXPERC20() {
        return complexperc20;
    }

    /**
     * Sets the value of the complexperc20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCOMPLEXPERC20(BigDecimal value) {
        this.complexperc20 = value;
    }

    /**
     * Gets the value of the complexsoglia40 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCOMPLEXSOGLIA40() {
        return complexsoglia40;
    }

    /**
     * Sets the value of the complexsoglia40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCOMPLEXSOGLIA40(BigDecimal value) {
        this.complexsoglia40 = value;
    }

    /**
     * Gets the value of the complexperc40 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCOMPLEXPERC40() {
        return complexperc40;
    }

    /**
     * Sets the value of the complexperc40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCOMPLEXPERC40(BigDecimal value) {
        this.complexperc40 = value;
    }

}
