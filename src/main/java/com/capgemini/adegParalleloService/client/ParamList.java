
package com.capgemini.adegParalleloService.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParamList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParamList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CodABI"/>
 *     &lt;enumeration value="CodUnitaOperativa"/>
 *     &lt;enumeration value="DataContabile"/>
 *     &lt;enumeration value="FlagPaperless"/>
 *     &lt;enumeration value="CodOperativita"/>
 *     &lt;enumeration value="CodTerminaleCics"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParamList", namespace = "http://intesasanpaolo.it/")
@XmlEnum
public enum ParamList {

    @XmlEnumValue("CodABI")
    COD_ABI("CodABI"),
    @XmlEnumValue("CodUnitaOperativa")
    COD_UNITA_OPERATIVA("CodUnitaOperativa"),
    @XmlEnumValue("DataContabile")
    DATA_CONTABILE("DataContabile"),
    @XmlEnumValue("FlagPaperless")
    FLAG_PAPERLESS("FlagPaperless"),
    @XmlEnumValue("CodOperativita")
    COD_OPERATIVITA("CodOperativita"),
    @XmlEnumValue("CodTerminaleCics")
    COD_TERMINALE_CICS("CodTerminaleCics");
    private final String value;

    ParamList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParamList fromValue(String v) {
        for (ParamList c: ParamList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
