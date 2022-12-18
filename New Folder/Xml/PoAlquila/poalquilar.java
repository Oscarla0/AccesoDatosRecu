package Xml.PoAlquila;


import javax.xml.bind.annotation.*;

/*anotaciones */
@XmlRootElement(name = "actores")
@XmlType(propOrder = { "nombre", "nacionalidad", "sexo","fecha_alquiler","fecha_devolucion"})
@XmlAccessorType(XmlAccessType.FIELD)
public class poalquilar {
    @XmlElement(name = "nombre")
    private String dni;

    @XmlElement(name = "nacionalidad")
    private int id_pelicula;

    @XmlElement(name = "sexo")
    private int numero;

    @XmlElement(name = "fecha_alquiler")
    private String fecha_alquiler;

    @XmlElement(name = "fecha_devolucion")
    private String fecha_devolucion;

    /*Getters and Setters */
    public poalquilar() {
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha_alquiler() {
        return fecha_alquiler;
    }

    public void setFecha_alquiler(String fecha_alquiler) {
        this.fecha_alquiler = fecha_alquiler;
    }

    public String getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(String fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }


    /*Constructores */
    public poalquilar(String dni, int id_pelicula, int numero, String fecha_alquiler, String fecha_devolucion) {
        this.dni = dni;
        this.id_pelicula = id_pelicula;
        this.numero = numero;
        this.fecha_alquiler = fecha_alquiler;
        this.fecha_devolucion = fecha_devolucion;
    }

    /*ToString */
    @Override
    public String toString() {
        return "Alquilador [dni=" + dni + ", id_pelicula=" + id_pelicula + ", numero=" + numero +"fecha_alquilar="+fecha_alquiler+"fecha_devolucion="
 +fecha_devolucion +"]";
    }
}