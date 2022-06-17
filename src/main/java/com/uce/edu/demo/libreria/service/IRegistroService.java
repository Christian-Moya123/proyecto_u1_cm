package com.uce.edu.demo.libreria.service;

import com.uce.edu.demo.libreria.modelo.Registro;
import com.uce.edu.demo.modelo.Matricula;

public interface IRegistroService {
	
	public void ingresarRegistro(Registro e);

	public Registro buscarPorRegistro(String numero);
	
	public void actualizarRegistro(Registro matricula);
	
	public void borrarRegistro(String numero);

}
