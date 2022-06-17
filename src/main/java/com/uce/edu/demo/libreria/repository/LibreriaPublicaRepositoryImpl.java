package com.uce.edu.demo.libreria.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.libreria.modelo.LibreriaPrivada;
import com.uce.edu.demo.libreria.modelo.LibreriaPublica;

@Repository
public class LibreriaPublicaRepositoryImpl implements ILibreriaPublicaRepository{

	@Override
	public void insertar(LibreriaPublica libreriaPublica) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base la biblioteca publica:" + libreriaPublica);
	}

	@Override
	public LibreriaPublica buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado o en la base la biblioteca publica:" + numero );
		
		LibreriaPublica lPublica = new LibreriaPublica();
		lPublica.setNumero(numero);
		return lPublica;
	}

	@Override
	public void actualizar(LibreriaPublica libreriaPublica) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base la biblioteca publica:" + libreriaPublica);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado o en la base la biblioteca publica:" + numero);
	}

}
