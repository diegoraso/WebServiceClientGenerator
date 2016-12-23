
package com.capgemini.adegParalleloService.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSADEG1ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSADEG1ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RETCODE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="REASON" type="{http://www.accenture.com/ADEG0/WSADEG1/}REASONType"/>
 *         &lt;element name="RETADE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODADE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DESC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DESC-ESTESA" type="{http://www.accenture.com/ADEG0/WSADEG1/}DESC-ESTESAType"/>
 *         &lt;element name="FLG-PTFMOD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VOL-PTFMOD">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FLG-PTFREAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VOL-PTFREAL">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FLG-PTFVARIA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VOL-PTFVARIA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RATING-EM">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;maxInclusive value="999"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PERC-CONC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="7"/>
 *               &lt;fractionDigits value="4"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUM-OP-12M">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *               &lt;maxInclusive value="99999"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SOGLIA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *               &lt;maxInclusive value="99999"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PROF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FLG-BLOCCO-OPER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COD-ESITO-OPER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODVEND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COMPLESSITA" type="{http://www.accenture.com/ADEG0/WSADEG1/}COMPLESSITAType"/>
 *         &lt;element name="FILLER-OUT" type="{http://www.accenture.com/ADEG0/WSADEG1/}FILLER-OUT-TYPE"/>
 *         &lt;element name="SOGLIE" type="{http://www.accenture.com/ADEG0/WSADEG1/}SOGLIEType"/>
 *         &lt;element name="IMP-OBI-REALE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="18"/>
 *               &lt;fractionDigits value="3"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IMP-OBI-MODIF">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="18"/>
 *               &lt;fractionDigits value="3"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COD-RISCHIO-CONC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COD-GRIGLIA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HP-SOGLIA-INVESTIM">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="18"/>
 *               &lt;fractionDigits value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HP-IMP-REALE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="18"/>
 *               &lt;fractionDigits value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HP-IMP-MODIF">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="18"/>
 *               &lt;fractionDigits value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NO-X-HPER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TIPO-ERR-HP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HP-ANAGRAFICO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="4"/>
 *               &lt;fractionDigits value="2"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HP-PORTAFOGLIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="4"/>
 *               &lt;fractionDigits value="2"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HP-IMP-PORTAFOGLIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="18"/>
 *               &lt;fractionDigits value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HP-MOVIMENTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="4"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PERC-SOGLIA-CONC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="6"/>
 *               &lt;fractionDigits value="3"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IMP-SOGLIA-CONC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="13"/>
 *               &lt;fractionDigits value="3"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SOGLIA-SPESA-DICH" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SOGLIA-INVLP-DICH" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IMP-LIQUIDITA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="18"/>
 *               &lt;fractionDigits value="3"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ERR-SOTTOSTANTE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RATING-EM-SOTT">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;maxInclusive value="999"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COD-RIS-CONC-SOTT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PERC-CONC-SOTT">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="7"/>
 *               &lt;fractionDigits value="4"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PERC-SOGL-CONC-SOTT">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="6"/>
 *               &lt;fractionDigits value="3"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IMP-SOGL-CONC-SOTT">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="13"/>
 *               &lt;fractionDigits value="3"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CODSTRUM-SOTT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DESCRIZ-STRUM-SOTT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COD-GRIGLIA-SOTT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NO-X-COVA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NO-X-COMX" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TIPO-ERR-COVA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TIPO-ERR-COMX" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CATEG-ERR-COVA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ADEG-COMX-1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ADEG-COMX-2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PERC-COVA-EM">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="7"/>
 *               &lt;fractionDigits value="4"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PERC-COVA-DEV">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="7"/>
 *               &lt;fractionDigits value="4"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PERC-COVA-EMDEV">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="7"/>
 *               &lt;fractionDigits value="4"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PERC-COVA-EM-LIM">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="7"/>
 *               &lt;fractionDigits value="4"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PERC-COVA-DEV-LIM">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="7"/>
 *               &lt;fractionDigits value="4"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PERC-COVA-EMDEV-LIM">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="7"/>
 *               &lt;fractionDigits value="4"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CTV-COMX-CTVR">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="18"/>
 *               &lt;fractionDigits value="3"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FLAG-COMX-CC2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FLAG-COMX-CC3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FLAG-COMX-CC4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CTV-COMX-CC2-LIM">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="18"/>
 *               &lt;fractionDigits value="3"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CTV-COMX-CC3-LIM">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="18"/>
 *               &lt;fractionDigits value="3"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CTV-COMX-CC4-LIM">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="18"/>
 *               &lt;fractionDigits value="3"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PERC-COMX-CC234">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="7"/>
 *               &lt;fractionDigits value="4"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PERC-COMX-CC34">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="7"/>
 *               &lt;fractionDigits value="4"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PERC-COMX-CC4">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="7"/>
 *               &lt;fractionDigits value="4"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PERC-COMX-CC234-LIM">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="7"/>
 *               &lt;fractionDigits value="4"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PERC-COMX-CC34-LIM">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="7"/>
 *               &lt;fractionDigits value="4"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PERC-COMX-CC4-LIM">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="7"/>
 *               &lt;fractionDigits value="4"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ACQUISTO-EM">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;maxInclusive value="9"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ACQUISTO-DEV">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;maxInclusive value="9"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FILLER3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AREA-ESITO-NBP" type="{http://www.accenture.com/ADEG0/WSADEG1/}AREA-ESITO-NBPType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSADEG1ResponseType", propOrder = {
    "retcode",
    "reason",
    "retade",
    "codade",
    "desc",
    "descestesa",
    "flgptfmod",
    "volptfmod",
    "flgptfreal",
    "volptfreal",
    "flgptfvaria",
    "volptfvaria",
    "ratingem",
    "percconc",
    "numop12M",
    "soglia",
    "prof",
    "flgbloccooper",
    "codesitooper",
    "codvend",
    "complessita",
    "fillerout",
    "soglie",
    "impobireale",
    "impobimodif",
    "codrischioconc",
    "codgriglia",
    "hpsogliainvestim",
    "hpimpreale",
    "hpimpmodif",
    "noxhper",
    "tipoerrhp",
    "hpanagrafico",
    "hpportafoglio",
    "hpimpportafoglio",
    "hpmovimento",
    "percsogliaconc",
    "impsogliaconc",
    "sogliaspesadich",
    "sogliainvlpdich",
    "impliquidita",
    "errsottostante",
    "ratingemsott",
    "codrisconcsott",
    "percconcsott",
    "percsoglconcsott",
    "impsoglconcsott",
    "codstrumsott",
    "descrizstrumsott",
    "codgrigliasott",
    "noxcova",
    "noxcomx",
    "tipoerrcova",
    "tipoerrcomx",
    "categerrcova",
    "adegcomx1",
    "adegcomx2",
    "perccovaem",
    "perccovadev",
    "perccovaemdev",
    "perccovaemlim",
    "perccovadevlim",
    "perccovaemdevlim",
    "ctvcomxctvr",
    "flagcomxcc2",
    "flagcomxcc3",
    "flagcomxcc4",
    "ctvcomxcc2LIM",
    "ctvcomxcc3LIM",
    "ctvcomxcc4LIM",
    "perccomxcc234",
    "perccomxcc34",
    "perccomxcc4",
    "perccomxcc234LIM",
    "perccomxcc34LIM",
    "perccomxcc4LIM",
    "acquistoem",
    "acquistodev",
    "filler3",
    "areaesitonbp"
})
public class WSADEG1ResponseType {

