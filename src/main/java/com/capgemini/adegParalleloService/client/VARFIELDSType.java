
package com.capgemini.adegParalleloService.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VAR-FIELDSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VAR-FIELDSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LABEL-VOL-REA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VALUE-VOL-REA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="14"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LABEL-VOL-REA-SIS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VALUE-VOL-REA-SIS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="14"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LABEL-VOL-REA-IBF">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VALUE-VOL-REA-IBF">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="14"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LABEL-VOL-REA-IBO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VALUE-VOL-REA-IBO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="14"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LABEL-VOL-REA-IBD">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VALUE-VOL-REA-IBD">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="14"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LABEL-VOL-REA-OPZ">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VALUE-VOL-REA-OPZ">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="14"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LABEL-VOL-OPE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VALUE-VOL-OPE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="14"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LABEL-VOL-OPE-SIS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VALUE-VOL-OPE-SIS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="14"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LABEL-VOL-OPE-IBF">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VALUE-VOL-OPE-IBF">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="14"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LABEL-VOL-OPE-IBO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VALUE-VOL-OPE-IBO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="14"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LABEL-VOL-OPE-IBD">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VALUE-VOL-OPE-IBD">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="14"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LABEL-VOL-OPE-OPZ">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VALUE-VOL-OPE-OPZ">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="14"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LABEL-VOL-MOD">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VALUE-VOL-MOD">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="14"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LABEL-CTV-PTF-REA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VALUE-CTV-PTF-REA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="14"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LABEL-CTV-PTF-MOD">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VALUE-CTV-PTF-MOD">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="14"/>
 *               &lt;whiteSpace value="collapse"/>
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
@XmlType(name = "VAR-FIELDSType", propOrder = {
    "labelvolrea",
    "valuevolrea",
    "labelvolreasis",
    "valuevolreasis",
    "labelvolreaibf",
    "valuevolreaibf",
    "labelvolreaibo",
    "valuevolreaibo",
    "labelvolreaibd",
    "valuevolreaibd",
    "labelvolreaopz",
    "valuevolreaopz",
    "labelvolope",
    "valuevolope",
    "labelvolopesis",
    "valuevolopesis",
    "labelvolopeibf",
    "valuevolopeibf",
    "labelvolopeibo",
    "valuevolopeibo",
    "labelvolopeibd",
    "valuevolopeibd",
    "labelvolopeopz",
    "valuevolopeopz",
    "labelvolmod",
    "valuevolmod",
    "labelctvptfrea",
    "valuectvptfrea",
    "labelctvptfmod",
    "valuectvptfmod"
})
public class VARFIELDSType {

    @XmlElement(name = "LABEL-VOL-REA", required = true)
    protected String labelvolrea;
    @XmlElement(name = "VALUE-VOL-REA", required = true)
    protected String valuevolrea;
    @XmlElement(name = "LABEL-VOL-REA-SIS", required = true)
    protected String labelvolreasis;
    @XmlElement(name = "VALUE-VOL-REA-SIS", required = true)
    protected String valuevolreasis;
    @XmlElement(name = "LABEL-VOL-REA-IBF", required = true)
    protected String labelvolreaibf;
    @XmlElement(name = "VALUE-VOL-REA-IBF", required = true)
    protected String valuevolreaibf;
    @XmlElement(name = "LABEL-VOL-REA-IBO", required = true)
    protected String labelvolreaibo;
    @XmlElement(name = "VALUE-VOL-REA-IBO", required = true)
    protected String valuevolreaibo;
    @XmlElement(name = "LABEL-VOL-REA-IBD", required = true)
    protected String labelvolreaibd;
    @XmlElement(name = "VALUE-VOL-REA-IBD", required = true)
    protected String valuevolreaibd;
    @XmlElement(name = "LABEL-VOL-REA-OPZ", required = true)
    protected String labelvolreaopz;
    @XmlElement(name = "VALUE-VOL-REA-OPZ", required = true)
    protected String valuevolreaopz;
    @XmlElement(name = "LABEL-VOL-OPE", required = true)
    protected String labelvolope;
    @XmlElement(name = "VALUE-VOL-OPE", required = true)
    protected String valuevolope;
    @XmlElement(name = "LABEL-VOL-OPE-SIS", required = true)
    protected String labelvolopesis;
    @XmlElement(name = "VALUE-VOL-OPE-SIS", required = true)
    protected String valuevolopesis;
    @XmlElement(name = "LABEL-VOL-OPE-IBF", required = true)
    protected String labelvolopeibf;
    @XmlElement(name = "VALUE-VOL-OPE-IBF", required = true)
    protected String valuevolopeibf;
    @XmlElement(name = "LABEL-VOL-OPE-IBO", required = true)
    protected String labelvolopeibo;
    @XmlElement(name = "VALUE-VOL-OPE-IBO", required = true)
    protected String valuevolopeibo;
    @XmlElement(name = "LABEL-VOL-OPE-IBD", required = true)
    protected String labelvolopeibd;
    @XmlElement(name = "VALUE-VOL-OPE-IBD", required = true)
    protected String valuevolopeibd;
    @XmlElement(name = "LABEL-VOL-OPE-OPZ", required = true)
    protected String labelvolopeopz;
    @XmlElement(name = "VALUE-VOL-OPE-OPZ", required = true)
    protected String valuevolopeopz;
    @XmlElement(name = "LABEL-VOL-MOD", required = true)
    protected String labelvolmod;
    @XmlElement(name = "VALUE-VOL-MOD", required = true)
    protected String valuevolmod;
    @XmlElement(name = "LABEL-CTV-PTF-REA", required = true)
    protected String labelctvptfrea;
    @XmlElement(name = "VALUE-CTV-PTF-REA", required = true)
    protected String valuectvptfrea;
    @XmlElement(name = "LABEL-CTV-PTF-MOD", required = true)
    protected String labelctvptfmod;
    @XmlElement(name = "VALUE-CTV-PTF-MOD", required = true)
    protected String valuectvptfmod;

