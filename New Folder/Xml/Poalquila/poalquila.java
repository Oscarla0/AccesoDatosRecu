
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "actores")
@XmlAccessorType(XmlAccessType.FIELD)
public class poalquila {
    @XmlElement(name = "actor")
    private List<posocio> alquilar = null;

    public List<posocio> getAlquilar() {
        return alquilar;
    }

    public void setAlquilar(List<posocio> alquilar) {
        this.alquilar = alquilar;
    }

    

    @Override
    public String toString() {
        return "PoAlquilado [Alquilados=" + alquilar + "]";
    }
    
    
}