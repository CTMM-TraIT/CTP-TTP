
package com.custodix.mpi._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reidentificationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reidentificationResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.custodix.com/MPI/1.0}webServiceResponse">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.custodix.com/MPI/1.0}subject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reidentificationResponse", propOrder = {
    "subject"
})
public class ReidentificationResponse
    extends WebServiceResponse
{

    protected List<Subject> subject;

    /**
     * Gets the value of the subject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subject }
     * 
     * 
     */
    public List<Subject> getSubject() {
        if (subject == null) {
            subject = new ArrayList<Subject>();
        }
        return this.subject;
    }

}
