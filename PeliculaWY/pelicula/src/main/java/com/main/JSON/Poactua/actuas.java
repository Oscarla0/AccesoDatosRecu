package com.main.JSON.Poactua;

import java.util.Scanner;
public class actuas {
    static Scanner leer=new Scanner(System.in);


    private String id_pelicula;
    private String protagonista;
    
    public actuas(String id_pelicula, String protagonista) {
        this.id_pelicula = id_pelicula;
        this.protagonista = protagonista;
    }
    


    public String getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(String id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public String getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }

    @Override
    public String toString() {
        return "Actua [id_pelicula=" + id_pelicula + ", protagonista="+protagonista +"]";
    }

    public void protagonistanombre(){
        System.out.println("Introduce el nuevo nombre del protagonista");
        String nombre= leer.next().toUpperCase();
        protagonista=(nombre);
        

    
    

    }
    
}