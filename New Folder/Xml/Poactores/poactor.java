
import javax.xml.bind.annotation.*;

/*anotaciones */
@XmlRootElement(name = "actores")
@XmlType(propOrder = { "nombre", "nacionalidad", "sexo"})
@XmlAccessorType(XmlAccessType.FIELD)
public class poactor {
    @XmlElement(name = "nombre")
    private String nombre;

    @XmlElement(name = "nacionalidad")
    private String nacionalidad;

    @XmlElement(name = "sexo")
    private String sexo;


    /*Getters and Setters */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /*Constructores */
    public poactor(String nombre, String nacionalidad, String sexo) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.sexo = sexo;
    }

    

    public poactor() {
    }
    
    /*ToString */
    @Override
    public String toString() {
        return "Actor [nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", sexo=" + sexo 
                +"]";
    }
}