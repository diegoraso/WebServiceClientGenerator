
package com.capgemini.adegParalleloService.client;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSADEG1RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSADEG1RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HEAD-INFO" type="{http://www.accenture.com/ADEG0/WSADEG1/}HEAD-INFO-TYPE"/>
 *         &lt;element name="CIST" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CHIAMATA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CALLPROC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COD-NSG" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="COD-MANDATO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODRAPP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODRAPP-HEAD" type="{http://www.accenture.com/ADEG0/WSADEG1/}CodRapp-Type"/>
 *         &lt;element name="CANALE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FREQUENZA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NUM-OPE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TAB" type="{http://www.accenture.com/ADEG0/WSADEG1/}Tab-Type"/>
 *         &lt;element name="COMODO" type="{http://www.accenture.com/ADEG0/WSADEG1/}Comodo-Type"/>
 *         &lt;element name="NUM-PROPOSTA-ABC-X" type="{http://www.accenture.com/ADEG0/WSADEG1/}NUM-PROPOSTA-ABC-X-Type"/>
 *         &lt;element name="FUORI-SEDE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSADEG1RequestType", propOrder = {
    "headinfo",
    "cist",
    "chiamata",
    "callproc",
    "codnsg",
    "codmandato",
    "codrapp",
    "codrapphead",
    "canale",
    "frequenza",
    "numope",
    "tab",
    "comodo",
    "numpropostaabcx",
    "fuorisede"
})
public class WSADEG1RequestType {

    @XmlElement(name = "HEAD-INFO", required = true)
    protected HEADINFOTYPE headinfo;
    @XmlElement(name = "CIST", required = true)
    protected String cist;
    @XmlElement(name = "CHIAMATA", required = true)
    protected String chiamata;
    @XmlElement(name = "CALLPROC", required = true)
    protected String callproc;
    @XmlElement(name = "COD-NSG", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger codnsg;
    @XmlElement(name = "COD-MANDATO", required = true)
    protected String codmandato;
    @XmlElement(name = "CODRAPP", required = true)
    protected String codrapp;
    @XmlElement(name = "CODRAPP-HEAD", required = true)
    protected CodRappType codrapphead;
    @XmlElement(name = "CANALE", required = true)
    protected String canale;
    @XmlElement(name = "FREQUENZA")
    protected int frequenza;
    @XmlElement(name = "NUM-OPE")
    protected int numope;
    @XmlElement(name = "TAB", required = true)
    protected TabType tab;
    @XmlElement(name = "COMODO", required = true)
    protected ComodoType comodo;
    @XmlElement(name = "NUM-PROPOSTA-ABC-X", required = true)
    protected NUMPROPOSTAABCXType numpropostaabcx;
    @XmlElement(name = "FUORI-SEDE", required = true)
    protected String fuorisede;

    /**
     * Gets the value of the headinfo property.
     * 
     * @return
     *     possible object is
     *     {@link HEADINFOTYPE }
     *     
     */
    public HEADINFOTYPE getHEADINFO() {
        return headinfo;
    }

    /**
     * Sets the value of the headinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HEADINFOTYPE }
     *     
     */
    public void setHEADINFO(HEADINFOTYPE value) {
        this.headinfo = value;
    }

    /**
     * Gets the value of the cist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIST() {
        return cist;
    }

    /**
     * Sets the value of the cist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIST(String value) {
        this.cist = value;
    }

    /**
     * Gets the value of the chiamata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHIAMATA() {
        return chiamata;
    }

    /**
     * Sets the value of the chiamata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHIAMATA(String value) {
        this.chiamata = value;
    }

    /**
     * Gets the value of the callproc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCALLPROC() {
        return callproc;
    }

    /**
     * Sets the value of the callproc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCALLPROC(String value) {
        this.callproc = value;
    }

    /**
     * Gets the value of the codnsg property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCODNSG() {
        return codnsg;
    }

    /**
     * Sets the value of the codnsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCODNSG(BigInteger value) {
        this.codnsg = value;
    }

    /**
     * Gets the value of the codmandato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODMANDATO() {
        return codmandato;
    }

    /**
     * Sets the value of the codmandato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODMANDATO(String value) {
        this.codmandato = value;
    }

    /**
     * Gets the value of the codrapp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODRAPP() {
        return codrapp;
    }

    /**
     * Sets the value of the codrapp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODRAPP(String value) {
        this.codrapp = value;
    }

    /**
     * Gets the value of the codrapphead property.
     * 
     * @return
     *     possible object is
     *     {@link CodRappType }
     *     
     */
    public CodRappType getCODRAPPHEAD() {
        return codrapphead;
    }

    /**
     * Sets the value of the codrapphead property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodRappType }
     *     
     */
    public void setCODRAPPHEAD(CodRappType value) {
        this.codrapphead = value;
    }

    /**
     * Gets the value of the canale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCANALE() {
        return canale;
    }

    /**
     * Sets the value of the canale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCANALE(String value) {
        this.canale = value;
    }

    /**
     * Gets the value of the frequenza property.
     * 
     */
    public int getFREQUENZA() {
        return frequenza;
    }

    /**
     * Sets the value of the frequenza property.
     * 
     */
    public void setFREQUENZA(int value) {
        this.frequenza = value;
    }

    /**
     * Gets the value of the numope property.
     * 
     */
    public int getNUMOPE() {
        return numope;
    }

    /**
     * Sets the value of the numope property.
     * 
     */
    public void setNUMOPE(int value) {
        this.numope = value;
    }

    /**
     * Gets the value of the tab property.
     * 
     * @return
     *     possible object is
     *     {@link TabType }
     *     
     */
    public TabType getTAB() {
        return tab;
    }

    /**
     * Sets the value of the tab property.
     * 
     * @param value
     *     allowed object is
     *     {@link TabType }
     *     
     */
    public void setTAB(TabType value) {
        this.tab = value;
    }

    /**
     * Gets the value of the comodo property.
     * 
     * @return
     *     possible object is
     *     {@link ComodoType }
     *     
     */
    public ComodoType getCOMODO() {
        return comodo;
    }

    /**
     * Sets the value of the comodo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComodoType }
     *     
     */
    public void setCOMODO(ComodoType value) {
        this.comodo = value;
    }

    /**
     * Gets the value of the numpropostaabcx property.
     * 
     * @return
     *     possible object is
     *     {@link NUMPROPOSTAABCXType }
     *     
     */
    public NUMPROPOSTAABCXType getNUMPROPOSTAABCX() {
        return numpropostaabcx;
    }

    /**
     * Sets the value of the numpropostaabcx property.
     * 
     * @param value
     *     allowed object is
     *     {@link NUMPROPOSTAABCXType }
     *     
     */
    public void setNUMPROPOSTAABCX(NUMPROPOSTAABCXType value) {
        this.numpropostaabcx = value;
    }

    /**
     * Gets the value of the fuorisede property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUORISEDE() {
        return fuorisede;
    }

    /**
     * Sets the value of the fuorisede property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUORISEDE(String value) {
        this.fuorisede = value;
    }

}
