
package libro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the libro package. 
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

    private final static QName _LibroEntity_QNAME = new QName("http://libro/", "libroEntity");
    private final static QName _LibroService_QNAME = new QName("http://libro/", "libroService");
    private final static QName _LibroServiceResponse_QNAME = new QName("http://libro/", "libroServiceResponse");
    private final static QName _RemoveLibro_QNAME = new QName("http://libro/", "removeLibro");
    private final static QName _RemoveLibroResponse_QNAME = new QName("http://libro/", "removeLibroResponse");
    private final static QName _SaveLibro_QNAME = new QName("http://libro/", "saveLibro");
    private final static QName _SaveLibroResponse_QNAME = new QName("http://libro/", "saveLibroResponse");
    private final static QName _TrovaId_QNAME = new QName("http://libro/", "trovaId");
    private final static QName _TrovaIdResponse_QNAME = new QName("http://libro/", "trovaIdResponse");
    private final static QName _TrovaNome_QNAME = new QName("http://libro/", "trovaNome");
    private final static QName _TrovaNomeResponse_QNAME = new QName("http://libro/", "trovaNomeResponse");
    private final static QName _TrovaTutti_QNAME = new QName("http://libro/", "trovaTutti");
    private final static QName _TrovaTuttiResponse_QNAME = new QName("http://libro/", "trovaTuttiResponse");
    private final static QName _UpdateLibro_QNAME = new QName("http://libro/", "updateLibro");
    private final static QName _UpdateLibroResponse_QNAME = new QName("http://libro/", "updateLibroResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: libro
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LibroEntity }
     * 
     */
    public LibroEntity createLibroEntity() {
        return new LibroEntity();
    }

    /**
     * Create an instance of {@link LibroService }
     * 
     */
    public LibroService createLibroService() {
        return new LibroService();
    }

    /**
     * Create an instance of {@link LibroServiceResponse }
     * 
     */
    public LibroServiceResponse createLibroServiceResponse() {
        return new LibroServiceResponse();
    }

    /**
     * Create an instance of {@link RemoveLibro }
     * 
     */
    public RemoveLibro createRemoveLibro() {
        return new RemoveLibro();
    }

    /**
     * Create an instance of {@link RemoveLibroResponse }
     * 
     */
    public RemoveLibroResponse createRemoveLibroResponse() {
        return new RemoveLibroResponse();
    }

    /**
     * Create an instance of {@link SaveLibro }
     * 
     */
    public SaveLibro createSaveLibro() {
        return new SaveLibro();
    }

    /**
     * Create an instance of {@link SaveLibroResponse }
     * 
     */
    public SaveLibroResponse createSaveLibroResponse() {
        return new SaveLibroResponse();
    }

    /**
     * Create an instance of {@link TrovaId }
     * 
     */
    public TrovaId createTrovaId() {
        return new TrovaId();
    }

    /**
     * Create an instance of {@link TrovaIdResponse }
     * 
     */
    public TrovaIdResponse createTrovaIdResponse() {
        return new TrovaIdResponse();
    }

    /**
     * Create an instance of {@link TrovaNome }
     * 
     */
    public TrovaNome createTrovaNome() {
        return new TrovaNome();
    }

    /**
     * Create an instance of {@link TrovaNomeResponse }
     * 
     */
    public TrovaNomeResponse createTrovaNomeResponse() {
        return new TrovaNomeResponse();
    }

    /**
     * Create an instance of {@link TrovaTutti }
     * 
     */
    public TrovaTutti createTrovaTutti() {
        return new TrovaTutti();
    }

    /**
     * Create an instance of {@link TrovaTuttiResponse }
     * 
     */
    public TrovaTuttiResponse createTrovaTuttiResponse() {
        return new TrovaTuttiResponse();
    }

    /**
     * Create an instance of {@link UpdateLibro }
     * 
     */
    public UpdateLibro createUpdateLibro() {
        return new UpdateLibro();
    }

    /**
     * Create an instance of {@link UpdateLibroResponse }
     * 
     */
    public UpdateLibroResponse createUpdateLibroResponse() {
        return new UpdateLibroResponse();
    }

    /**
     * Create an instance of {@link LocalDate }
     * 
     */
    public LocalDate createLocalDate() {
        return new LocalDate();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LibroEntity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LibroEntity }{@code >}
     */
    @XmlElementDecl(namespace = "http://libro/", name = "libroEntity")
    public JAXBElement<LibroEntity> createLibroEntity(LibroEntity value) {
        return new JAXBElement<LibroEntity>(_LibroEntity_QNAME, LibroEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LibroService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LibroService }{@code >}
     */
    @XmlElementDecl(namespace = "http://libro/", name = "libroService")
    public JAXBElement<LibroService> createLibroService(LibroService value) {
        return new JAXBElement<LibroService>(_LibroService_QNAME, LibroService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LibroServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LibroServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://libro/", name = "libroServiceResponse")
    public JAXBElement<LibroServiceResponse> createLibroServiceResponse(LibroServiceResponse value) {
        return new JAXBElement<LibroServiceResponse>(_LibroServiceResponse_QNAME, LibroServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveLibro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveLibro }{@code >}
     */
    @XmlElementDecl(namespace = "http://libro/", name = "removeLibro")
    public JAXBElement<RemoveLibro> createRemoveLibro(RemoveLibro value) {
        return new JAXBElement<RemoveLibro>(_RemoveLibro_QNAME, RemoveLibro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveLibroResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveLibroResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://libro/", name = "removeLibroResponse")
    public JAXBElement<RemoveLibroResponse> createRemoveLibroResponse(RemoveLibroResponse value) {
        return new JAXBElement<RemoveLibroResponse>(_RemoveLibroResponse_QNAME, RemoveLibroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveLibro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveLibro }{@code >}
     */
    @XmlElementDecl(namespace = "http://libro/", name = "saveLibro")
    public JAXBElement<SaveLibro> createSaveLibro(SaveLibro value) {
        return new JAXBElement<SaveLibro>(_SaveLibro_QNAME, SaveLibro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveLibroResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveLibroResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://libro/", name = "saveLibroResponse")
    public JAXBElement<SaveLibroResponse> createSaveLibroResponse(SaveLibroResponse value) {
        return new JAXBElement<SaveLibroResponse>(_SaveLibroResponse_QNAME, SaveLibroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaId }{@code >}
     */
    @XmlElementDecl(namespace = "http://libro/", name = "trovaId")
    public JAXBElement<TrovaId> createTrovaId(TrovaId value) {
        return new JAXBElement<TrovaId>(_TrovaId_QNAME, TrovaId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://libro/", name = "trovaIdResponse")
    public JAXBElement<TrovaIdResponse> createTrovaIdResponse(TrovaIdResponse value) {
        return new JAXBElement<TrovaIdResponse>(_TrovaIdResponse_QNAME, TrovaIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaNome }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaNome }{@code >}
     */
    @XmlElementDecl(namespace = "http://libro/", name = "trovaNome")
    public JAXBElement<TrovaNome> createTrovaNome(TrovaNome value) {
        return new JAXBElement<TrovaNome>(_TrovaNome_QNAME, TrovaNome.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaNomeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaNomeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://libro/", name = "trovaNomeResponse")
    public JAXBElement<TrovaNomeResponse> createTrovaNomeResponse(TrovaNomeResponse value) {
        return new JAXBElement<TrovaNomeResponse>(_TrovaNomeResponse_QNAME, TrovaNomeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaTutti }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaTutti }{@code >}
     */
    @XmlElementDecl(namespace = "http://libro/", name = "trovaTutti")
    public JAXBElement<TrovaTutti> createTrovaTutti(TrovaTutti value) {
        return new JAXBElement<TrovaTutti>(_TrovaTutti_QNAME, TrovaTutti.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaTuttiResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaTuttiResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://libro/", name = "trovaTuttiResponse")
    public JAXBElement<TrovaTuttiResponse> createTrovaTuttiResponse(TrovaTuttiResponse value) {
        return new JAXBElement<TrovaTuttiResponse>(_TrovaTuttiResponse_QNAME, TrovaTuttiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLibro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateLibro }{@code >}
     */
    @XmlElementDecl(namespace = "http://libro/", name = "updateLibro")
    public JAXBElement<UpdateLibro> createUpdateLibro(UpdateLibro value) {
        return new JAXBElement<UpdateLibro>(_UpdateLibro_QNAME, UpdateLibro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLibroResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateLibroResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://libro/", name = "updateLibroResponse")
    public JAXBElement<UpdateLibroResponse> createUpdateLibroResponse(UpdateLibroResponse value) {
        return new JAXBElement<UpdateLibroResponse>(_UpdateLibroResponse_QNAME, UpdateLibroResponse.class, null, value);
    }

}
