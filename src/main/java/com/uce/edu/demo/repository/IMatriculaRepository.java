package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaRepository {
	
	//CRUD
		//C: CREAAR/INSERTAR
		public void insertar(Matricula matricula);
		
		//R: leer/ buscar
		public Matricula buscar(String matricula);
		
		//U: actualizar
		public void actualizar(Matricula matricula);
		
		//D: eliminar
		public void eliminar(String matricula);

}
