package com.uce.edu.demo.tarea;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Administracion {
	//Inyeccion de dependencias por atributo
	@Autowired
	private Libro libro;
	
	@Autowired
	private Editorial editorial;
	
	
	public String venta(int numPaginas,String titulo, String autor, double precio, String nombreE, LocalDateTime fechaPublicacion ) {
		
		double iva  = precio*0.14;
		this.libro.setAutor(autor);
		this.libro.setTitulo(titulo);
		this.libro.setNumPaginas(numPaginas);
		this.libro.setPrecio(precio*iva);
		
		this.editorial.setFechaPublicacion(fechaPublicacion);
		this.editorial.setNombre(nombreE);
		
		return  "Inserccion en la base de datos DI a traves de atributos";
	}
	
	//SET y GET
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	public Editorial getEditorial() {
		return editorial;
	}
	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}

	@Override
	public String toString() {
		return "Administracion [libro=" + libro + ", editorial=" + editorial + "]";
	}
	
	
	
}
