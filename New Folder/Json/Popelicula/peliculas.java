package Json.Popelicula;





import java.util.Scanner;
public class peliculas {
    static Scanner leer=new Scanner(System.in);

    private String titulo;
    private String productora;
    private String nacionalidad;
    private String fecha_de_lanzamiento;
    private String director;
    
    

    

    public peliculas(String titulo, String productora, String nacionalidad, String fecha_de_lanzamiento,
            String director) {
        this.titulo = titulo;
        this.productora = productora;
        this.nacionalidad = nacionalidad;
        this.fecha_de_lanzamiento = fecha_de_lanzamiento;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getFecha_de_lanzamiento() {
        return fecha_de_lanzamiento;
    }

    public void setFecha_de_lanzamiento(String fecha_de_lanzamiento) {
        this.fecha_de_lanzamiento = fecha_de_lanzamiento;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula [titulo=" + titulo + "productora ="+productora+", nacionalidad="+nacionalidad +"fecha de lanzamiento ="+"director ="+director+"]";
    }

    public void nombredirector(){
        System.out.println("Introduce el  titulo  de la pelicula");
        String cambio =leer.next().toUpperCase();
        titulo=(cambio);
        System.out.println("Introduce la  productora  de la pelicula");
         cambio =leer.next().toUpperCase();
        productora=(cambio);
        System.out.println("Introduce la  nacionalidad  de la pelicula");
        cambio =leer.next().toUpperCase();
        nacionalidad=(cambio);
        System.out.println("Introduce la   fecha de lanzamiento  de la pelicula");
         cambio =leer.next().toUpperCase();
        fecha_de_lanzamiento=(cambio);
        System.out.println("Introduce el director  de la pelicula");
         cambio =leer.next().toUpperCase();
        director=(cambio);
        

    
    

    }
    
}
