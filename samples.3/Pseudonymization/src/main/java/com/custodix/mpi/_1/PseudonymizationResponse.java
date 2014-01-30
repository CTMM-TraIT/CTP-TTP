
package com.custodix.mpi._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pseudonymizationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pseudonymizationResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.custodix.com/MPI/1.0}webServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="linkedPseudonym" type="{http://www.custodix.com/MPI/1.0}wsLinkedPseudonym" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pseudonym" type="{http://www.custodix.com/MPI/1.0}wsSourcePseudonym" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pseudonymizationResponse", propOrder = {
    "linkedPseudonym",
    "pseudonym"
})
public class PseudonymizationResponse
    extends WebServiceResponse
{

    protected List<WsLinkedPseudonym> linkedPseudonym;
    protected List<WsSourcePseudonym> pseudonym;

    /**
     * Gets the value of the linkedPseudonym property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedPseudonym property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkedPseudonym().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsLinkedPseudonym }
     * 
     * 
     */
    public List<WsLinkedPseudonym> getLinkedPseudonym() {
        if (linkedPseudonym == null) {
            linkedPseudonym = new ArrayList<WsLinkedPseudonym>();
        }
        return this.linkedPseudonym;
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
     * {@link WsSourcePseudonym }
     * 
     * 
     */
    public List<WsSourcePseudonym> getPseudonym() {
        if (pseudonym == null) {
            pseudonym = new ArrayList<WsSourcePseudonym>();
        }
        return this.pseudonym;
    }

}
