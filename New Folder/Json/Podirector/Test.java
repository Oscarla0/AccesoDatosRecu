package Json.Podirector;

public class Test {  
    public static void main(String[] args) {
        // Llamada al método para leer el json por consola
        System.out.println("-------LEEMOS FICHERO-------");
        System.out.println(Back.leerJson());
    
         // Llamamos al método que se encarga de crear el objeto desde el json
         System.out.println("-------CREAMOS OBJETO DESDE  FICHERO-------");
       directors Objson=Back.crearObjetoDesdeJson();
    
        // Imprimimos el objeto para ver que se ha creado correctamente
        System.out.println("-------LEEMOS OBJETO-------");
        System.out.println(Objson);
    
        //Llamada al método que sobreescribe el json cambiando el nivel de ingles
        System.out.println("-------CAMBIAMOS NOMBRE DEL PROTAGONISTA------");
        Back.modificarnombre(Objson);
        
        //Volvemos a leer el fichero json para comprobar el cambio y leeomos el objeto:
        System.out.println("Modificación objeto "+Objson);
        System.out.println("");
        System.out.println("Modificación fichero json "+Back.leerJson());
        
    
        
    }
    
    
    
    }
