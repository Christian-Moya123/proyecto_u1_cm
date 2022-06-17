package com.uce.edu.demo.libreria.service;

import com.uce.edu.demo.libreria.modelo.LibreriaPublica;
import com.uce.edu.demo.libreria.modelo.Registro;

public interface ILibreriaPublicaService {
	
	public void ingresarLibreria(LibreriaPublica libreria);

	public LibreriaPublica buscarPorLibreria(String numero);
	
	public void actualizarLibreria(LibreriaPublica libreria);
	
	public void borrarLibreria(String numero);

}
