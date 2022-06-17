package com.uce.edu.demo.libreria.repository;

import com.uce.edu.demo.libreria.modelo.LibreriaPrivada;
import com.uce.edu.demo.modelo.Matricula;

public interface ILibreriaPrivadaRepository {
	
	public void insertar(LibreriaPrivada libreriaPrivada);
	public LibreriaPrivada buscar(String numero);
	public void actualizar(LibreriaPrivada libreriaPrivada);
	public void eliminar(String numero);

}
