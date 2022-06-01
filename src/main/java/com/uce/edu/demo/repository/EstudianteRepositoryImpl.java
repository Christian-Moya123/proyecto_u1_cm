package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Estudiante;

public class EstudianteRepositoryImpl implements IEstudianteRepository{

	@Override
	public void insertar(Estudiante e) {
		// TODO Auto-generated method stub
		//aqui se realiza la inserccion en la base de datos
		System.out.println("Se ha insertado en la base el estudiante:" +e);
	}



	@Override
	public void actualizar(Estudiante e) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base el estudiante:" +e);
		
	}

	@Override
	public void eliminar(String cedula) {
		System.out.println("Se ha eliminado o en la base el estudiante:" +cedula);
		
	}


	@Override
	public Estudiante buscar(String apellido) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado o en la base el estudiante:" + apellido );
		return null;
	}

}
