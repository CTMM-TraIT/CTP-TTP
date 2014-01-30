
package com.custodix.mpi._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reidentificationPurpose.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="reidentificationPurpose">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNSPECIFIED"/>
 *     &lt;enumeration value="DATA_INTEGRITY_VERIFICATION"/>
 *     &lt;enumeration value="DATA_DUPLICATE_RECORD_VERIFICATION"/>
 *     &lt;enumeration value="REQUEST_FOR_ADDITIONAL_DATA"/>
 *     &lt;enumeration value="LINK_TO_SUPPLEMENTAL_INFORMATION_VARIABLES"/>
 *     &lt;enumeration value="COMPLIANCE_AUDIT"/>
 *     &lt;enumeration value="COMMUNICATE_SIGNIFICANT_FINDINGS"/>
 *     &lt;enumeration value="FOLLOW_UP_RESEARCH"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "reidentificationPurpose")
@XmlEnum
public enum ReidentificationPurpose {

    UNSPECIFIED,
    DATA_INTEGRITY_VERIFICATION,
    DATA_DUPLICATE_RECORD_VERIFICATION,
    REQUEST_FOR_ADDITIONAL_DATA,
    LINK_TO_SUPPLEMENTAL_INFORMATION_VARIABLES,
    COMPLIANCE_AUDIT,
    COMMUNICATE_SIGNIFICANT_FINDINGS,
    FOLLOW_UP_RESEARCH,
    OTHER;

    public String value() {
        return name();
    }

    public static ReidentificationPurpose fromValue(String v) {
        return valueOf(v);
    }

}
