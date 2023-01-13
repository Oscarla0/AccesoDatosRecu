package com.main.JSON.Popelicula;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Back {
    private static final String rutaJson="C:\\Users\\Oscar\\Desktop\\PeliculaWY\\pelicula\\src\\main\\java\\com\\main\\JSON\\Popelicula\\pelicula.json";
    
    /* Método para leer el Json y guardarlo en string */
    public static String leerJson(){
        String json = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(rutaJson));
    
            String linea;
            while ((linea = br.readLine()) != null) {
                json += linea;
            }
    
            br.close();
            
        } catch (IOException ex) {
            
        }
        return json;
    }

    public static peliculas crearObjetoDesdeJson(){
    
        Gson gson = new Gson();
        peliculas Objson= gson.fromJson(leerJson(), peliculas.class);
        return Objson;
        
    }

    public static void modificarnombre(peliculas aux){
        aux.nombredirector();// método de la clase que cambia el nivel
      // Sobreescribimos el json
       // Escribimos el json
       Path path = Paths.get(rutaJson);
       try {//de esta forma se le da formato para que salga ordenado
           Files.write(path, (new GsonBuilder().setPrettyPrinting().create().toJson(aux)).getBytes());
           
       } catch (IOException e) {
           e.printStackTrace();
       }

    }
}