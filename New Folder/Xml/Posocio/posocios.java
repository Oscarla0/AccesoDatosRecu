
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "actores")
@XmlAccessorType(XmlAccessType.FIELD)
public class posocios {
    @XmlElement(name = "actor")
    private List<poejemplar> alquilar = null;

    public List<poejemplar> getAlquilar() {
        return alquilar;
    }

    public void setAlquilar(List<poejemplar> alquilar) {
        this.alquilar = alquilar;
    }

    

    @Override
    public String toString() {
        return "PoAlquilado [Alquilados=" + alquilar + "]";
    }
    
    
}