
package com.capgemini.adegParalleloService.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ISPWebservicesHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ISPWebservicesHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="RequestInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="ServiceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ServiceVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OperatorInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="UserID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="IsVirtualUser" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="NotISPUserID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CompanyInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="ISPCallerCompanyIDCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="NotISPCompanyIDCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ISPBranchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ISPServiceCompanyIDCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BusinessInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="BusinessProcessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BusinessProcessID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BusinessOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BusinessFileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TechnicalInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="ChannelIDCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ApplicationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CallerServerName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="[a-zA-Z0-9.]{4,255}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CallerProgramName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdditionalBusinessInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Param" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Name" use="required" type="{http://intesasanpaolo.it/}ParamList" />
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ISPWebservicesHeaderType", namespace = "http://intesasanpaolo.it/", propOrder = {

})
public class ISPWebservicesHeaderType {

    @XmlElement(name = "RequestInfo", required = true)
    protected ISPWebservicesHeaderType.RequestInfo requestInfo;
    @XmlElement(name = "OperatorInfo", required = true)
    protected ISPWebservicesHeaderType.OperatorInfo operatorInfo;
    @XmlElement(name = "CompanyInfo", required = true)
    protected ISPWebservicesHeaderType.CompanyInfo companyInfo;
    @XmlElement(name = "BusinessInfo", required = true)
    protected ISPWebservicesHeaderType.BusinessInfo businessInfo;
    @XmlElement(name = "TechnicalInfo", required = true)
    protected ISPWebservicesHeaderType.TechnicalInfo technicalInfo;
    @XmlElement(name = "AdditionalBusinessInfo", required = true)
    protected ISPWebservicesHeaderType.AdditionalBusinessInfo additionalBusinessInfo;

    /**
     * Gets the value of the requestInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ISPWebservicesHeaderType.RequestInfo }
     *     
     */
    public ISPWebservicesHeaderType.RequestInfo getRequestInfo() {
        return requestInfo;
    }

    /**
     * Sets the value of the requestInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISPWebservicesHeaderType.RequestInfo }
     *     
     */
    public void setRequestInfo(ISPWebservicesHeaderType.RequestInfo value) {
        this.requestInfo = value;
    }

    /**
     * Gets the value of the operatorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ISPWebservicesHeaderType.OperatorInfo }
     *     
     */
    public ISPWebservicesHeaderType.OperatorInfo getOperatorInfo() {
        return operatorInfo;
    }

    /**
     * Sets the value of the operatorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISPWebservicesHeaderType.OperatorInfo }
     *     
     */
    public void setOperatorInfo(ISPWebservicesHeaderType.OperatorInfo value) {
        this.operatorInfo = value;
    }

    /**
     * Gets the value of the companyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ISPWebservicesHeaderType.CompanyInfo }
     *     
     */
    public ISPWebservicesHeaderType.CompanyInfo getCompanyInfo() {
        return companyInfo;
    }

    /**
     * Sets the value of the companyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISPWebservicesHeaderType.CompanyInfo }
     *     
     */
    public void setCompanyInfo(ISPWebservicesHeaderType.CompanyInfo value) {
        this.companyInfo = value;
    }

    /**
     * Gets the value of the businessInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ISPWebservicesHeaderType.BusinessInfo }
     *     
     */
    public ISPWebservicesHeaderType.BusinessInfo getBusinessInfo() {
        return businessInfo;
    }

    /**
     * Sets the value of the businessInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISPWebservicesHeaderType.BusinessInfo }
     *     
     */
    public void setBusinessInfo(ISPWebservicesHeaderType.BusinessInfo value) {
        this.businessInfo = value;
    }

    /**
     * Gets the value of the technicalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ISPWebservicesHeaderType.TechnicalInfo }
     *     
     */
    public ISPWebservicesHeaderType.TechnicalInfo getTechnicalInfo() {
        return technicalInfo;
    }

    /**
     * Sets the value of the technicalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISPWebservicesHeaderType.TechnicalInfo }
     *     
     */
    public void setTechnicalInfo(ISPWebservicesHeaderType.TechnicalInfo value) {
        this.technicalInfo = value;
    }

    /**
     * Gets the value of the additionalBusinessInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ISPWebservicesHeaderType.AdditionalBusinessInfo }
     *     
     */
    public ISPWebservicesHeaderType.AdditionalBusinessInfo getAdditionalBusinessInfo() {
        return additionalBusinessInfo;
    }

