package com.main.Pojo;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "alquileres")
@XmlAccessorType(XmlAccessType.FIELD)
public class poalquilares {
    @XmlElement(name = "alquiler")
    private List<poalquilar> alquilar = null;

    public List<poalquilar> GetAlquilar() {
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