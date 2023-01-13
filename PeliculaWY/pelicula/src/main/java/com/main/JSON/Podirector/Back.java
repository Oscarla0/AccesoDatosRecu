package com.main.JSON.Podirector;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


import com.google.gson.Gson;


public class Back {
    private static final String rutaJson="C:\\Users\\Oscar\\Desktop\\PeliculaWY\\pelicula\\src\\main\\java\\com\\main\\JSON\\Podirector\\director.json";
    
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

    public static directors crearObjetoDesdeJson(){
    
        Gson gson = new Gson();
        directors Objson= gson.fromJson(leerJson(), directors.class);
        return Objson;
        
    }
}