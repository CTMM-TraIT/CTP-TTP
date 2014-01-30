
package com.custodix.mpi._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.custodix.mpi._1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EnrichResponse_QNAME = new QName("http://www.custodix.com/MPI/1.0", "enrichResponse");
    private final static QName _SubjectExclusionResponse_QNAME = new QName("http://www.custodix.com/MPI/1.0", "subjectExclusionResponse");
    private final static QName _Enrich_QNAME = new QName("http://www.custodix.com/MPI/1.0", "enrich");
    private final static QName _NoSuchResearchProjectException_QNAME = new QName("http://www.custodix.com/MPI/1.0", "NoSuchResearchProjectException");
    private final static QName _RequestPseudonyms_QNAME = new QName("http://www.custodix.com/MPI/1.0", "requestPseudonyms");
    private final static QName _RequestLinkingTable_QNAME = new QName("http://www.custodix.com/MPI/1.0", "requestLinkingTable");
    private final static QName _RequestPseudonymsResponse_QNAME = new QName("http://www.custodix.com/MPI/1.0", "requestPseudonymsResponse");
    private final static QName _LinkingTableRequest_QNAME = new QName("http://www.custodix.com/MPI/1.0", "linkingTableRequest");
    private final static QName _ExcludeSubjectResponse_QNAME = new QName("http://www.custodix.com/MPI/1.0", "excludeSubjectResponse");
    private final static QName _ReidentifyResponse_QNAME = new QName("http://www.custodix.com/MPI/1.0", "reidentifyResponse");
    private final static QName _DataValidationException_QNAME = new QName("http://www.custodix.com/MPI/1.0", "DataValidationException");
    private final static QName _NoSuchPseudonymException_QNAME = new QName("http://www.custodix.com/MPI/1.0", "NoSuchPseudonymException");
    private final static QName _Source_QNAME = new QName("http://www.custodix.com/MPI/1.0", "source");
    private final static QName _ExcludeSubject_QNAME = new QName("http://www.custodix.com/MPI/1.0", "excludeSubject");
    private final static QName _PseudonymLinkingRequest_QNAME = new QName("http://www.custodix.com/MPI/1.0", "pseudonymLinkingRequest");
    private final static QName _LinkPseudonymsResponse_QNAME = new QName("http://www.custodix.com/MPI/1.0", "linkPseudonymsResponse");
    private final static QName _Reidentify_QNAME = new QName("http://www.custodix.com/MPI/1.0", "reidentify");
    private final static QName _InternalError_QNAME = new QName("http://www.custodix.com/MPI/1.0", "InternalError");
    private final static QName _ReidentificationRequest_QNAME = new QName("http://www.custodix.com/MPI/1.0", "reidentificationRequest");
    private final static QName _ReidentificationResponse_QNAME = new QName("http://www.custodix.com/MPI/1.0", "reidentificationResponse");
    private final static QName _Subject_QNAME = new QName("http://www.custodix.com/MPI/1.0", "subject");
    private final static QName _PseudonymizationRequest_QNAME = new QName("http://www.custodix.com/MPI/1.0", "pseudonymizationRequest");
    private final static QName _LinkPseudonyms_QNAME = new QName("http://www.custodix.com/MPI/1.0", "linkPseudonyms");
    private final static QName _AccessDeniedException_QNAME = new QName("http://www.custodix.com/MPI/1.0", "AccessDeniedException");
    private final static QName _RequestLinkingTableResponse_QNAME = new QName("http://www.custodix.com/MPI/1.0", "requestLinkingTableResponse");
    private final static QName _NoSuchSourceException_QNAME = new QName("http://www.custodix.com/MPI/1.0", "NoSuchSourceException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.custodix.mpi._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PseudonymLinkingRequest }
     * 
     */
    public PseudonymLinkingRequest createPseudonymLinkingRequest() {
        return new PseudonymLinkingRequest();
    }

    /**
     * Create an instance of {@link PseudonymizationRequest }
     * 
     */
    public PseudonymizationRequest createPseudonymizationRequest() {
        return new PseudonymizationRequest();
    }

    /**
     * Create an instance of {@link Subject }
     * 
     */
    public Subject createSubject() {
        return new Subject();
    }

    /**
     * Create an instance of {@link ReidentificationResponse }
     * 
     */
    public ReidentificationResponse createReidentificationResponse() {
        return new ReidentificationResponse();
    }

    /**
     * Create an instance of {@link ReidentificationRequest }
     * 
     */
    public ReidentificationRequest createReidentificationRequest() {
        return new ReidentificationRequest();
    }

    /**
     * Create an instance of {@link InternalError }
     * 
     */
    public InternalError createInternalError() {
        return new InternalError();
    }

    /**
     * Create an instance of {@link NoSuchSourceException }
     * 
     */
    public NoSuchSourceException createNoSuchSourceException() {
        return new NoSuchSourceException();
    }

    /**
     * Create an instance of {@link LinkingTableResponse }
     * 
     */
    public LinkingTableResponse createLinkingTableResponse() {
        return new LinkingTableResponse();
    }

    /**
     * Create an instance of {@link AccessDeniedException }
     * 
     */
    public AccessDeniedException createAccessDeniedException() {
        return new AccessDeniedException();
    }

    /**
     * Create an instance of {@link PseudonymizationResponse }
     * 
     */
    public PseudonymizationResponse createPseudonymizationResponse() {
        return new PseudonymizationResponse();
    }

    /**
     * Create an instance of {@link LinkingTableRequest }
     * 
     */
    public LinkingTableRequest createLinkingTableRequest() {
        return new LinkingTableRequest();
    }

    /**
     * Create an instance of {@link SubjectExclusionResponse }
     * 
     */
    public SubjectExclusionResponse createSubjectExclusionResponse() {
        return new SubjectExclusionResponse();
    }

    /**
     * Create an instance of {@link EnrichmentRequest }
     * 
     */
    public EnrichmentRequest createEnrichmentRequest() {
        return new EnrichmentRequest();
    }

    /**
     * Create an instance of {@link NoSuchResearchProjectException }
     * 
     */
    public NoSuchResearchProjectException createNoSuchResearchProjectException() {
        return new NoSuchResearchProjectException();
    }

    /**
     * Create an instance of {@link EnrichmentResponse }
     * 
     */
    public EnrichmentResponse createEnrichmentResponse() {
        return new EnrichmentResponse();
    }

    /**
     * Create an instance of {@link SubjectExclusionRequest }
     * 
     */
    public SubjectExclusionRequest createSubjectExclusionRequest() {
        return new SubjectExclusionRequest();
    }

    /**
     * Create an instance of {@link NoSuchPseudonymException }
     * 
     */
    public NoSuchPseudonymException createNoSuchPseudonymException() {
        return new NoSuchPseudonymException();
    }

    /**
     * Create an instance of {@link DataValidationException }
     * 
     */
    public DataValidationException createDataValidationException() {
        return new DataValidationException();
    }

    /**
     * Create an instance of {@link WsInsuranceNumber }
     * 
     */
    public WsInsuranceNumber createWsInsuranceNumber() {
        return new WsInsuranceNumber();
    }

    /**
     * Create an instance of {@link WsDateOfBirth }
     * 
     */
    public WsDateOfBirth createWsDateOfBirth() {
        return new WsDateOfBirth();
    }

    /**
     * Create an instance of {@link WsLogicalSourceId }
     * 
     */
    public WsLogicalSourceId createWsLogicalSourceId() {
        return new WsLogicalSourceId();
    }

    /**
     * Create an instance of {@link WsSourcePseudonym }
     * 
     */
    public WsSourcePseudonym createWsSourcePseudonym() {
        return new WsSourcePseudonym();
    }

    /**
     * Create an instance of {@link WsLastName }
     * 
     */
    public WsLastName createWsLastName() {
        return new WsLastName();
    }

    /**
     * Create an instance of {@link PersistentIdentificationNumber }
     * 
     */
    public PersistentIdentificationNumber createPersistentIdentificationNumber() {
        return new PersistentIdentificationNumber();
    }

    /**
     * Create an instance of {@link WsAddress }
     * 
     */
    public WsAddress createWsAddress() {
        return new WsAddress();
    }

    /**
     * Create an instance of {@link LinkingTableEntry }
     * 
     */
    public LinkingTableEntry createLinkingTableEntry() {
        return new LinkingTableEntry();
    }

    /**
     * Create an instance of {@link WsPatientNumber }
     * 
     */
    public WsPatientNumber createWsPatientNumber() {
        return new WsPatientNumber();
    }

    /**
     * Create an instance of {@link WsTitle }
     * 
     */
    public WsTitle createWsTitle() {
        return new WsTitle();
    }

    /**
     * Create an instance of {@link EnrichmentRequestItem }
     * 
     */
    public EnrichmentRequestItem createEnrichmentRequestItem() {
        return new EnrichmentRequestItem();
    }

    /**
     * Create an instance of {@link WsAttribute }
     * 
     */
    public WsAttribute createWsAttribute() {
        return new WsAttribute();
    }

    /**
     * Create an instance of {@link WsSource }
     * 
     */
    public WsSource createWsSource() {
        return new WsSource();
    }

    /**
     * Create an instance of {@link WsPostalCode }
     * 
     */
    public WsPostalCode createWsPostalCode() {
        return new WsPostalCode();
    }

    /**
     * Create an instance of {@link WsLinkedPseudonym }
     * 
     */
    public WsLinkedPseudonym createWsLinkedPseudonym() {
        return new WsLinkedPseudonym();
    }

    /**
     * Create an instance of {@link WsPlaceOfBirth }
     * 
     */
    public WsPlaceOfBirth createWsPlaceOfBirth() {
        return new WsPlaceOfBirth();
    }

    /**
     * Create an instance of {@link WsFullName }
     * 
     */
    public WsFullName createWsFullName() {
        return new WsFullName();
    }

    /**
     * Create an instance of {@link WsPhoneNumber }
     * 
     */
    public WsPhoneNumber createWsPhoneNumber() {
        return new WsPhoneNumber();
    }

    /**
     * Create an instance of {@link WsName }
     * 
     */
    public WsName createWsName() {
        return new WsName();
    }

    /**
     * Create an instance of {@link WsEmailAddress }
     * 
     */
    public WsEmailAddress createWsEmailAddress() {
        return new WsEmailAddress();
    }

    /**
     * Create an instance of {@link WsNationalIdentificationNumber }
     * 
     */
    public WsNationalIdentificationNumber createWsNationalIdentificationNumber() {
        return new WsNationalIdentificationNumber();
    }

    /**
     * Create an instance of {@link WsMaritalStatus }
     * 
     */
    public WsMaritalStatus createWsMaritalStatus() {
        return new WsMaritalStatus();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnrichmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.custodix.com/MPI/1.0", name = "enrichResponse")
    public JAXBElement<EnrichmentResponse> createEnrichResponse(EnrichmentResponse value) {
        return new JAXBElement<EnrichmentResponse>(_EnrichResponse_QNAME, EnrichmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectExclusionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.custodix.com/MPI/1.0", name = "subjectExclusionResponse")
    public JAXBElement<SubjectExclusionResponse> createSubjectExclusionResponse(SubjectExclusionResponse value) {
        return new JAXBElement<SubjectExclusionResponse>(_SubjectExclusionResponse_QNAME, SubjectExclusionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnrichmentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.custodix.com/MPI/1.0", name = "enrich")
    public JAXBElement<EnrichmentRequest> createEnrich(EnrichmentRequest value) {
        return new JAXBElement<EnrichmentRequest>(_Enrich_QNAME, EnrichmentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoSuchResearchProjectException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.custodix.com/MPI/1.0", name = "NoSuchResearchProjectException")
    public JAXBElement<NoSuchResearchProjectException> createNoSuchResearchProjectException(NoSuchResearchProjectException value) {
        return new JAXBElement<NoSuchResearchProjectException>(_NoSuchResearchProjectException_QNAME, NoSuchResearchProjectException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PseudonymizationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.custodix.com/MPI/1.0", name = "requestPseudonyms")
    public JAXBElement<PseudonymizationRequest> createRequestPseudonyms(PseudonymizationRequest value) {
        return new JAXBElement<PseudonymizationRequest>(_RequestPseudonyms_QNAME, PseudonymizationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkingTableRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.custodix.com/MPI/1.0", name = "requestLinkingTable")
    public JAXBElement<LinkingTableRequest> createRequestLinkingTable(LinkingTableRequest value) {
        return new JAXBElement<LinkingTableRequest>(_RequestLinkingTable_QNAME, LinkingTableRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PseudonymizationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.custodix.com/MPI/1.0", name = "requestPseudonymsResponse")
    public JAXBElement<PseudonymizationResponse> createRequestPseudonymsResponse(PseudonymizationResponse value) {
        return new JAXBElement<PseudonymizationResponse>(_RequestPseudonymsResponse_QNAME, PseudonymizationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkingTableRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.custodix.com/MPI/1.0", name = "linkingTableRequest")
    public JAXBElement<LinkingTableRequest> createLinkingTableRequest(LinkingTableRequest value) {
        return new JAXBElement<LinkingTableRequest>(_LinkingTableRequest_QNAME, LinkingTableRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectExclusionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.custodix.com/MPI/1.0", name = "excludeSubjectResponse")
    public JAXBElement<SubjectExclusionResponse> createExcludeSubjectResponse(SubjectExclusionResponse value) {
        return new JAXBElement<SubjectExclusionResponse>(_ExcludeSubjectResponse_QNAME, SubjectExclusionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReidentificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.custodix.com/MPI/1.0", name = "reidentifyResponse")
    public JAXBElement<ReidentificationResponse> createReidentifyResponse(ReidentificationResponse value) {
        return new JAXBElement<ReidentificationResponse>(_ReidentifyResponse_QNAME, ReidentificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataValidationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.custodix.com/MPI/1.0", name = "DataValidationException")
    public JAXBElement<DataValidationException> createDataValidationException(DataValidationException value) {
        return new JAXBElement<DataValidationException>(_DataValidationException_QNAME, DataValidationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoSuchPseudonymException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.custodix.com/MPI/1.0", name = "NoSuchPseudonymException")
    public JAXBElement<NoSuchPseudonymException> createNoSuchPseudonymException(NoSuchPseudonymException value) {
        return new JAXBElement<NoSuchPseudonymException>(_NoSuchPseudonymException_QNAME, NoSuchPseudonymException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.custodix.com/MPI/1.0", name = "source")
    public JAXBElement<Object> createSource(Object value) {
        return new JAXBElement<Object>(_Source_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectExclusionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.custodix.com/MPI/1.0", name = "excludeSubject")
    public JAXBElement<SubjectExclusionRequest> createExcludeSubject(SubjectExclusionRequest value) {
        return new JAXBElement<SubjectExclusionRequest>(_ExcludeSubject_QNAME, SubjectExclusionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PseudonymLinkingRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.custodix.com/MPI/1.0", name = "pseudonymLinkingRequest")
    public JAXBElement<PseudonymLinkingRequest> createPseudonymLinkingRequest(PseudonymLinkingRequest value) {
        return new JAXBElement<PseudonymLinkingRequest>(_PseudonymLinkingRequest_QNAME, PseudonymLinkingRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PseudonymizationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.custodix.com/MPI/1.0", name = "linkPseudonymsResponse")
    public JAXBElement<PseudonymizationResponse> createLinkPseudonymsResponse(PseudonymizationResponse value) {
        return new JAXBElement<PseudonymizationResponse>(_LinkPseudonymsResponse_QNAME, PseudonymizationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReidentificationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.custodix.com/MPI/1.0", name = "reidentify")
    public JAXBElement<ReidentificationRequest> createReidentify(ReidentificationRequest value) {
        return new JAXBElement<ReidentificationRequest>(_Reidentify_QNAME, ReidentificationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternalError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.custodix.com/MPI/1.0", name = "InternalError")
    public JAXBElement<InternalError> createInternalError(InternalError value) {
        return new JAXBElement<InternalError>(_InternalError_QNAME, InternalError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReidentificationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.custodix.com/MPI/1.0", name = "reidentificationRequest")
    public JAXBElement<ReidentificationRequest> createReidentificationRequest(ReidentificationRequest value) {
        return new JAXBElement<ReidentificationRequest>(_ReidentificationRequest_QNAME, ReidentificationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReidentificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.custodix.com/MPI/1.0", name = "reidentificationResponse")
    public JAXBElement<ReidentificationResponse> createReidentificationResponse(ReidentificationResponse value) {
        return new JAXBElement<ReidentificationResponse>(_ReidentificationResponse_QNAME, ReidentificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.custodix.com/MPI/1.0", name = "subject")
    public JAXBElement<Subject> createSubject(Subject value) {
        return new JAXBElement<Subject>(_Subject_QNAME, Subject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PseudonymizationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.custodix.com/MPI/1.0", name = "pseudonymizationRequest")
    public JAXBElement<PseudonymizationRequest> createPseudonymizationRequest(PseudonymizationRequest value) {
        return new JAXBElement<PseudonymizationRequest>(_PseudonymizationRequest_QNAME, PseudonymizationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PseudonymLinkingRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.custodix.com/MPI/1.0", name = "linkPseudonyms")
    public JAXBElement<PseudonymLinkingRequest> createLinkPseudonyms(PseudonymLinkingRequest value) {
        return new JAXBElement<PseudonymLinkingRequest>(_LinkPseudonyms_QNAME, PseudonymLinkingRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessDeniedException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.custodix.com/MPI/1.0", name = "AccessDeniedException")
    public JAXBElement<AccessDeniedException> createAccessDeniedException(AccessDeniedException value) {
        return new JAXBElement<AccessDeniedException>(_AccessDeniedException_QNAME, AccessDeniedException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkingTableResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.custodix.com/MPI/1.0", name = "requestLinkingTableResponse")
    public JAXBElement<LinkingTableResponse> createRequestLinkingTableResponse(LinkingTableResponse value) {
        return new JAXBElement<LinkingTableResponse>(_RequestLinkingTableResponse_QNAME, LinkingTableResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoSuchSourceException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.custodix.com/MPI/1.0", name = "NoSuchSourceException")
    public JAXBElement<NoSuchSourceException> createNoSuchSourceException(NoSuchSourceException value) {
        return new JAXBElement<NoSuchSourceException>(_NoSuchSourceException_QNAME, NoSuchSourceException.class, null, value);
    }

}
