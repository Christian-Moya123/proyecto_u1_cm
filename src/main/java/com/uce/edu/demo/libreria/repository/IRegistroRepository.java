package com.uce.edu.demo.libreria.repository;

import com.uce.edu.demo.libreria.modelo.LibreriaPublica;
import com.uce.edu.demo.libreria.modelo.Registro;

public interface IRegistroRepository {
	public void insertar(Registro registro);
	public Registro buscar(String numero);
	public void actualizar(Registro registro);
	public void eliminar(String numero);

}
