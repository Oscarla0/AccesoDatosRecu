package com.main.Main;
import java.util.Scanner;

import javax.xml.bind.JAXBException;


import com.main.Pojo.poactores;
import com.main.Pojo.poalquilares;
import com.main.Pojo.poejemplares;
import com.main.Pojo.posocios;



public class YeWangTest {
    public static void main(String[] args) throws JAXBException {
		
		  try (Scanner leer = new Scanner(System.in)) {
			int opcion;
	        
			
	        poactores actores= Utilidades.cargaractores();
	        posocios socios= Utilidades.cargarsocios();
	        poejemplares ejemplares= Utilidades.cargarejemplares();
			
	        poalquilares alquilares= Utilidades.cargaralquilares();
	
		
		
		do{
            System.out.println("1-Mostrar datos de actores"+ "\n"+
                               "2-Mostrar todos los datos de Xml"  + "\n"+
                               "3-Insertar datos a actores"+ "\n"+
                               "4-Insertar datos a socios"+ "\n"+
							    "5-Salir");
            opcion=leer.nextInt();


            switch(opcion){
                case 1:
                	System.out.println(actores);
                	
                	break;

                case 2:
                	System.out.println(actores+"\n");
                	System.out.println("");
                	
                	System.out.println(socios+"\n");
                	System.out.println("");
                	
                	System.out.println(ejemplares+"\n");
                	System.out.println("");
                	
                	System.out.println(alquilares+"\n");
                	System.out.println("");
                	
                	break;

                case 3:
                	actores=Utilidades.insertaractores(actores);
                	break;
                
                case 4:
                	socios=Utilidades.insertarsocios(socios);
                	break;
                
        
                case 5:
                	System.out.println("ADIOS");
                	break;

                default:
                	break;
            }

        }while(opcion!=5);
		}

	}


}

