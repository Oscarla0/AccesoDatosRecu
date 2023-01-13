package com.main.Pojo;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "actores")
@XmlAccessorType(XmlAccessType.FIELD)
public class poactores {
    @XmlElement(name = "actor")
    private List<poactor> actores = null;

    public List<poactor> getactores() {
        return actores;
    }

    public void setActores(List<poactor> actores) {
        this.actores = actores;
    }

    

    @Override
    public String toString() {
        return "Poactores [actores=" + actores + "]";
    }
    
    
}