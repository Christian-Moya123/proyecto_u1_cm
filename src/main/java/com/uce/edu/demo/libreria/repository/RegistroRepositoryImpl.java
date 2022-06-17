package com.uce.edu.demo.libreria.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.libreria.modelo.LibreriaPublica;
import com.uce.edu.demo.libreria.modelo.Registro;

@Repository
public class RegistroRepositoryImpl implements IRegistroRepository{

	@Override
	public void insertar(Registro registro) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base el registro:" + registro);
	}

	@Override
	public Registro buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado o en la base el registro:" + numero );
		
		Registro registro = new Registro();
		registro.setNumero(numero);
		return registro;
	}

	@Override
	public void actualizar(Registro registro) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base el registro:" + registro);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado o en la base el registro:" + numero);
	}

}
