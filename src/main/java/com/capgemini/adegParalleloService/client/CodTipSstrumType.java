
package com.capgemini.adegParalleloService.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodTipSstrum-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodTipSstrum-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COD-ENTITA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="COD-GRUPPO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="COD-SGRUPPO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodTipSstrum-Type", propOrder = {
    "codentita",
    "codgruppo",
    "codsgruppo"
})
public class CodTipSstrumType {

    @XmlElement(name = "COD-ENTITA")
    protected int codentita;
    @XmlElement(name = "COD-GRUPPO")
    protected int codgruppo;
    @XmlElement(name = "COD-SGRUPPO")
    protected int codsgruppo;

    /**
     * Gets the value of the codentita property.
     * 
     */
    public int getCODENTITA() {
        return codentita;
    }

    /**
     * Sets the value of the codentita property.
     * 
     */
    public void setCODENTITA(int value) {
        this.codentita = value;
    }

    /**
     * Gets the value of the codgruppo property.
     * 
     */
    public int getCODGRUPPO() {
        return codgruppo;
    }

    /**
     * Sets the value of the codgruppo property.
     * 
     */
    public void setCODGRUPPO(int value) {
        this.codgruppo = value;
    }

    /**
     * Gets the value of the codsgruppo property.
     * 
     */
    public int getCODSGRUPPO() {
        return codsgruppo;
    }

    /**
     * Sets the value of the codsgruppo property.
     * 
     */
    public void setCODSGRUPPO(int value) {
        this.codsgruppo = value;
    }

}
