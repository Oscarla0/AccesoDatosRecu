
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "actores")
@XmlAccessorType(XmlAccessType.FIELD)
public class poActores {
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
        return "PoEquipos [equipos=" + actores + "]";
    }
    
    
}