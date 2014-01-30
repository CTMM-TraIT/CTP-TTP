
package com.custodix.mpi._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="nameType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="GIVEN"/>
 *     &lt;enumeration value="MARITAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "nameType")
@XmlEnum
public enum NameType {

    UNKNOWN,
    GIVEN,
    MARITAL;

    public String value() {
        return name();
    }

    public static NameType fromValue(String v) {
        return valueOf(v);
    }

}
