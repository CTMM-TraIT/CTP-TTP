
package com.custodix.mpi._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for subject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.custodix.com/MPI/1.0}wsAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="attribute" type="{http://www.custodix.com/MPI/1.0}wsAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dateOfBirth" type="{http://www.custodix.com/MPI/1.0}wsDateOfBirth" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.custodix.com/MPI/1.0}wsEmailAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ethnicOriginCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insuranceNumber" type="{http://www.custodix.com/MPI/1.0}wsInsuranceNumber" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="maritalStatus" type="{http://www.custodix.com/MPI/1.0}wsMaritalStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.custodix.com/MPI/1.0}wsName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nationalIdentificationNumber" type="{http://www.custodix.com/MPI/1.0}wsNationalIdentificationNumber" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="patientNumber" type="{http://www.custodix.com/MPI/1.0}wsPatientNumber" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.custodix.com/MPI/1.0}wsPhoneNumber" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="placeOfBirth" type="{http://www.custodix.com/MPI/1.0}wsPlaceOfBirth" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.custodix.com/MPI/1.0}sourceId"/>
 *       &lt;attribute ref="{http://www.custodix.com/MPI/1.0}timestamp"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subject", propOrder = {
    "address",
    "attribute",
    "dateOfBirth",
    "email",
    "ethnicOriginCode",
    "insuranceNumber",
    "maritalStatus",
    "name",
    "nationalIdentificationNumber",
    "patientNumber",
    "phone",
    "placeOfBirth",
    "sex"
})
public class Subject {

    protected List<WsAddress> address;
    protected List<WsAttribute> attribute;
    protected WsDateOfBirth dateOfBirth;
    protected List<WsEmailAddress> email;
    protected String ethnicOriginCode;
    protected List<WsInsuranceNumber> insuranceNumber;
    protected List<WsMaritalStatus> maritalStatus;
    protected List<WsName> name;
    protected List<WsNationalIdentificationNumber> nationalIdentificationNumber;
    protected List<WsPatientNumber> patientNumber;
    protected List<WsPhoneNumber> phone;
    protected WsPlaceOfBirth placeOfBirth;
    protected String sex;
    @XmlAttribute(name = "sourceId", namespace = "http://www.custodix.com/MPI/1.0")
    protected String sourceId;
    @XmlAttribute(name = "timestamp", namespace = "http://www.custodix.com/MPI/1.0")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsAddress }
     * 
     * 
     */
    public List<WsAddress> getAddress() {
        if (address == null) {
            address = new ArrayList<WsAddress>();
        }
        return this.address;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsAttribute }
     * 
     * 
     */
    public List<WsAttribute> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<WsAttribute>();
        }
        return this.attribute;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link WsDateOfBirth }
     *     
     */
    public WsDateOfBirth getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsDateOfBirth }
     *     
     */
    public void setDateOfBirth(WsDateOfBirth value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsEmailAddress }
     * 
     * 
     */
    public List<WsEmailAddress> getEmail() {
        if (email == null) {
            email = new ArrayList<WsEmailAddress>();
        }
        return this.email;
    }

    /**
     * Gets the value of the ethnicOriginCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEthnicOriginCode() {
        return ethnicOriginCode;
    }

    /**
     * Sets the value of the ethnicOriginCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEthnicOriginCode(String value) {
        this.ethnicOriginCode = value;
    }

    /**
     * Gets the value of the insuranceNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insuranceNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsuranceNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsInsuranceNumber }
     * 
     * 
     */
    public List<WsInsuranceNumber> getInsuranceNumber() {
        if (insuranceNumber == null) {
            insuranceNumber = new ArrayList<WsInsuranceNumber>();
        }
        return this.insuranceNumber;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maritalStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaritalStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsMaritalStatus }
     * 
     * 
     */
    public List<WsMaritalStatus> getMaritalStatus() {
        if (maritalStatus == null) {
            maritalStatus = new ArrayList<WsMaritalStatus>();
        }
        return this.maritalStatus;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsName }
     * 
     * 
     */
    public List<WsName> getName() {
        if (name == null) {
            name = new ArrayList<WsName>();
        }
        return this.name;
    }

    /**
     * Gets the value of the nationalIdentificationNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nationalIdentificationNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNationalIdentificationNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsNationalIdentificationNumber }
     * 
     * 
     */
    public List<WsNationalIdentificationNumber> getNationalIdentificationNumber() {
        if (nationalIdentificationNumber == null) {
            nationalIdentificationNumber = new ArrayList<WsNationalIdentificationNumber>();
        }
        return this.nationalIdentificationNumber;
    }

    /**
     * Gets the value of the patientNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patientNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPatientNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsPatientNumber }
     * 
     * 
     */
    public List<WsPatientNumber> getPatientNumber() {
        if (patientNumber == null) {
            patientNumber = new ArrayList<WsPatientNumber>();
        }
        return this.patientNumber;
    }

    /**
     * Gets the value of the phone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsPhoneNumber }
     * 
     * 
     */
    public List<WsPhoneNumber> getPhone() {
        if (phone == null) {
            phone = new ArrayList<WsPhoneNumber>();
        }
        return this.phone;
    }

    /**
     * Gets the value of the placeOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link WsPlaceOfBirth }
     *     
     */
    public WsPlaceOfBirth getPlaceOfBirth() {
        return placeOfBirth;
    }

    /**
     * Sets the value of the placeOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsPlaceOfBirth }
     *     
     */
    public void setPlaceOfBirth(WsPlaceOfBirth value) {
        this.placeOfBirth = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * Gets the value of the sourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceId(String value) {
        this.sourceId = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

}
