package com.uce.edu.demo.libreria.repository;

import com.uce.edu.demo.libreria.modelo.LibreriaPrivada;
import com.uce.edu.demo.libreria.modelo.LibreriaPublica;

public interface ILibreriaPublicaRepository {
	
	public void insertar(LibreriaPublica libreriaPublica);
	public LibreriaPublica buscar(String numero);
	public void actualizar(LibreriaPublica libreriaPublica);
	public void eliminar(String numero);

}
