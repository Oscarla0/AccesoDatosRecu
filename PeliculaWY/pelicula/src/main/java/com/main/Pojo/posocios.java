package com.main.Pojo;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "socios")
@XmlAccessorType(XmlAccessType.FIELD)
public class posocios {
    @XmlElement(name = "socio")
    private List<posocio> socio = null;

    public List<posocio> getSocio() {
        return socio;
    }

    public void SetSocio(List<posocio> socio) {
        this.socio = socio;
    }

    

    @Override
    public String toString() {
        return "PoSocio [Socios=" + socio + "]";
    }
    
    
}