
package com.capgemini.adegParalleloService.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FILLER-INP-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FILLER-INP-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FILL1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="REQ-DUMP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DEBUG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NO-DEBUG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FILL2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FILLER-INP-Type", propOrder = {
    "fill1",
    "reqdump",
    "debug",
    "nodebug",
    "fill2"
})
public class FILLERINPType {

    @XmlElement(name = "FILL1", required = true)
    protected String fill1;
    @XmlElement(name = "REQ-DUMP", required = true)
    protected String reqdump;
    @XmlElement(name = "DEBUG", required = true)
    protected String debug;
    @XmlElement(name = "NO-DEBUG", required = true)
    protected String nodebug;
    @XmlElement(name = "FILL2", required = true)
    protected String fill2;

    /**
     * Gets the value of the fill1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFILL1() {
        return fill1;
    }

    /**
     * Sets the value of the fill1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFILL1(String value) {
        this.fill1 = value;
    }

    /**
     * Gets the value of the reqdump property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREQDUMP() {
        return reqdump;
    }

    /**
     * Sets the value of the reqdump property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREQDUMP(String value) {
        this.reqdump = value;
    }

    /**
     * Gets the value of the debug property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEBUG() {
        return debug;
    }

    /**
     * Sets the value of the debug property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEBUG(String value) {
        this.debug = value;
    }

    /**
     * Gets the value of the nodebug property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNODEBUG() {
        return nodebug;
    }

    /**
     * Sets the value of the nodebug property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNODEBUG(String value) {
        this.nodebug = value;
    }

    /**
     * Gets the value of the fill2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFILL2() {
        return fill2;
    }

    /**
     * Sets the value of the fill2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFILL2(String value) {
        this.fill2 = value;
    }

}
