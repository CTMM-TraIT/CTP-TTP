
package com.custodix.mpi._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pseudonymLinkingRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pseudonymLinkingRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.custodix.com/MPI/1.0}webServiceRequest">
 *       &lt;sequence>
 *         &lt;element name="pseudonym" type="{http://www.custodix.com/MPI/1.0}wsSourcePseudonym" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="researchProject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="catalogue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.custodix.com/MPI/1.0}linkingWeight"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pseudonymLinkingRequest", propOrder = {
    "pseudonym",
    "researchProject",
    "catalogue"
})
public class PseudonymLinkingRequest
    extends WebServiceRequest
{

    protected List<WsSourcePseudonym> pseudonym;
    protected String researchProject;
    protected String catalogue;
    @XmlAttribute(name = "linkingWeight", namespace = "http://www.custodix.com/MPI/1.0")
    protected Double linkingWeight;

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

    /**
     * Gets the value of the researchProject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResearchProject() {
        return researchProject;
    }

    /**
     * Sets the value of the researchProject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResearchProject(String value) {
        this.researchProject = value;
    }

    /**
     * Gets the value of the catalogue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogue() {
        return catalogue;
    }

    /**
     * Sets the value of the catalogue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogue(String value) {
        this.catalogue = value;
    }

    /**
     * Gets the value of the linkingWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLinkingWeight() {
        return linkingWeight;
    }

    /**
     * Sets the value of the linkingWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLinkingWeight(Double value) {
        this.linkingWeight = value;
    }

}
