
package pruebaws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pruebaws package. 
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

    private final static QName _HelloResponse_QNAME = new QName("http://pruebaWS/", "helloResponse");
    private final static QName _ADDResponse_QNAME = new QName("http://pruebaWS/", "ADDResponse");
    private final static QName _ADD_QNAME = new QName("http://pruebaWS/", "ADD");
    private final static QName _Hello_QNAME = new QName("http://pruebaWS/", "hello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pruebaws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ADDResponse }
     * 
     */
    public ADDResponse createADDResponse() {
        return new ADDResponse();
    }

    /**
     * Create an instance of {@link ADD }
     * 
     */
    public ADD createADD() {
        return new ADD();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pruebaWS/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ADDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pruebaWS/", name = "ADDResponse")
    public JAXBElement<ADDResponse> createADDResponse(ADDResponse value) {
        return new JAXBElement<ADDResponse>(_ADDResponse_QNAME, ADDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ADD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pruebaWS/", name = "ADD")
    public JAXBElement<ADD> createADD(ADD value) {
        return new JAXBElement<ADD>(_ADD_QNAME, ADD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pruebaWS/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

}
