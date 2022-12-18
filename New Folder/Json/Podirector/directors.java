package Json.Podirector;



import java.util.Scanner;
public class directors {
    static Scanner leer=new Scanner(System.in);


    private String nombre;
    private String nacionalidad;
    
    

    public directors(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Director [nombre=" + nombre + ", nacionalidad="+nacionalidad +"]";
    }

    public void nombredirector(){
        System.out.println("Introduce el  nombre del director");
        String nombres =leer.next().toUpperCase();
        nombre=(nombres);
        System.out.println("Introduce nacionalidad del director");
        nombres =leer.next().toUpperCase();
        nacionalidad=(nombres);
        
        

    
    

    }
    
}
