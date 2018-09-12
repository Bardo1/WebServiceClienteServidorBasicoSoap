
package pruebaws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ADD complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ADD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valor1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="valor2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ADD", propOrder = {
    "valor1",
    "valor2"
})
public class ADD {

    protected int valor1;
    protected int valor2;

    /**
     * Obtiene el valor de la propiedad valor1.
     * 
     */
    public int getValor1() {
        return valor1;
    }

    /**
     * Define el valor de la propiedad valor1.
     * 
     */
    public void setValor1(int value) {
        this.valor1 = value;
    }

    /**
     * Obtiene el valor de la propiedad valor2.
     * 
     */
    public int getValor2() {
        return valor2;
    }

    /**
     * Define el valor de la propiedad valor2.
     * 
     */
    public void setValor2(int value) {
        this.valor2 = value;
    }

}
