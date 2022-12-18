package Xml.Utilidades;

import java.util.List;

import javax.xml.bind.JAXBException;

import Xml.PoActores.poactor;
import Xml.PoActores.poActores;
import Xml.PoAlquila.*;
import Xml.PoEjemplar.*;
import Xml.PoSocio.*;

public class prueba {

   public static void main(String[] args) throws JAXBException {
    

      List<poactor> actores = Back.cargarActores();
      System.out.println(actores);
      List<poalquilar> alquila = Back.cargaralquila();
      System.out.println(alquila);
      List<poejemplar> ejemplar = Back.cargarEjemplar();
      System.out.println(ejemplar);

   }
    
}