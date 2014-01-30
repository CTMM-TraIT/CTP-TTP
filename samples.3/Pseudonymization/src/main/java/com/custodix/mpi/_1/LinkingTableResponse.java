
package com.custodix.mpi._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for linkingTableResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="linkingTableResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.custodix.com/MPI/1.0}webServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="linkingTableEntry" type="{http://www.custodix.com/MPI/1.0}linkingTableEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "linkingTableResponse", propOrder = {
    "linkingTableEntry"
})
public class LinkingTableResponse
    extends WebServiceResponse
{

    protected List<LinkingTableEntry> linkingTableEntry;

    /**
     * Gets the value of the linkingTableEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkingTableEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkingTableEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkingTableEntry }
     * 
     * 
     */
    public List<LinkingTableEntry> getLinkingTableEntry() {
        if (linkingTableEntry == null) {
            linkingTableEntry = new ArrayList<LinkingTableEntry>();
        }
        return this.linkingTableEntry;
    }

}
