package com.uce.edu.demo.tarea;

import org.springframework.stereotype.Component;

@Component
public class Libro {
	
	private int numPaginas;
	private String titulo;
	private String autor;
	private double precio;
	
	
	//GET y Set
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	@Override
	public String toString() {
		return "Libro [numPaginas=" + numPaginas + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio
				+ "]";
	}
	
	
	
	
	
	
	
	
}
