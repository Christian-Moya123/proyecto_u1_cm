package com.uce.edu.demo.libreria.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.libreria.modelo.LibreriaPrivada;
import com.uce.edu.demo.modelo.Matricula;

@Repository
public class LibreriaPrivadaRepositoryImpl implements ILibreriaPrivadaRepository {

	@Override
	public void insertar(LibreriaPrivada libreriaPrivada) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base la biblioteca privada:" + libreriaPrivada);
	}

	@Override
	public LibreriaPrivada buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado o en la base la biblioteca privada:" + numero );
		
		LibreriaPrivada lPrivada = new LibreriaPrivada();
		lPrivada.setNumero(numero);
		return lPrivada;
		
	}

	@Override
	public void actualizar(LibreriaPrivada libreriaPrivada) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base la biblioteca privada:" + libreriaPrivada);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado o en la base la biblioteca privada:" + numero);
	}

}
