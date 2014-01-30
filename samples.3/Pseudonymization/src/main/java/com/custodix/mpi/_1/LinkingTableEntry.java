
package com.custodix.mpi._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for linkingTableEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="linkingTableEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="linkedPseudonym" type="{http://www.custodix.com/MPI/1.0}wsLinkedPseudonym" minOccurs="0"/>
 *         &lt;element name="sourcePseudonym" type="{http://www.custodix.com/MPI/1.0}wsSourcePseudonym" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "linkingTableEntry", propOrder = {
    "linkedPseudonym",
    "sourcePseudonym"
})
public class LinkingTableEntry {

    protected WsLinkedPseudonym linkedPseudonym;
    protected List<WsSourcePseudonym> sourcePseudonym;
    @XmlAttribute(name = "source")
    protected String source;

    /**
     * Gets the value of the linkedPseudonym property.
     * 
     * @return
     *     possible object is
     *     {@link WsLinkedPseudonym }
     *     
     */
    public WsLinkedPseudonym getLinkedPseudonym() {
        return linkedPseudonym;
    }

    /**
     * Sets the value of the linkedPseudonym property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsLinkedPseudonym }
     *     
     */
    public void setLinkedPseudonym(WsLinkedPseudonym value) {
        this.linkedPseudonym = value;
    }

    /**
     * Gets the value of the sourcePseudonym property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourcePseudonym property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourcePseudonym().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsSourcePseudonym }
     * 
     * 
     */
    public List<WsSourcePseudonym> getSourcePseudonym() {
        if (sourcePseudonym == null) {
            sourcePseudonym = new ArrayList<WsSourcePseudonym>();
        }
        return this.sourcePseudonym;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

}
