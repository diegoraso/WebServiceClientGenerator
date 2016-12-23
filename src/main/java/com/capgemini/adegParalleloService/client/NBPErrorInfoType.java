
package com.capgemini.adegParalleloService.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for NBP_ErrorInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NBP_ErrorInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ErrCode" type="{http://ws.intesasanpaolo.com/}codeEnum"/>
 *         &lt;element name="ErrSubcode" type="{http://ws.intesasanpaolo.com/}subcodeEnum"/>
 *         &lt;element name="ErrReason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ErrSource" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NBP_ErrorInfoType", namespace = "http://ws.intesasanpaolo.com/", propOrder = {

})
public class NBPErrorInfoType {

    @XmlElement(name = "ErrCode", required = true)
    protected QName errCode;
    @XmlElement(name = "ErrSubcode", required = true)
    protected QName errSubcode;
    @XmlElement(name = "ErrReason", required = true)
    protected String errReason;
    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "Message", required = true)
    protected String message;
    @XmlElement(name = "ErrSource", required = true)
    protected String errSource;
    @XmlElement(name = "AdditionalInfo", required = true)
    protected String additionalInfo;

    /**
     * Gets the value of the errCode property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getErrCode() {
        return errCode;
    }

    /**
     * Sets the value of the errCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setErrCode(QName value) {
        this.errCode = value;
    }

    /**
     * Gets the value of the errSubcode property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getErrSubcode() {
        return errSubcode;
    }

    /**
     * Sets the value of the errSubcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setErrSubcode(QName value) {
        this.errSubcode = value;
    }

    /**
     * Gets the value of the errReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrReason() {
        return errReason;
    }

    /**
     * Sets the value of the errReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrReason(String value) {
        this.errReason = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the errSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrSource() {
        return errSource;
    }

    /**
     * Sets the value of the errSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrSource(String value) {
        this.errSource = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

}
