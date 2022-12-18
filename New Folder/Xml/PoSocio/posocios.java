package Xml.PoSocio;


import java.util.List;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "actores")
@XmlAccessorType(XmlAccessType.FIELD)
public class posocios {
    @XmlElement(name = "actor")
    private List<posocio> socio = null;

    public List<posocio> getsocio() {
        return socio;
    }

    public void setAlquilar(List<posocio> socio) {
        this.socio = socio;
    }

    

    @Override
    public String toString() {
        return "PoAlquilado [Alquilados=" + socio + "]";
    }
    
    
}