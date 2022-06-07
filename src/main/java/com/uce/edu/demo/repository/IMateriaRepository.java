package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;

public interface IMateriaRepository {
	//CRUD
		//C: CREAAR/INSERTAR
		public void insertar(Materia materia);
		
		//R: leer/ buscar
		public Materia buscar(String materia);
		
		//U: actualizar
		public void actualizar(Materia materia);
		
		//D: eliminar
		public void eliminar(String materia);

}