    @XmlElement(name = "RETCODE", required = true)
    protected String retcode;
    @XmlElement(name = "REASON", required = true)
    protected REASONType reason;
    @XmlElement(name = "RETADE", required = true)
    protected String retade;
    @XmlElement(name = "CODADE", required = true)
    protected String codade;
    @XmlElement(name = "DESC", required = true)
    protected String desc;
    @XmlElement(name = "DESC-ESTESA", required = true)
    protected DESCESTESAType descestesa;
    @XmlElement(name = "FLG-PTFMOD", required = true)
    protected String flgptfmod;
    @XmlElement(name = "VOL-PTFMOD", required = true)
    protected String volptfmod;
    @XmlElement(name = "FLG-PTFREAL", required = true)
    protected String flgptfreal;
    @XmlElement(name = "VOL-PTFREAL", required = true)
    protected String volptfreal;
    @XmlElement(name = "FLG-PTFVARIA", required = true)
    protected String flgptfvaria;
    @XmlElement(name = "VOL-PTFVARIA", required = true)
    protected String volptfvaria;
    @XmlElement(name = "RATING-EM")
    protected int ratingem;
    @XmlElement(name = "PERC-CONC", required = true)
    protected BigDecimal percconc;
    @XmlElement(name = "NUM-OP-12M")
    protected long numop12M;
    @XmlElement(name = "SOGLIA")
    protected long soglia;
    @XmlElement(name = "PROF", required = true)
    protected String prof;
    @XmlElement(name = "FLG-BLOCCO-OPER", required = true)
    protected String flgbloccooper;
    @XmlElement(name = "COD-ESITO-OPER", required = true)
    protected String codesitooper;
    @XmlElement(name = "CODVEND", required = true)
    protected String codvend;
    @XmlElement(name = "COMPLESSITA", required = true)
    protected COMPLESSITAType complessita;
    @XmlElement(name = "FILLER-OUT", required = true)
    protected FILLEROUTTYPE fillerout;
    @XmlElement(name = "SOGLIE", required = true)
    protected SOGLIEType soglie;
    @XmlElement(name = "IMP-OBI-REALE", required = true)
    protected BigDecimal impobireale;
    @XmlElement(name = "IMP-OBI-MODIF", required = true)
    protected BigDecimal impobimodif;
    @XmlElement(name = "COD-RISCHIO-CONC", required = true)
    protected String codrischioconc;
    @XmlElement(name = "COD-GRIGLIA", required = true)
    protected String codgriglia;
    @XmlElement(name = "HP-SOGLIA-INVESTIM", required = true)
    protected BigDecimal hpsogliainvestim;
    @XmlElement(name = "HP-IMP-REALE", required = true)
    protected BigDecimal hpimpreale;
    @XmlElement(name = "HP-IMP-MODIF", required = true)
    protected BigDecimal hpimpmodif;
    @XmlElement(name = "NO-X-HPER", required = true)
    protected String noxhper;
    @XmlElement(name = "TIPO-ERR-HP", required = true)
    protected String tipoerrhp;
    @XmlElement(name = "HP-ANAGRAFICO", required = true)
    protected BigDecimal hpanagrafico;
    @XmlElement(name = "HP-PORTAFOGLIO", required = true)
    protected BigDecimal hpportafoglio;
    @XmlElement(name = "HP-IMP-PORTAFOGLIO", required = true)
    protected BigDecimal hpimpportafoglio;
    @XmlElement(name = "HP-MOVIMENTO", required = true)
    protected BigDecimal hpmovimento;
    @XmlElement(name = "PERC-SOGLIA-CONC", required = true)
    protected BigDecimal percsogliaconc;
    @XmlElement(name = "IMP-SOGLIA-CONC", required = true)
    protected BigDecimal impsogliaconc;
    @XmlElement(name = "SOGLIA-SPESA-DICH", required = true)
    protected String sogliaspesadich;
    @XmlElement(name = "SOGLIA-INVLP-DICH", required = true)
    protected String sogliainvlpdich;
    @XmlElement(name = "IMP-LIQUIDITA", required = true)
    protected BigDecimal impliquidita;
    @XmlElement(name = "ERR-SOTTOSTANTE", required = true)
    protected String errsottostante;
    @XmlElement(name = "RATING-EM-SOTT")
    protected int ratingemsott;
    @XmlElement(name = "COD-RIS-CONC-SOTT", required = true)
    protected String codrisconcsott;
    @XmlElement(name = "PERC-CONC-SOTT", required = true)
    protected BigDecimal percconcsott;
    @XmlElement(name = "PERC-SOGL-CONC-SOTT", required = true)
    protected BigDecimal percsoglconcsott;
    @XmlElement(name = "IMP-SOGL-CONC-SOTT", required = true)
    protected BigDecimal impsoglconcsott;
    @XmlElement(name = "CODSTRUM-SOTT", required = true)
    protected String codstrumsott;
    @XmlElement(name = "DESCRIZ-STRUM-SOTT", required = true)
    protected String descrizstrumsott;
    @XmlElement(name = "COD-GRIGLIA-SOTT", required = true)
    protected String codgrigliasott;
    @XmlElement(name = "NO-X-COVA", required = true)
    protected String noxcova;
    @XmlElement(name = "NO-X-COMX", required = true)
    protected String noxcomx;
    @XmlElement(name = "TIPO-ERR-COVA", required = true)
    protected String tipoerrcova;
    @XmlElement(name = "TIPO-ERR-COMX", required = true)
    protected String tipoerrcomx;
    @XmlElement(name = "CATEG-ERR-COVA", required = true)
    protected String categerrcova;
    @XmlElement(name = "ADEG-COMX-1", required = true)
    protected String adegcomx1;
    @XmlElement(name = "ADEG-COMX-2", required = true)
    protected String adegcomx2;
    @XmlElement(name = "PERC-COVA-EM", required = true)
    protected BigDecimal perccovaem;
    @XmlElement(name = "PERC-COVA-DEV", required = true)
    protected BigDecimal perccovadev;
    @XmlElement(name = "PERC-COVA-EMDEV", required = true)
    protected BigDecimal perccovaemdev;
    @XmlElement(name = "PERC-COVA-EM-LIM", required = true)
    protected BigDecimal perccovaemlim;
    @XmlElement(name = "PERC-COVA-DEV-LIM", required = true)
    protected BigDecimal perccovadevlim;
    @XmlElement(name = "PERC-COVA-EMDEV-LIM", required = true)
    protected BigDecimal perccovaemdevlim;
    @XmlElement(name = "CTV-COMX-CTVR", required = true)
    protected BigDecimal ctvcomxctvr;
    @XmlElement(name = "FLAG-COMX-CC2", required = true)
    protected String flagcomxcc2;
    @XmlElement(name = "FLAG-COMX-CC3", required = true)
    protected String flagcomxcc3;
    @XmlElement(name = "FLAG-COMX-CC4", required = true)
    protected String flagcomxcc4;
    @XmlElement(name = "CTV-COMX-CC2-LIM", required = true)
    protected BigDecimal ctvcomxcc2LIM;
    @XmlElement(name = "CTV-COMX-CC3-LIM", required = true)
    protected BigDecimal ctvcomxcc3LIM;
    @XmlElement(name = "CTV-COMX-CC4-LIM", required = true)
    protected BigDecimal ctvcomxcc4LIM;
    @XmlElement(name = "PERC-COMX-CC234", required = true)
    protected BigDecimal perccomxcc234;
    @XmlElement(name = "PERC-COMX-CC34", required = true)
    protected BigDecimal perccomxcc34;
    @XmlElement(name = "PERC-COMX-CC4", required = true)
    protected BigDecimal perccomxcc4;
    @XmlElement(name = "PERC-COMX-CC234-LIM", required = true)
    protected BigDecimal perccomxcc234LIM;
    @XmlElement(name = "PERC-COMX-CC34-LIM", required = true)
    protected BigDecimal perccomxcc34LIM;
    @XmlElement(name = "PERC-COMX-CC4-LIM", required = true)
    protected BigDecimal perccomxcc4LIM;
    @XmlElement(name = "ACQUISTO-EM")
    protected int acquistoem;
    @XmlElement(name = "ACQUISTO-DEV")
    protected int acquistodev;
    @XmlElement(name = "FILLER3", required = true)
    protected String filler3;
    @XmlElement(name = "AREA-ESITO-NBP", required = true)
    protected AREAESITONBPType areaesitonbp;

