
package com.custodix.mpi._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsPatientNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsPatientNumber">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.custodix.com/MPI/1.0>persistentIdentificationNumber">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsPatientNumber")
public class WsPatientNumber
    extends PersistentIdentificationNumber
{


}
