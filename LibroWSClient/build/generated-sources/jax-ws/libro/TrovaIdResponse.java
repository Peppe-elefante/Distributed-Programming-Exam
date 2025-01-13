
package libro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for trovaIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trovaIdResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://libro/}libroEntity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trovaIdResponse", propOrder = {
    "_return"
})
public class TrovaIdResponse {

    @XmlElement(name = "return")
    protected LibroEntity _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link LibroEntity }
     *     
     */
    public LibroEntity getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link LibroEntity }
     *     
     */
    public void setReturn(LibroEntity value) {
        this._return = value;
    }

}