    /**
     * Sets the value of the additionalBusinessInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISPWebservicesHeaderType.AdditionalBusinessInfo }
     *     
     */
    public void setAdditionalBusinessInfo(ISPWebservicesHeaderType.AdditionalBusinessInfo value) {
        this.additionalBusinessInfo = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Param" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Name" use="required" type="{http://intesasanpaolo.it/}ParamList" />
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
    @XmlType(name = "", propOrder = {
        "param"
    })
    public static class AdditionalBusinessInfo {

        @XmlElement(name = "Param", required = true)
        protected List<ISPWebservicesHeaderType.AdditionalBusinessInfo.Param> param;

        /**
         * Gets the value of the param property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the param property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParam().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ISPWebservicesHeaderType.AdditionalBusinessInfo.Param }
         * 
         * 
         */
        public List<ISPWebservicesHeaderType.AdditionalBusinessInfo.Param> getParam() {
            if (param == null) {
                param = new ArrayList<ISPWebservicesHeaderType.AdditionalBusinessInfo.Param>();
            }
            return this.param;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Name" use="required" type="{http://intesasanpaolo.it/}ParamList" />
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Param {

            @XmlAttribute(name = "Name", required = true)
            protected ParamList name;
            @XmlAttribute(name = "Value", required = true)
            protected String value;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link ParamList }
             *     
             */
            public ParamList getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link ParamList }
             *     
             */
            public void setName(ParamList value) {
                this.name = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="BusinessProcessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BusinessProcessID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BusinessOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BusinessFileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class BusinessInfo {

        @XmlElement(name = "CustomerID", required = true)
        protected String customerID;
        @XmlElement(name = "BusinessProcessName")
        protected String businessProcessName;
        @XmlElement(name = "BusinessProcessID")
        protected String businessProcessID;
        @XmlElement(name = "BusinessOperation")
        protected String businessOperation;
        @XmlElement(name = "BusinessFileID")
        protected String businessFileID;

        /**
         * Gets the value of the customerID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerID() {
            return customerID;
        }

        /**
         * Sets the value of the customerID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerID(String value) {
            this.customerID = value;
        }

        /**
         * Gets the value of the businessProcessName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBusinessProcessName() {
            return businessProcessName;
        }

        /**
         * Sets the value of the businessProcessName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBusinessProcessName(String value) {
            this.businessProcessName = value;
        }

        /**
         * Gets the value of the businessProcessID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBusinessProcessID() {
            return businessProcessID;
        }

        /**
         * Sets the value of the businessProcessID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBusinessProcessID(String value) {
            this.businessProcessID = value;
        }

        /**
         * Gets the value of the businessOperation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBusinessOperation() {
            return businessOperation;
        }

        /**
         * Sets the value of the businessOperation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBusinessOperation(String value) {
            this.businessOperation = value;
        }

        /**
         * Gets the value of the businessFileID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBusinessFileID() {
            return businessFileID;
        }

        /**
         * Sets the value of the businessFileID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBusinessFileID(String value) {
            this.businessFileID = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element name="ISPCallerCompanyIDCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="NotISPCompanyIDCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ISPBranchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ISPServiceCompanyIDCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class CompanyInfo {

        @XmlElement(name = "ISPCallerCompanyIDCode", required = true)
        protected String ispCallerCompanyIDCode;
        @XmlElement(name = "NotISPCompanyIDCode")
        protected String notISPCompanyIDCode;
        @XmlElement(name = "ISPBranchCode")
        protected String ispBranchCode;
        @XmlElement(name = "ISPServiceCompanyIDCode", required = true)
        protected String ispServiceCompanyIDCode;

        /**
         * Gets the value of the ispCallerCompanyIDCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getISPCallerCompanyIDCode() {
            return ispCallerCompanyIDCode;
        }

        /**
         * Sets the value of the ispCallerCompanyIDCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setISPCallerCompanyIDCode(String value) {
            this.ispCallerCompanyIDCode = value;
        }

        /**
         * Gets the value of the notISPCompanyIDCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNotISPCompanyIDCode() {
            return notISPCompanyIDCode;
        }

        /**
         * Sets the value of the notISPCompanyIDCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNotISPCompanyIDCode(String value) {
            this.notISPCompanyIDCode = value;
        }

        /**
         * Gets the value of the ispBranchCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getISPBranchCode() {
            return ispBranchCode;
        }

        /**
         * Sets the value of the ispBranchCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setISPBranchCode(String value) {
            this.ispBranchCode = value;
        }

        /**
         * Gets the value of the ispServiceCompanyIDCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getISPServiceCompanyIDCode() {
            return ispServiceCompanyIDCode;
        }

        /**
         * Sets the value of the ispServiceCompanyIDCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setISPServiceCompanyIDCode(String value) {
            this.ispServiceCompanyIDCode = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="UserID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="IsVirtualUser" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="NotISPUserID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OperatorInfo {

        @XmlAttribute(name = "UserID", required = true)
        protected String userID;
        @XmlAttribute(name = "IsVirtualUser", required = true)
        protected boolean isVirtualUser;
        @XmlAttribute(name = "NotISPUserID")
        protected String notISPUserID;

        /**
         * Gets the value of the userID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserID() {
            return userID;
        }

        /**
         * Sets the value of the userID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserID(String value) {
            this.userID = value;
        }

        /**
         * Gets the value of the isVirtualUser property.
         * 
         */
        public boolean isIsVirtualUser() {
            return isVirtualUser;
        }

        /**
         * Sets the value of the isVirtualUser property.
         * 
         */
        public void setIsVirtualUser(boolean value) {
            this.isVirtualUser = value;
        }

        /**
         * Gets the value of the notISPUserID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNotISPUserID() {
            return notISPUserID;
        }

        /**
         * Sets the value of the notISPUserID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNotISPUserID(String value) {
            this.notISPUserID = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="ServiceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ServiceVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class RequestInfo {

        @XmlElement(name = "TransactionId", required = true)
        protected String transactionId;
        @XmlElement(name = "Timestamp")
        protected long timestamp;
        @XmlElement(name = "ServiceID", required = true)
        protected String serviceID;
        @XmlElement(name = "ServiceVersion", required = true)
        protected String serviceVersion;
        @XmlElement(name = "Language")
        protected String language;

        /**
         * Gets the value of the transactionId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransactionId() {
            return transactionId;
        }

        /**
         * Sets the value of the transactionId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransactionId(String value) {
            this.transactionId = value;
        }

        /**
         * Gets the value of the timestamp property.
         * 
         */
        public long getTimestamp() {
            return timestamp;
        }

        /**
         * Sets the value of the timestamp property.
         * 
         */
        public void setTimestamp(long value) {
            this.timestamp = value;
        }

        /**
         * Gets the value of the serviceID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceID() {
            return serviceID;
        }

        /**
         * Sets the value of the serviceID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceID(String value) {
            this.serviceID = value;
        }

        /**
         * Gets the value of the serviceVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceVersion() {
            return serviceVersion;
        }

        /**
         * Sets the value of the serviceVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceVersion(String value) {
            this.serviceVersion = value;
        }

        /**
         * Gets the value of the language property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLanguage() {
            return language;
        }

        /**
         * Sets the value of the language property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLanguage(String value) {
            this.language = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element name="ChannelIDCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ApplicationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CallerServerName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="[a-zA-Z0-9.]{4,255}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CallerProgramName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class TechnicalInfo {

        @XmlElement(name = "ChannelIDCode", required = true)
        protected String channelIDCode;
        @XmlElement(name = "ApplicationID", required = true)
        protected String applicationID;
        @XmlElement(name = "CallerServerName", required = true)
        protected String callerServerName;
        @XmlElement(name = "CallerProgramName", required = true)
        protected String callerProgramName;

        /**
         * Gets the value of the channelIDCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChannelIDCode() {
            return channelIDCode;
        }

        /**
         * Sets the value of the channelIDCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChannelIDCode(String value) {
            this.channelIDCode = value;
        }

        /**
         * Gets the value of the applicationID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplicationID() {
            return applicationID;
        }

        /**
         * Sets the value of the applicationID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApplicationID(String value) {
            this.applicationID = value;
        }

        /**
         * Gets the value of the callerServerName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCallerServerName() {
            return callerServerName;
        }

        /**
         * Sets the value of the callerServerName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCallerServerName(String value) {
            this.callerServerName = value;
        }

        /**
         * Gets the value of the callerProgramName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCallerProgramName() {
            return callerProgramName;
        }

        /**
         * Sets the value of the callerProgramName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCallerProgramName(String value) {
            this.callerProgramName = value;
        }

    }

}
