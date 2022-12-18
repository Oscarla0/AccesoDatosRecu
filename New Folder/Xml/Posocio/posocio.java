
import javax.xml.bind.annotation.*;

/*anotaciones */
@XmlRootElement(name = "socios")
@XmlType(propOrder = { "dni", "nombre", "direccion","telefono","avalador"})
@XmlAccessorType(XmlAccessType.FIELD)
public class posocio {
    @XmlElement(name = "dni")
    private String dni;

    @XmlElement(name = "nombre")
    private String nombre;

    @XmlElement(name = "direccion")
    private String direccion;

    @XmlElement(name = "telefono")
    private int telefono;

    @XmlElement(name = "avalador")
    private String avalador;

    /*Getters and Setters */
    public posocio() {
    }
    
    

    public String getDni() {
        return dni;
    }



    public void setDni(String dni) {
        this.dni = dni;
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getDireccion() {
        return direccion;
    }



    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }



    public int getTelefono() {
        return telefono;
    }



    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }



    public String getAvalador() {
        return avalador;
    }



    public void setAvalador(String avalador) {
        this.avalador = avalador;
    }



    /*Constructores */
    public posocio(String dni, String nombre, String direccion, int telefono, String avalador) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.avalador = avalador;
    }


    /*ToString */
    @Override
    public String toString() {
        return "Socio [dni=" + dni + ", nombre=" + nombre +
         ", direccion=" + direccion +"telefono="+telefono+
         "avalador="+avalador +"]";
    }
}



