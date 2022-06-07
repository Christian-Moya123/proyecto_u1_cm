package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaService {
	
	public void ingresarMatricula(Matricula e);

	public Matricula buscarPorMatricula(String numero);
	
	public void actualizarMatricula(Matricula matricula);
	
	public void borrarMatricula(String numero);

}
