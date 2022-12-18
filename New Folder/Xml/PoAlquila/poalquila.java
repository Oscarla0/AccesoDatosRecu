package Xml.PoAlquila;


import java.util.List;

import javax.xml.bind.annotation.*;


@XmlRootElement(name = "actores")
@XmlAccessorType(XmlAccessType.FIELD)
public class poalquila {
    @XmlElement(name = "actor")
    private List<poalquilar> alquilar = null;

    public List<poalquilar> getAlquilar() {
        return alquilar;
    }

    public void setAlquilar(List<poalquilar> alquilar) {
        this.alquilar = alquilar;
    }

    

    @Override
    public String toString() {
        return "PoAlquilado [Alquilados=" + alquilar + "]";
    }
    
    
}