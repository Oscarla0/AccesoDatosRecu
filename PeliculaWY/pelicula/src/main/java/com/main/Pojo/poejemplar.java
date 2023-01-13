package com.main.Pojo;
import javax.xml.bind.annotation.*;

/*anotaciones */
@XmlRootElement(name = "ejemplar")
@XmlType(propOrder = { "id", "nombre", "estado"})
@XmlAccessorType(XmlAccessType.FIELD)
public class poejemplar {
    @XmlElement(name = "id")
    private int id;

    @XmlElement(name = "nombre")
    private String nombre;

    @XmlElement(name = "estado")
    private String estado;


    /*Getters and Setters */
    public poejemplar() {
    }
    
    

    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getEstado() {
        return estado;
    }



    public void setEstado(String estado) {
        this.estado = estado;
    }



    /*Constructores */
    public poejemplar(int id, String nombre, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
    }
    /*ToString */
    @Override
    public String toString() {
        return "Ejemplares [id=" + id + ", nombre=" + nombre + ", estado=" + estado 
     +"]";
    }



  
}