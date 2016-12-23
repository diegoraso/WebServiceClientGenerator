
package com.capgemini.adegParalleloService.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tab-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tab-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TAB_OPE" type="{http://www.accenture.com/ADEG0/WSADEG1/}TabOpe-Type" maxOccurs="1000"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tab-Type", propOrder = {
    "tabope"
})
public class TabType {

    @XmlElement(name = "TAB_OPE", required = true)
    protected List<TabOpeType> tabope;

    /**
     * Gets the value of the tabope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tabope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTABOPE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TabOpeType }
     * 
     * 
     */
    public List<TabOpeType> getTABOPE() {
        if (tabope == null) {
            tabope = new ArrayList<TabOpeType>();
        }
        return this.tabope;
    }

}
