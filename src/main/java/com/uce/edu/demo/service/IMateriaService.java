package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;

public interface IMateriaService {
	
	public void ingresarMateria(Materia materia);

	public Materia buscarPorMateria(String materia);
	
	public void actualizarMaateria(Materia e);
	
	public void borrarMateria(String materia);

}
