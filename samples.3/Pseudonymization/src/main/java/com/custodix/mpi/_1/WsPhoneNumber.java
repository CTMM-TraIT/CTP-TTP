
package com.custodix.mpi._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsPhoneNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsPhoneNumber">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.custodix.com/MPI/1.0>persistentIdentificationNumber">
 *       &lt;attribute name="type" type="{http://www.custodix.com/MPI/1.0}phoneType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsPhoneNumber")
public class WsPhoneNumber
    extends PersistentIdentificationNumber
{

    @XmlAttribute(name = "type")
    protected PhoneType type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneType }
     *     
     */
    public PhoneType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneType }
     *     
     */
    public void setType(PhoneType value) {
        this.type = value;
    }

}