    /**
     * Gets the value of the retcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRETCODE() {
        return retcode;
    }

    /**
     * Sets the value of the retcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRETCODE(String value) {
        this.retcode = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link REASONType }
     *     
     */
    public REASONType getREASON() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link REASONType }
     *     
     */
    public void setREASON(REASONType value) {
        this.reason = value;
    }

    /**
     * Gets the value of the retade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRETADE() {
        return retade;
    }

    /**
     * Sets the value of the retade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRETADE(String value) {
        this.retade = value;
    }

    /**
     * Gets the value of the codade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODADE() {
        return codade;
    }

    /**
     * Sets the value of the codade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODADE(String value) {
        this.codade = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESC() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESC(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the descestesa property.
     * 
     * @return
     *     possible object is
     *     {@link DESCESTESAType }
     *     
     */
    public DESCESTESAType getDESCESTESA() {
        return descestesa;
    }

    /**
     * Sets the value of the descestesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link DESCESTESAType }
     *     
     */
    public void setDESCESTESA(DESCESTESAType value) {
        this.descestesa = value;
    }

    /**
     * Gets the value of the flgptfmod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLGPTFMOD() {
        return flgptfmod;
    }

    /**
     * Sets the value of the flgptfmod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLGPTFMOD(String value) {
        this.flgptfmod = value;
    }

    /**
     * Gets the value of the volptfmod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOLPTFMOD() {
        return volptfmod;
    }

    /**
     * Sets the value of the volptfmod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOLPTFMOD(String value) {
        this.volptfmod = value;
    }

    /**
     * Gets the value of the flgptfreal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLGPTFREAL() {
        return flgptfreal;
    }

    /**
     * Sets the value of the flgptfreal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLGPTFREAL(String value) {
        this.flgptfreal = value;
    }

    /**
     * Gets the value of the volptfreal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOLPTFREAL() {
        return volptfreal;
    }

    /**
     * Sets the value of the volptfreal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOLPTFREAL(String value) {
        this.volptfreal = value;
    }

    /**
     * Gets the value of the flgptfvaria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLGPTFVARIA() {
        return flgptfvaria;
    }

    /**
     * Sets the value of the flgptfvaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLGPTFVARIA(String value) {
        this.flgptfvaria = value;
    }

    /**
     * Gets the value of the volptfvaria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOLPTFVARIA() {
        return volptfvaria;
    }

    /**
     * Sets the value of the volptfvaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOLPTFVARIA(String value) {
        this.volptfvaria = value;
    }

    /**
     * Gets the value of the ratingem property.
     * 
     */
    public int getRATINGEM() {
        return ratingem;
    }

    /**
     * Sets the value of the ratingem property.
     * 
     */
    public void setRATINGEM(int value) {
        this.ratingem = value;
    }

    /**
     * Gets the value of the percconc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPERCCONC() {
        return percconc;
    }

    /**
     * Sets the value of the percconc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPERCCONC(BigDecimal value) {
        this.percconc = value;
    }

    /**
     * Gets the value of the numop12M property.
     * 
     */
    public long getNUMOP12M() {
        return numop12M;
    }

    /**
     * Sets the value of the numop12M property.
     * 
     */
    public void setNUMOP12M(long value) {
        this.numop12M = value;
    }

    /**
     * Gets the value of the soglia property.
     * 
     */
    public long getSOGLIA() {
        return soglia;
    }

    /**
     * Sets the value of the soglia property.
     * 
     */
    public void setSOGLIA(long value) {
        this.soglia = value;
    }

    /**
     * Gets the value of the prof property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROF() {
        return prof;
    }

    /**
     * Sets the value of the prof property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROF(String value) {
        this.prof = value;
    }

    /**
     * Gets the value of the flgbloccooper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLGBLOCCOOPER() {
        return flgbloccooper;
    }

    /**
     * Sets the value of the flgbloccooper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLGBLOCCOOPER(String value) {
        this.flgbloccooper = value;
    }

    /**
     * Gets the value of the codesitooper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODESITOOPER() {
        return codesitooper;
    }

    /**
     * Sets the value of the codesitooper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODESITOOPER(String value) {
        this.codesitooper = value;
    }

    /**
     * Gets the value of the codvend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODVEND() {
        return codvend;
    }

    /**
     * Sets the value of the codvend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODVEND(String value) {
        this.codvend = value;
    }

    /**
     * Gets the value of the complessita property.
     * 
     * @return
     *     possible object is
     *     {@link COMPLESSITAType }
     *     
     */
    public COMPLESSITAType getCOMPLESSITA() {
        return complessita;
    }

    /**
     * Sets the value of the complessita property.
     * 
     * @param value
     *     allowed object is
     *     {@link COMPLESSITAType }
     *     
     */
    public void setCOMPLESSITA(COMPLESSITAType value) {
        this.complessita = value;
    }

    /**
     * Gets the value of the fillerout property.
     * 
     * @return
     *     possible object is
     *     {@link FILLEROUTTYPE }
     *     
     */
    public FILLEROUTTYPE getFILLEROUT() {
        return fillerout;
    }

    /**
     * Sets the value of the fillerout property.
     * 
     * @param value
     *     allowed object is
     *     {@link FILLEROUTTYPE }
     *     
     */
    public void setFILLEROUT(FILLEROUTTYPE value) {
        this.fillerout = value;
    }

    /**
     * Gets the value of the soglie property.
     * 
     * @return
     *     possible object is
     *     {@link SOGLIEType }
     *     
     */
    public SOGLIEType getSOGLIE() {
        return soglie;
    }

    /**
     * Sets the value of the soglie property.
     * 
     * @param value
     *     allowed object is
     *     {@link SOGLIEType }
     *     
     */
    public void setSOGLIE(SOGLIEType value) {
        this.soglie = value;
    }

    /**
     * Gets the value of the impobireale property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIMPOBIREALE() {
        return impobireale;
    }

    /**
     * Sets the value of the impobireale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIMPOBIREALE(BigDecimal value) {
        this.impobireale = value;
    }

    /**
     * Gets the value of the impobimodif property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIMPOBIMODIF() {
        return impobimodif;
    }

    /**
     * Sets the value of the impobimodif property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIMPOBIMODIF(BigDecimal value) {
        this.impobimodif = value;
    }

    /**
     * Gets the value of the codrischioconc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODRISCHIOCONC() {
        return codrischioconc;
    }

    /**
     * Sets the value of the codrischioconc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODRISCHIOCONC(String value) {
        this.codrischioconc = value;
    }

    /**
     * Gets the value of the codgriglia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODGRIGLIA() {
        return codgriglia;
    }

    /**
     * Sets the value of the codgriglia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODGRIGLIA(String value) {
        this.codgriglia = value;
    }

    /**
     * Gets the value of the hpsogliainvestim property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHPSOGLIAINVESTIM() {
        return hpsogliainvestim;
    }

    /**
     * Sets the value of the hpsogliainvestim property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHPSOGLIAINVESTIM(BigDecimal value) {
        this.hpsogliainvestim = value;
    }

    /**
     * Gets the value of the hpimpreale property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHPIMPREALE() {
        return hpimpreale;
    }

    /**
     * Sets the value of the hpimpreale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHPIMPREALE(BigDecimal value) {
        this.hpimpreale = value;
    }

    /**
     * Gets the value of the hpimpmodif property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHPIMPMODIF() {
        return hpimpmodif;
    }

    /**
     * Sets the value of the hpimpmodif property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHPIMPMODIF(BigDecimal value) {
        this.hpimpmodif = value;
    }

    /**
     * Gets the value of the noxhper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOXHPER() {
        return noxhper;
    }

    /**
     * Sets the value of the noxhper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOXHPER(String value) {
        this.noxhper = value;
    }

    /**
     * Gets the value of the tipoerrhp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOERRHP() {
        return tipoerrhp;
    }

    /**
     * Sets the value of the tipoerrhp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOERRHP(String value) {
        this.tipoerrhp = value;
    }

    /**
     * Gets the value of the hpanagrafico property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHPANAGRAFICO() {
        return hpanagrafico;
    }

    /**
     * Sets the value of the hpanagrafico property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHPANAGRAFICO(BigDecimal value) {
        this.hpanagrafico = value;
    }

    /**
     * Gets the value of the hpportafoglio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHPPORTAFOGLIO() {
        return hpportafoglio;
    }

    /**
     * Sets the value of the hpportafoglio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHPPORTAFOGLIO(BigDecimal value) {
        this.hpportafoglio = value;
    }

    /**
     * Gets the value of the hpimpportafoglio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHPIMPPORTAFOGLIO() {
        return hpimpportafoglio;
    }

    /**
     * Sets the value of the hpimpportafoglio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHPIMPPORTAFOGLIO(BigDecimal value) {
        this.hpimpportafoglio = value;
    }

    /**
     * Gets the value of the hpmovimento property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHPMOVIMENTO() {
        return hpmovimento;
    }

    /**
     * Sets the value of the hpmovimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHPMOVIMENTO(BigDecimal value) {
        this.hpmovimento = value;
    }

    /**
     * Gets the value of the percsogliaconc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPERCSOGLIACONC() {
        return percsogliaconc;
    }

    /**
     * Sets the value of the percsogliaconc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPERCSOGLIACONC(BigDecimal value) {
        this.percsogliaconc = value;
    }

    /**
     * Gets the value of the impsogliaconc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIMPSOGLIACONC() {
        return impsogliaconc;
    }

    /**
     * Sets the value of the impsogliaconc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIMPSOGLIACONC(BigDecimal value) {
        this.impsogliaconc = value;
    }

    /**
     * Gets the value of the sogliaspesadich property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOGLIASPESADICH() {
        return sogliaspesadich;
    }

    /**
     * Sets the value of the sogliaspesadich property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOGLIASPESADICH(String value) {
        this.sogliaspesadich = value;
    }

    /**
     * Gets the value of the sogliainvlpdich property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOGLIAINVLPDICH() {
        return sogliainvlpdich;
    }

    /**
     * Sets the value of the sogliainvlpdich property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOGLIAINVLPDICH(String value) {
        this.sogliainvlpdich = value;
    }

    /**
     * Gets the value of the impliquidita property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIMPLIQUIDITA() {
        return impliquidita;
    }

    /**
     * Sets the value of the impliquidita property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIMPLIQUIDITA(BigDecimal value) {
        this.impliquidita = value;
    }

    /**
     * Gets the value of the errsottostante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERRSOTTOSTANTE() {
        return errsottostante;
    }

    /**
     * Sets the value of the errsottostante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERRSOTTOSTANTE(String value) {
        this.errsottostante = value;
    }

    /**
     * Gets the value of the ratingemsott property.
     * 
     */
    public int getRATINGEMSOTT() {
        return ratingemsott;
    }

    /**
     * Sets the value of the ratingemsott property.
     * 
     */
    public void setRATINGEMSOTT(int value) {
        this.ratingemsott = value;
    }

    /**
     * Gets the value of the codrisconcsott property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODRISCONCSOTT() {
        return codrisconcsott;
    }

    /**
     * Sets the value of the codrisconcsott property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODRISCONCSOTT(String value) {
        this.codrisconcsott = value;
    }

    /**
     * Gets the value of the percconcsott property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPERCCONCSOTT() {
        return percconcsott;
    }

    /**
     * Sets the value of the percconcsott property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPERCCONCSOTT(BigDecimal value) {
        this.percconcsott = value;
    }

    /**
     * Gets the value of the percsoglconcsott property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPERCSOGLCONCSOTT() {
        return percsoglconcsott;
    }

    /**
     * Sets the value of the percsoglconcsott property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPERCSOGLCONCSOTT(BigDecimal value) {
        this.percsoglconcsott = value;
    }

    /**
     * Gets the value of the impsoglconcsott property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIMPSOGLCONCSOTT() {
        return impsoglconcsott;
    }

    /**
     * Sets the value of the impsoglconcsott property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIMPSOGLCONCSOTT(BigDecimal value) {
        this.impsoglconcsott = value;
    }

    /**
     * Gets the value of the codstrumsott property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODSTRUMSOTT() {
        return codstrumsott;
    }

    /**
     * Sets the value of the codstrumsott property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODSTRUMSOTT(String value) {
        this.codstrumsott = value;
    }

    /**
     * Gets the value of the descrizstrumsott property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIZSTRUMSOTT() {
        return descrizstrumsott;
    }

    /**
     * Sets the value of the descrizstrumsott property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIZSTRUMSOTT(String value) {
        this.descrizstrumsott = value;
    }

    /**
     * Gets the value of the codgrigliasott property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODGRIGLIASOTT() {
        return codgrigliasott;
    }

    /**
     * Sets the value of the codgrigliasott property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODGRIGLIASOTT(String value) {
        this.codgrigliasott = value;
    }

    /**
     * Gets the value of the noxcova property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOXCOVA() {
        return noxcova;
    }

    /**
     * Sets the value of the noxcova property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOXCOVA(String value) {
        this.noxcova = value;
    }

    /**
     * Gets the value of the noxcomx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOXCOMX() {
        return noxcomx;
    }

    /**
     * Sets the value of the noxcomx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOXCOMX(String value) {
        this.noxcomx = value;
    }

    /**
     * Gets the value of the tipoerrcova property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOERRCOVA() {
        return tipoerrcova;
    }

    /**
     * Sets the value of the tipoerrcova property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOERRCOVA(String value) {
        this.tipoerrcova = value;
    }

    /**
     * Gets the value of the tipoerrcomx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOERRCOMX() {
        return tipoerrcomx;
    }

    /**
     * Sets the value of the tipoerrcomx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOERRCOMX(String value) {
        this.tipoerrcomx = value;
    }

    /**
     * Gets the value of the categerrcova property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATEGERRCOVA() {
        return categerrcova;
    }

    /**
     * Sets the value of the categerrcova property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATEGERRCOVA(String value) {
        this.categerrcova = value;
    }

    /**
     * Gets the value of the adegcomx1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADEGCOMX1() {
        return adegcomx1;
    }

    /**
     * Sets the value of the adegcomx1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADEGCOMX1(String value) {
        this.adegcomx1 = value;
    }

    /**
     * Gets the value of the adegcomx2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADEGCOMX2() {
        return adegcomx2;
    }

    /**
     * Sets the value of the adegcomx2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADEGCOMX2(String value) {
        this.adegcomx2 = value;
    }

    /**
     * Gets the value of the perccovaem property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPERCCOVAEM() {
        return perccovaem;
    }

    /**
     * Sets the value of the perccovaem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPERCCOVAEM(BigDecimal value) {
        this.perccovaem = value;
    }

    /**
     * Gets the value of the perccovadev property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPERCCOVADEV() {
        return perccovadev;
    }

    /**
     * Sets the value of the perccovadev property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPERCCOVADEV(BigDecimal value) {
        this.perccovadev = value;
    }

    /**
     * Gets the value of the perccovaemdev property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPERCCOVAEMDEV() {
        return perccovaemdev;
    }

    /**
     * Sets the value of the perccovaemdev property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPERCCOVAEMDEV(BigDecimal value) {
        this.perccovaemdev = value;
    }

    /**
     * Gets the value of the perccovaemlim property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPERCCOVAEMLIM() {
        return perccovaemlim;
    }

    /**
     * Sets the value of the perccovaemlim property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPERCCOVAEMLIM(BigDecimal value) {
        this.perccovaemlim = value;
    }

    /**
     * Gets the value of the perccovadevlim property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPERCCOVADEVLIM() {
        return perccovadevlim;
    }

    /**
     * Sets the value of the perccovadevlim property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPERCCOVADEVLIM(BigDecimal value) {
        this.perccovadevlim = value;
    }

    /**
     * Gets the value of the perccovaemdevlim property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPERCCOVAEMDEVLIM() {
        return perccovaemdevlim;
    }

    /**
     * Sets the value of the perccovaemdevlim property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPERCCOVAEMDEVLIM(BigDecimal value) {
        this.perccovaemdevlim = value;
    }

    /**
     * Gets the value of the ctvcomxctvr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCTVCOMXCTVR() {
        return ctvcomxctvr;
    }

    /**
     * Sets the value of the ctvcomxctvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCTVCOMXCTVR(BigDecimal value) {
        this.ctvcomxctvr = value;
    }

    /**
     * Gets the value of the flagcomxcc2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGCOMXCC2() {
        return flagcomxcc2;
    }

    /**
     * Sets the value of the flagcomxcc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGCOMXCC2(String value) {
        this.flagcomxcc2 = value;
    }

    /**
     * Gets the value of the flagcomxcc3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGCOMXCC3() {
        return flagcomxcc3;
    }

    /**
     * Sets the value of the flagcomxcc3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGCOMXCC3(String value) {
        this.flagcomxcc3 = value;
    }

    /**
     * Gets the value of the flagcomxcc4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGCOMXCC4() {
        return flagcomxcc4;
    }

    /**
     * Sets the value of the flagcomxcc4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGCOMXCC4(String value) {
        this.flagcomxcc4 = value;
    }

    /**
     * Gets the value of the ctvcomxcc2LIM property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCTVCOMXCC2LIM() {
        return ctvcomxcc2LIM;
    }

    /**
     * Sets the value of the ctvcomxcc2LIM property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCTVCOMXCC2LIM(BigDecimal value) {
        this.ctvcomxcc2LIM = value;
    }

    /**
     * Gets the value of the ctvcomxcc3LIM property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCTVCOMXCC3LIM() {
        return ctvcomxcc3LIM;
    }

    /**
     * Sets the value of the ctvcomxcc3LIM property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCTVCOMXCC3LIM(BigDecimal value) {
        this.ctvcomxcc3LIM = value;
    }

    /**
     * Gets the value of the ctvcomxcc4LIM property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCTVCOMXCC4LIM() {
        return ctvcomxcc4LIM;
    }

    /**
     * Sets the value of the ctvcomxcc4LIM property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCTVCOMXCC4LIM(BigDecimal value) {
        this.ctvcomxcc4LIM = value;
    }

    /**
     * Gets the value of the perccomxcc234 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPERCCOMXCC234() {
        return perccomxcc234;
    }

    /**
     * Sets the value of the perccomxcc234 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPERCCOMXCC234(BigDecimal value) {
        this.perccomxcc234 = value;
    }

    /**
     * Gets the value of the perccomxcc34 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPERCCOMXCC34() {
        return perccomxcc34;
    }

    /**
     * Sets the value of the perccomxcc34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPERCCOMXCC34(BigDecimal value) {
        this.perccomxcc34 = value;
    }

    /**
     * Gets the value of the perccomxcc4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPERCCOMXCC4() {
        return perccomxcc4;
    }

    /**
     * Sets the value of the perccomxcc4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPERCCOMXCC4(BigDecimal value) {
        this.perccomxcc4 = value;
    }

    /**
     * Gets the value of the perccomxcc234LIM property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPERCCOMXCC234LIM() {
        return perccomxcc234LIM;
    }

    /**
     * Sets the value of the perccomxcc234LIM property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPERCCOMXCC234LIM(BigDecimal value) {
        this.perccomxcc234LIM = value;
    }

    /**
     * Gets the value of the perccomxcc34LIM property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPERCCOMXCC34LIM() {
        return perccomxcc34LIM;
    }

    /**
     * Sets the value of the perccomxcc34LIM property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPERCCOMXCC34LIM(BigDecimal value) {
        this.perccomxcc34LIM = value;
    }

    /**
     * Gets the value of the perccomxcc4LIM property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPERCCOMXCC4LIM() {
        return perccomxcc4LIM;
    }

    /**
     * Sets the value of the perccomxcc4LIM property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPERCCOMXCC4LIM(BigDecimal value) {
        this.perccomxcc4LIM = value;
    }

    /**
     * Gets the value of the acquistoem property.
     * 
     */
    public int getACQUISTOEM() {
        return acquistoem;
    }

    /**
     * Sets the value of the acquistoem property.
     * 
     */
    public void setACQUISTOEM(int value) {
        this.acquistoem = value;
    }

    /**
     * Gets the value of the acquistodev property.
     * 
     */
    public int getACQUISTODEV() {
        return acquistodev;
    }

    /**
     * Sets the value of the acquistodev property.
     * 
     */
    public void setACQUISTODEV(int value) {
        this.acquistodev = value;
    }

    /**
     * Gets the value of the filler3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFILLER3() {
        return filler3;
    }

    /**
     * Sets the value of the filler3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFILLER3(String value) {
        this.filler3 = value;
    }

    /**
     * Gets the value of the areaesitonbp property.
     * 
     * @return
     *     possible object is
     *     {@link AREAESITONBPType }
     *     
     */
    public AREAESITONBPType getAREAESITONBP() {
        return areaesitonbp;
    }

    /**
     * Sets the value of the areaesitonbp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AREAESITONBPType }
     *     
     */
    public void setAREAESITONBP(AREAESITONBPType value) {
        this.areaesitonbp = value;
    }

}
