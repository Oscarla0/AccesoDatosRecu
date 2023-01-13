package com.main.Main;
import java.io.File;

import java.util.Scanner;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.main.Pojo.poactor;
import com.main.Pojo.poactores;
import com.main.Pojo.poalquilares;
import com.main.Pojo.poejemplares;
import com.main.Pojo.posocio;
import com.main.Pojo.posocios;

public class Utilidades {
    private static String RUTA="C:\\Users\\Oscar\\Desktop\\PeliculaWY\\pelicula\\src\\XML\\";
	  static Scanner leer = new Scanner(System.in);
	 
	
	
	public static poactores cargaractores() throws JAXBException {
		
		JAXBContext contexto= JAXBContext.newInstance(poactores.class);
		Unmarshaller um = contexto.createUnmarshaller();
		poactores actores= (poactores) um.unmarshal(new File(RUTA+"actor.xml"));
	
		return actores;
		
	}
	
	
	public static poalquilares cargaralquilares() throws JAXBException {
		
		JAXBContext contexto= JAXBContext.newInstance(poalquilares.class);
		Unmarshaller um = contexto.createUnmarshaller();
		poalquilares alquilares= (poalquilares) um.unmarshal(new File(RUTA+"alquila.xml"));
		
		return alquilares;
		
	}
	
	public static poejemplares cargarejemplares() throws JAXBException {
		
		JAXBContext contexto= JAXBContext.newInstance(poejemplares.class);
		Unmarshaller um = contexto.createUnmarshaller();
		poejemplares ejemplares= (poejemplares) um.unmarshal(new File(RUTA+"ejemplar.xml"));
		
		return ejemplares;
		
	}
	
	
	public static posocios cargarsocios() throws JAXBException {
		
		JAXBContext contexto= JAXBContext.newInstance(posocios.class);
		Unmarshaller um = contexto.createUnmarshaller();
		posocios socios= (posocios) um.unmarshal(new File(RUTA+"socio.xml"));
		
		return socios;
		
	}
	
	public static  poactores insertaractores(poactores origen) throws JAXBException {
		String nombre;
		String Sexo;
		String nacionalidad;
		System.out.println("Introduce Nombre");
		nombre=leer.next().trim();
		System.out.println("Introduce Nacionalidad");
		nacionalidad=leer.next().trim();
		System.out.println("Introduce Sexo");
		Sexo= leer.next().trim();
		poactor nuevo=new poactor(nombre,nacionalidad,Sexo);
		origen.getactores().add(nuevo);
		
		if(crearXml(origen)) {
			System.out.println("Actor insertada correctamente");
		}
		
		
		return cargaractores();
		
	}
	
	public static posocios insertarsocios(posocios origen) throws JAXBException {
		
		String dni;
		String nombre;
		String direccion; 
		int telefono; 
		String avalador;
		
		System.out.println("Introduce Dni");
		dni=leer.next().trim();
		System.out.println("Introduce Nombre");
		nombre=leer.next().trim();
		System.out.println("Introduce Direccion");
		direccion=leer.next().trim();
		System.out.println("Introduce Telefono");
		telefono=leer.nextInt();
		System.out.println("Introduce Avalador");
		avalador=leer.next().trim();
		
		posocio nueva = new posocio(dni,nombre,direccion,telefono,avalador);
		origen.getSocio().add(nueva);
		

		if(crearXml(origen)) {
			System.out.println("socio insertada correctamente");
		}
		
		
		return cargarsocios();
		
		
	}
	
	
	
	private static Boolean crearXml(Object objeto) {
		boolean ok=false;
		if( objeto instanceof posocios) {
			try {
	            JAXBContext contexto = JAXBContext.newInstance(posocios.class);
	            Marshaller mar = contexto.createMarshaller();
	            mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	            mar.marshal(objeto, new File(RUTA + "socio.xml"));
	            ok=true;
	        } catch (JAXBException jax) {
	            jax.printStackTrace();
	        }
			
		}else if(objeto instanceof poactores) {
			try {
	            JAXBContext contexto = JAXBContext.newInstance(poactores.class);
	            Marshaller mar = contexto.createMarshaller();
	            mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	            mar.marshal(objeto, new File(RUTA + "actor.xml"));
	            ok=true;
	        } catch (JAXBException jax) {
	            jax.printStackTrace();
	        }
			
		}
		return ok;
	}

}