    /**
     * Gets the value of the labelvolrea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLABELVOLREA() {
        return labelvolrea;
    }

    /**
     * Sets the value of the labelvolrea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLABELVOLREA(String value) {
        this.labelvolrea = value;
    }

    /**
     * Gets the value of the valuevolrea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALUEVOLREA() {
        return valuevolrea;
    }

    /**
     * Sets the value of the valuevolrea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALUEVOLREA(String value) {
        this.valuevolrea = value;
    }

    /**
     * Gets the value of the labelvolreasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLABELVOLREASIS() {
        return labelvolreasis;
    }

    /**
     * Sets the value of the labelvolreasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLABELVOLREASIS(String value) {
        this.labelvolreasis = value;
    }

    /**
     * Gets the value of the valuevolreasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALUEVOLREASIS() {
        return valuevolreasis;
    }

    /**
     * Sets the value of the valuevolreasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALUEVOLREASIS(String value) {
        this.valuevolreasis = value;
    }

    /**
     * Gets the value of the labelvolreaibf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLABELVOLREAIBF() {
        return labelvolreaibf;
    }

    /**
     * Sets the value of the labelvolreaibf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLABELVOLREAIBF(String value) {
        this.labelvolreaibf = value;
    }

    /**
     * Gets the value of the valuevolreaibf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALUEVOLREAIBF() {
        return valuevolreaibf;
    }

    /**
     * Sets the value of the valuevolreaibf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALUEVOLREAIBF(String value) {
        this.valuevolreaibf = value;
    }

    /**
     * Gets the value of the labelvolreaibo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLABELVOLREAIBO() {
        return labelvolreaibo;
    }

    /**
     * Sets the value of the labelvolreaibo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLABELVOLREAIBO(String value) {
        this.labelvolreaibo = value;
    }

    /**
     * Gets the value of the valuevolreaibo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALUEVOLREAIBO() {
        return valuevolreaibo;
    }

    /**
     * Sets the value of the valuevolreaibo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALUEVOLREAIBO(String value) {
        this.valuevolreaibo = value;
    }

    /**
     * Gets the value of the labelvolreaibd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLABELVOLREAIBD() {
        return labelvolreaibd;
    }

    /**
     * Sets the value of the labelvolreaibd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLABELVOLREAIBD(String value) {
        this.labelvolreaibd = value;
    }

    /**
     * Gets the value of the valuevolreaibd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALUEVOLREAIBD() {
        return valuevolreaibd;
    }

    /**
     * Sets the value of the valuevolreaibd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALUEVOLREAIBD(String value) {
        this.valuevolreaibd = value;
    }

    /**
     * Gets the value of the labelvolreaopz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLABELVOLREAOPZ() {
        return labelvolreaopz;
    }

    /**
     * Sets the value of the labelvolreaopz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLABELVOLREAOPZ(String value) {
        this.labelvolreaopz = value;
    }

    /**
     * Gets the value of the valuevolreaopz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALUEVOLREAOPZ() {
        return valuevolreaopz;
    }

    /**
     * Sets the value of the valuevolreaopz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALUEVOLREAOPZ(String value) {
        this.valuevolreaopz = value;
    }

    /**
     * Gets the value of the labelvolope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLABELVOLOPE() {
        return labelvolope;
    }

    /**
     * Sets the value of the labelvolope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLABELVOLOPE(String value) {
        this.labelvolope = value;
    }

    /**
     * Gets the value of the valuevolope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALUEVOLOPE() {
        return valuevolope;
    }

    /**
     * Sets the value of the valuevolope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALUEVOLOPE(String value) {
        this.valuevolope = value;
    }

    /**
     * Gets the value of the labelvolopesis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLABELVOLOPESIS() {
        return labelvolopesis;
    }

    /**
     * Sets the value of the labelvolopesis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLABELVOLOPESIS(String value) {
        this.labelvolopesis = value;
    }

    /**
     * Gets the value of the valuevolopesis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALUEVOLOPESIS() {
        return valuevolopesis;
    }

    /**
     * Sets the value of the valuevolopesis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALUEVOLOPESIS(String value) {
        this.valuevolopesis = value;
    }

    /**
     * Gets the value of the labelvolopeibf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLABELVOLOPEIBF() {
        return labelvolopeibf;
    }

    /**
     * Sets the value of the labelvolopeibf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLABELVOLOPEIBF(String value) {
        this.labelvolopeibf = value;
    }

    /**
     * Gets the value of the valuevolopeibf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALUEVOLOPEIBF() {
        return valuevolopeibf;
    }

    /**
     * Sets the value of the valuevolopeibf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALUEVOLOPEIBF(String value) {
        this.valuevolopeibf = value;
    }

    /**
     * Gets the value of the labelvolopeibo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLABELVOLOPEIBO() {
        return labelvolopeibo;
    }

    /**
     * Sets the value of the labelvolopeibo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLABELVOLOPEIBO(String value) {
        this.labelvolopeibo = value;
    }

    /**
     * Gets the value of the valuevolopeibo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALUEVOLOPEIBO() {
        return valuevolopeibo;
    }

    /**
     * Sets the value of the valuevolopeibo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALUEVOLOPEIBO(String value) {
        this.valuevolopeibo = value;
    }

    /**
     * Gets the value of the labelvolopeibd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLABELVOLOPEIBD() {
        return labelvolopeibd;
    }

    /**
     * Sets the value of the labelvolopeibd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLABELVOLOPEIBD(String value) {
        this.labelvolopeibd = value;
    }

    /**
     * Gets the value of the valuevolopeibd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALUEVOLOPEIBD() {
        return valuevolopeibd;
    }

    /**
     * Sets the value of the valuevolopeibd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALUEVOLOPEIBD(String value) {
        this.valuevolopeibd = value;
    }

    /**
     * Gets the value of the labelvolopeopz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLABELVOLOPEOPZ() {
        return labelvolopeopz;
    }

    /**
     * Sets the value of the labelvolopeopz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLABELVOLOPEOPZ(String value) {
        this.labelvolopeopz = value;
    }

    /**
     * Gets the value of the valuevolopeopz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALUEVOLOPEOPZ() {
        return valuevolopeopz;
    }

    /**
     * Sets the value of the valuevolopeopz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALUEVOLOPEOPZ(String value) {
        this.valuevolopeopz = value;
    }

    /**
     * Gets the value of the labelvolmod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLABELVOLMOD() {
        return labelvolmod;
    }

    /**
     * Sets the value of the labelvolmod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLABELVOLMOD(String value) {
        this.labelvolmod = value;
    }

    /**
     * Gets the value of the valuevolmod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALUEVOLMOD() {
        return valuevolmod;
    }

    /**
     * Sets the value of the valuevolmod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALUEVOLMOD(String value) {
        this.valuevolmod = value;
    }

    /**
     * Gets the value of the labelctvptfrea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLABELCTVPTFREA() {
        return labelctvptfrea;
    }

    /**
     * Sets the value of the labelctvptfrea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLABELCTVPTFREA(String value) {
        this.labelctvptfrea = value;
    }

    /**
     * Gets the value of the valuectvptfrea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALUECTVPTFREA() {
        return valuectvptfrea;
    }

    /**
     * Sets the value of the valuectvptfrea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALUECTVPTFREA(String value) {
        this.valuectvptfrea = value;
    }

    /**
     * Gets the value of the labelctvptfmod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLABELCTVPTFMOD() {
        return labelctvptfmod;
    }

    /**
     * Sets the value of the labelctvptfmod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLABELCTVPTFMOD(String value) {
        this.labelctvptfmod = value;
    }

    /**
     * Gets the value of the valuectvptfmod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALUECTVPTFMOD() {
        return valuectvptfmod;
    }

    /**
     * Sets the value of the valuectvptfmod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALUECTVPTFMOD(String value) {
        this.valuectvptfmod = value;
    }

}
