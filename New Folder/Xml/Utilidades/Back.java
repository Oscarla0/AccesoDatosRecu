package Xml.Utilidades;



import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


import Xml.PoActores.poactor;
import Xml.PoActores.poActores;
import Xml.PoAlquila.*;
import Xml.PoEjemplar.*;
import Xml.PoSocio.*;
public class Back {
   private static String ruta_fich="\\home\\alumno\\Desktop\\New Folder\\Xml/";
    

   //CREAR OBJETOS EQUIPOS
    public static List<poactor> cargarActores()throws JAXBException{

        JAXBContext contexto = JAXBContext.newInstance(poActores.class);
        Unmarshaller um = contexto.createUnmarshaller();
        poActores au = (poActores) um.unmarshal(new File(ruta_fich+"PoActores\\PoActores.xml"));
        List<poactor> aux=(List<poactor>) au.getactores();
        System.out.println("hola");
         return aux;
        
        
    }

    //CREAR OBJETOS JUGADORES
    public static List<poalquilar> cargaralquila()throws JAXBException{

        JAXBContext contexto = JAXBContext.newInstance(poalquila.class);
        Unmarshaller um = contexto.createUnmarshaller();
        poalquila au = (poalquila) um.unmarshal(new File(ruta_fich+"PoAlquila/alquila.xml"));
        List<poalquilar> aux=(List<poalquilar>) au.getAlquilar();
         return aux;
        
        
    }

      //CREAR OBJETOS PARTIDOS
      public static List<poejemplar> cargarEjemplar()throws JAXBException{

        JAXBContext contexto = JAXBContext.newInstance(poejemplars.class);
        Unmarshaller um = contexto.createUnmarshaller();
        poejemplars au = (poejemplars) um.unmarshal(new File(ruta_fich+"PoEjemplar/ejemplar.xml"));
        List<poejemplar> aux=(List<poejemplar>) au.getEjemplar();
         return aux;
        
        
    }

    //CREAR OBJETOS ESTADISTICAS
      public static List<posocio> cargarsocio()throws JAXBException{

        JAXBContext contexto = JAXBContext.newInstance(posocios.class);
        Unmarshaller um = contexto.createUnmarshaller();
        posocios au = (posocios) um.unmarshal(new File(ruta_fich+"PoSocio/socio.xml"));
        List<posocio> aux=(List<posocio>) au.getsocio();
         return aux;
        
        
    }

    
}
