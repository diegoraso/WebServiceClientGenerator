
package com.capgemini.adegParalleloService.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TabOpe-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TabOpe-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODSTRUM">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CODSTRUM-RED" type="{http://www.accenture.com/ADEG0/WSADEG1/}CodStrum-Type"/>
 *         &lt;element name="CTIPSTRUM">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CTIPSTRUM-AF" type="{http://www.accenture.com/ADEG0/WSADEG1/}CodTipSstrum-Type"/>
 *         &lt;element name="FLG-TIPO-INPUT">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PRZ">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="18"/>
 *               &lt;fractionDigits value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="QTA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="18"/>
 *               &lt;fractionDigits value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FILL1" type="{http://www.accenture.com/ADEG0/WSADEG1/}Fill1-Type"/>
 *         &lt;element name="DVS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SEGNO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CHIAVEOPER">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HP-FLAG">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HOLDING-PERIOD">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="4"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OPE_PAC" type="{http://www.accenture.com/ADEG0/WSADEG1/}OpePac-Type"/>
 *         &lt;element name="CODSTRUM-S">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CODSTRUM-S-AF" type="{http://www.accenture.com/ADEG0/WSADEG1/}CODSTRUM-S-Type"/>
 *         &lt;element name="CTIPSTRUM-S">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CTIPSTRUM-S-AF" type="{http://www.accenture.com/ADEG0/WSADEG1/}CTIPSTRUM-S-Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TabOpe-Type", propOrder = {
    "codstrum",
    "codstrumred",
    "ctipstrum",
    "ctipstrumaf",
    "flgtipoinput",
    "prz",
    "qta",
    "fill1",
    "dvs",
    "segno",
    "chiaveoper",
    "hpflag",
    "holdingperiod",
    "opepac",
    "codstrums",
    "codstrumsaf",
    "ctipstrums",
    "ctipstrumsaf"
})
public class TabOpeType {

    @XmlElement(name = "CODSTRUM", required = true)
    protected String codstrum;
    @XmlElement(name = "CODSTRUM-RED", required = true)
    protected CodStrumType codstrumred;
    @XmlElement(name = "CTIPSTRUM", required = true)
    protected String ctipstrum;
    @XmlElement(name = "CTIPSTRUM-AF", required = true)
    protected CodTipSstrumType ctipstrumaf;
    @XmlElement(name = "FLG-TIPO-INPUT", required = true)
    protected String flgtipoinput;
    @XmlElement(name = "PRZ", required = true)
    protected BigDecimal prz;
    @XmlElement(name = "QTA", required = true)
    protected BigDecimal qta;
    @XmlElement(name = "FILL1", required = true)
    protected Fill1Type fill1;
    @XmlElement(name = "DVS", required = true)
    protected String dvs;
    @XmlElement(name = "SEGNO", required = true)
    protected String segno;
    @XmlElement(name = "CHIAVEOPER", required = true)
    protected String chiaveoper;
    @XmlElement(name = "HP-FLAG", required = true)
    protected String hpflag;
    @XmlElement(name = "HOLDING-PERIOD", required = true)
    protected BigDecimal holdingperiod;
    @XmlElement(name = "OPE_PAC", required = true)
    protected OpePacType opepac;
    @XmlElement(name = "CODSTRUM-S", required = true)
    protected String codstrums;
    @XmlElement(name = "CODSTRUM-S-AF", required = true)
    protected CODSTRUMSType codstrumsaf;
    @XmlElement(name = "CTIPSTRUM-S", required = true)
    protected String ctipstrums;
    @XmlElement(name = "CTIPSTRUM-S-AF", required = true)
    protected CTIPSTRUMSType ctipstrumsaf;

    /**
     * Gets the value of the codstrum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODSTRUM() {
        return codstrum;
    }

    /**
     * Sets the value of the codstrum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODSTRUM(String value) {
        this.codstrum = value;
    }

    /**
     * Gets the value of the codstrumred property.
     * 
     * @return
     *     possible object is
     *     {@link CodStrumType }
     *     
     */
    public CodStrumType getCODSTRUMRED() {
        return codstrumred;
    }

    /**
     * Sets the value of the codstrumred property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodStrumType }
     *     
     */
    public void setCODSTRUMRED(CodStrumType value) {
        this.codstrumred = value;
    }

    /**
     * Gets the value of the ctipstrum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTIPSTRUM() {
        return ctipstrum;
    }

    /**
     * Sets the value of the ctipstrum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTIPSTRUM(String value) {
        this.ctipstrum = value;
    }

    /**
     * Gets the value of the ctipstrumaf property.
     * 
     * @return
     *     possible object is
     *     {@link CodTipSstrumType }
     *     
     */
    public CodTipSstrumType getCTIPSTRUMAF() {
        return ctipstrumaf;
    }

    /**
     * Sets the value of the ctipstrumaf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodTipSstrumType }
     *     
     */
    public void setCTIPSTRUMAF(CodTipSstrumType value) {
        this.ctipstrumaf = value;
    }

    /**
     * Gets the value of the flgtipoinput property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLGTIPOINPUT() {
        return flgtipoinput;
    }

    /**
     * Sets the value of the flgtipoinput property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLGTIPOINPUT(String value) {
        this.flgtipoinput = value;
    }

    /**
     * Gets the value of the prz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPRZ() {
        return prz;
    }

    /**
     * Sets the value of the prz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPRZ(BigDecimal value) {
        this.prz = value;
    }

    /**
     * Gets the value of the qta property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQTA() {
        return qta;
    }

    /**
     * Sets the value of the qta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQTA(BigDecimal value) {
        this.qta = value;
    }

    /**
     * Gets the value of the fill1 property.
     * 
     * @return
     *     possible object is
     *     {@link Fill1Type }
     *     
     */
    public Fill1Type getFILL1() {
        return fill1;
    }

    /**
     * Sets the value of the fill1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fill1Type }
     *     
     */
    public void setFILL1(Fill1Type value) {
        this.fill1 = value;
    }

    /**
     * Gets the value of the dvs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDVS() {
        return dvs;
    }

    /**
     * Sets the value of the dvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDVS(String value) {
        this.dvs = value;
    }

    /**
     * Gets the value of the segno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGNO() {
        return segno;
    }

    /**
     * Sets the value of the segno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGNO(String value) {
        this.segno = value;
    }

    /**
     * Gets the value of the chiaveoper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHIAVEOPER() {
        return chiaveoper;
    }

    /**
     * Sets the value of the chiaveoper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHIAVEOPER(String value) {
        this.chiaveoper = value;
    }

    /**
     * Gets the value of the hpflag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHPFLAG() {
        return hpflag;
    }

    /**
     * Sets the value of the hpflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHPFLAG(String value) {
        this.hpflag = value;
    }

    /**
     * Gets the value of the holdingperiod property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHOLDINGPERIOD() {
        return holdingperiod;
    }

    /**
     * Sets the value of the holdingperiod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHOLDINGPERIOD(BigDecimal value) {
        this.holdingperiod = value;
    }

    /**
     * Gets the value of the opepac property.
     * 
     * @return
     *     possible object is
     *     {@link OpePacType }
     *     
     */
    public OpePacType getOPEPAC() {
        return opepac;
    }

    /**
     * Sets the value of the opepac property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpePacType }
     *     
     */
    public void setOPEPAC(OpePacType value) {
        this.opepac = value;
    }

    /**
     * Gets the value of the codstrums property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODSTRUMS() {
        return codstrums;
    }

    /**
     * Sets the value of the codstrums property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODSTRUMS(String value) {
        this.codstrums = value;
    }

    /**
     * Gets the value of the codstrumsaf property.
     * 
     * @return
     *     possible object is
     *     {@link CODSTRUMSType }
     *     
     */
    public CODSTRUMSType getCODSTRUMSAF() {
        return codstrumsaf;
    }

    /**
     * Sets the value of the codstrumsaf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODSTRUMSType }
     *     
     */
    public void setCODSTRUMSAF(CODSTRUMSType value) {
        this.codstrumsaf = value;
    }

    /**
     * Gets the value of the ctipstrums property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTIPSTRUMS() {
        return ctipstrums;
    }

    /**
     * Sets the value of the ctipstrums property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTIPSTRUMS(String value) {
        this.ctipstrums = value;
    }

    /**
     * Gets the value of the ctipstrumsaf property.
     * 
     * @return
     *     possible object is
     *     {@link CTIPSTRUMSType }
     *     
     */
    public CTIPSTRUMSType getCTIPSTRUMSAF() {
        return ctipstrumsaf;
    }

    /**
     * Sets the value of the ctipstrumsaf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTIPSTRUMSType }
     *     
     */
    public void setCTIPSTRUMSAF(CTIPSTRUMSType value) {
        this.ctipstrumsaf = value;
    }

}
