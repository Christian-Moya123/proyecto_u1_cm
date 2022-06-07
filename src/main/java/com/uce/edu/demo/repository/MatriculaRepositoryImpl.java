package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository{

	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base la matricula:" + matricula);
	}

	@Override
	public Matricula buscar(String matricula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado o en la base el estudiante:" + matricula );
		
		Matricula m = new Matricula();
		m.setNumero(matricula);
		return m;
	}

	@Override
	public void actualizar(Matricula matricula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base la matricula:" + matricula);
	}

	@Override
	public void eliminar(String matricula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado o en la base la matriculaa:" + matricula);
	}

}
