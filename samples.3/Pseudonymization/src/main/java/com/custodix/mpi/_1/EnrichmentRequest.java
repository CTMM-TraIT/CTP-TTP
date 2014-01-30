
package com.custodix.mpi._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enrichmentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enrichmentRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.custodix.com/MPI/1.0}webServiceRequest">
 *       &lt;sequence>
 *         &lt;element name="enrichmentRequestItem" type="{http://www.custodix.com/MPI/1.0}enrichmentRequestItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enrichmentRequest", propOrder = {
    "enrichmentRequestItem"
})
public class EnrichmentRequest
    extends WebServiceRequest
{

    protected List<EnrichmentRequestItem> enrichmentRequestItem;

    /**
     * Gets the value of the enrichmentRequestItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enrichmentRequestItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnrichmentRequestItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnrichmentRequestItem }
     * 
     * 
     */
    public List<EnrichmentRequestItem> getEnrichmentRequestItem() {
        if (enrichmentRequestItem == null) {
            enrichmentRequestItem = new ArrayList<EnrichmentRequestItem>();
        }
        return this.enrichmentRequestItem;
    }

}
