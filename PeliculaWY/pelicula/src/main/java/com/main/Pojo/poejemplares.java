package com.main.Pojo;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "ejemplares")
@XmlAccessorType(XmlAccessType.FIELD)
public class poejemplares {
    @XmlElement(name = "ejemplar")
    private List<poejemplar> ejemplar = null;

    public List<poejemplar> getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(List<poejemplar> ejemplar) {
        this.ejemplar = ejemplar;
    }

    

    @Override
    public String toString() {
        return "Ejemplares [ejemplar=" + ejemplar + "]";
    }
    
    
}