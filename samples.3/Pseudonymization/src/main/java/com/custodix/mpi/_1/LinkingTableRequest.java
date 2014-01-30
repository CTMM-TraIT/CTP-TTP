
package com.custodix.mpi._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for linkingTableRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="linkingTableRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.custodix.com/MPI/1.0}webServiceRequest">
 *       &lt;sequence>
 *         &lt;element name="reidentificationPurpose" type="{http://www.custodix.com/MPI/1.0}reidentificationPurpose" minOccurs="0" form="unqualified"/>
 *         &lt;element name="source" type="{http://www.custodix.com/MPI/1.0}wsSource" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pseudonym" type="{http://www.custodix.com/MPI/1.0}wsLinkedPseudonym" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "linkingTableRequest", propOrder = {
    "reidentificationPurpose",
    "source",
    "pseudonym"
})
public class LinkingTableRequest
    extends WebServiceRequest
{

    @XmlElement(namespace = "")
    protected ReidentificationPurpose reidentificationPurpose;
    protected List<WsSource> source;
    @XmlElement(required = true)
    protected List<WsLinkedPseudonym> pseudonym;

    /**
     * Gets the value of the reidentificationPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link ReidentificationPurpose }
     *     
     */
    public ReidentificationPurpose getReidentificationPurpose() {
        return reidentificationPurpose;
    }

    /**
     * Sets the value of the reidentificationPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReidentificationPurpose }
     *     
     */
    public void setReidentificationPurpose(ReidentificationPurpose value) {
        this.reidentificationPurpose = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsSource }
     * 
     * 
     */
    public List<WsSource> getSource() {
        if (source == null) {
            source = new ArrayList<WsSource>();
        }
        return this.source;
    }

    /**
     * Gets the value of the pseudonym property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pseudonym property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPseudonym().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsLinkedPseudonym }
     * 
     * 
     */
    public List<WsLinkedPseudonym> getPseudonym() {
        if (pseudonym == null) {
            pseudonym = new ArrayList<WsLinkedPseudonym>();
        }
        return this.pseudonym;
    }

}
