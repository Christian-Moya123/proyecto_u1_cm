package com.uce.edu.demo.libreria.service;

import com.uce.edu.demo.libreria.modelo.LibreriaPrivada;
import com.uce.edu.demo.libreria.modelo.LibreriaPublica;

public interface ILibreriaPrivadaService {
	
	public void ingresarLibreria(LibreriaPrivada libreria);

	public LibreriaPrivada  buscarPorLibreria(String numero);
	
	public void actualizarLibreria(LibreriaPrivada  libreria);
	
	public void borrarLibreria(String numero);

}
