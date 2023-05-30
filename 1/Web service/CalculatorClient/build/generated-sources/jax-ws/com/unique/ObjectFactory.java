
package com.unique;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.unique package. 
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

    private final static QName _GrtNumber_QNAME = new QName("http://unique.com/", "grtNumber");
    private final static QName _GrtNumberResponse_QNAME = new QName("http://unique.com/", "grtNumberResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.unique
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GrtNumberResponse }
     * 
     */
    public GrtNumberResponse createGrtNumberResponse() {
        return new GrtNumberResponse();
    }

    /**
     * Create an instance of {@link GrtNumber }
     * 
     */
    public GrtNumber createGrtNumber() {
        return new GrtNumber();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrtNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unique.com/", name = "grtNumber")
    public JAXBElement<GrtNumber> createGrtNumber(GrtNumber value) {
        return new JAXBElement<GrtNumber>(_GrtNumber_QNAME, GrtNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrtNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unique.com/", name = "grtNumberResponse")
    public JAXBElement<GrtNumberResponse> createGrtNumberResponse(GrtNumberResponse value) {
        return new JAXBElement<GrtNumberResponse>(_GrtNumberResponse_QNAME, GrtNumberResponse.class, null, value);
    }

}
