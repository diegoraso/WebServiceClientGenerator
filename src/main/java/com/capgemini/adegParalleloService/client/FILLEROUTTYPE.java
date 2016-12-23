
package com.capgemini.adegParalleloService.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FILLER-OUT-TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FILLER-OUT-TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INFO-OUT-ORARI" type="{http://www.accenture.com/ADEG0/WSADEG1/}INFO-OUT-ORARIType"/>
 *         &lt;element name="VAR-FIELDS" type="{http://www.accenture.com/ADEG0/WSADEG1/}VAR-FIELDSType"/>
 *         &lt;element name="ESPINV" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TIPO-COMPLEX" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CONTAT-NEW-CODER">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;maxInclusive value="999"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FLAG-RISCHIO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FLAG-VENDIBILITA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FLAG-COMPLESSITA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FLEX-PRI-STRU" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NO-X-CONC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NO-X-FREQ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FILLER-FL-LQ" type="{http://www.accenture.com/ADEG0/WSADEG1/}LIQU-FLEXType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FILLER-OUT-TYPE", propOrder = {
    "infooutorari",
    "varfields",
    "espinv",
    "tipocomplex",
    "contatnewcoder",
    "flagrischio",
    "flagvendibilita",
    "flagcomplessita",
    "flexpristru",
    "noxconc",
    "noxfreq",
    "fillerfllq"
})
public class FILLEROUTTYPE {

    @XmlElement(name = "INFO-OUT-ORARI", required = true)
    protected INFOOUTORARIType infooutorari;
    @XmlElement(name = "VAR-FIELDS", required = true)
    protected VARFIELDSType varfields;
    @XmlElement(name = "ESPINV", required = true)
    protected String espinv;
    @XmlElement(name = "TIPO-COMPLEX", required = true)
    protected String tipocomplex;
    @XmlElement(name = "CONTAT-NEW-CODER")
    protected int contatnewcoder;
    @XmlElement(name = "FLAG-RISCHIO", required = true)
    protected String flagrischio;
    @XmlElement(name = "FLAG-VENDIBILITA", required = true)
    protected String flagvendibilita;
    @XmlElement(name = "FLAG-COMPLESSITA", required = true)
    protected String flagcomplessita;
    @XmlElement(name = "FLEX-PRI-STRU", required = true)
    protected String flexpristru;
    @XmlElement(name = "NO-X-CONC", required = true)
    protected String noxconc;
    @XmlElement(name = "NO-X-FREQ", required = true)
    protected String noxfreq;
    @XmlElement(name = "FILLER-FL-LQ", required = true)
    protected LIQUFLEXType fillerfllq;

    /**
     * Gets the value of the infooutorari property.
     * 
     * @return
     *     possible object is
     *     {@link INFOOUTORARIType }
     *     
     */
    public INFOOUTORARIType getINFOOUTORARI() {
        return infooutorari;
    }

    /**
     * Sets the value of the infooutorari property.
     * 
     * @param value
     *     allowed object is
     *     {@link INFOOUTORARIType }
     *     
     */
    public void setINFOOUTORARI(INFOOUTORARIType value) {
        this.infooutorari = value;
    }

    /**
     * Gets the value of the varfields property.
     * 
     * @return
     *     possible object is
     *     {@link VARFIELDSType }
     *     
     */
    public VARFIELDSType getVARFIELDS() {
        return varfields;
    }

    /**
     * Sets the value of the varfields property.
     * 
     * @param value
     *     allowed object is
     *     {@link VARFIELDSType }
     *     
     */
    public void setVARFIELDS(VARFIELDSType value) {
        this.varfields = value;
    }

    /**
     * Gets the value of the espinv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESPINV() {
        return espinv;
    }

    /**
     * Sets the value of the espinv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESPINV(String value) {
        this.espinv = value;
    }

    /**
     * Gets the value of the tipocomplex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOCOMPLEX() {
        return tipocomplex;
    }

    /**
     * Sets the value of the tipocomplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOCOMPLEX(String value) {
        this.tipocomplex = value;
    }

    /**
     * Gets the value of the contatnewcoder property.
     * 
     */
    public int getCONTATNEWCODER() {
        return contatnewcoder;
    }

    /**
     * Sets the value of the contatnewcoder property.
     * 
     */
    public void setCONTATNEWCODER(int value) {
        this.contatnewcoder = value;
    }

    /**
     * Gets the value of the flagrischio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGRISCHIO() {
        return flagrischio;
    }

    /**
     * Sets the value of the flagrischio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGRISCHIO(String value) {
        this.flagrischio = value;
    }

    /**
     * Gets the value of the flagvendibilita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGVENDIBILITA() {
        return flagvendibilita;
    }

    /**
     * Sets the value of the flagvendibilita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGVENDIBILITA(String value) {
        this.flagvendibilita = value;
    }

    /**
     * Gets the value of the flagcomplessita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGCOMPLESSITA() {
        return flagcomplessita;
    }

    /**
     * Sets the value of the flagcomplessita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGCOMPLESSITA(String value) {
        this.flagcomplessita = value;
    }

    /**
     * Gets the value of the flexpristru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLEXPRISTRU() {
        return flexpristru;
    }

    /**
     * Sets the value of the flexpristru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLEXPRISTRU(String value) {
        this.flexpristru = value;
    }

    /**
     * Gets the value of the noxconc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOXCONC() {
        return noxconc;
    }

    /**
     * Sets the value of the noxconc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOXCONC(String value) {
        this.noxconc = value;
    }

    /**
     * Gets the value of the noxfreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOXFREQ() {
        return noxfreq;
    }

    /**
     * Sets the value of the noxfreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOXFREQ(String value) {
        this.noxfreq = value;
    }

    /**
     * Gets the value of the fillerfllq property.
     * 
     * @return
     *     possible object is
     *     {@link LIQUFLEXType }
     *     
     */
    public LIQUFLEXType getFILLERFLLQ() {
        return fillerfllq;
    }

    /**
     * Sets the value of the fillerfllq property.
     * 
     * @param value
     *     allowed object is
     *     {@link LIQUFLEXType }
     *     
     */
    public void setFILLERFLLQ(LIQUFLEXType value) {
        this.fillerfllq = value;
    }

}
