package com.uce.edu.demo.libreria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.libreria.modelo.LibreriaPublica;
import com.uce.edu.demo.libreria.repository.ILibreriaPrivadaRepository;
import com.uce.edu.demo.libreria.repository.ILibreriaPublicaRepository;

@Service
public class LibreriaPublicaServiceImpl implements ILibreriaPublicaService{

	@Autowired
	private  ILibreriaPublicaRepository libreriaPublicaRepository;
	
	@Override
	public void ingresarLibreria(LibreriaPublica libreria) {
		// TODO Auto-generated method stub
		this.libreriaPublicaRepository.insertar(libreria);
	}

	@Override
	public LibreriaPublica buscarPorLibreria(String numero) {
		// TODO Auto-generated method stub
		return this.libreriaPublicaRepository.buscar(numero);
	}

	@Override
	public void actualizarLibreria(LibreriaPublica libreria) {
		// TODO Auto-generated method stub
		this.libreriaPublicaRepository.actualizar(libreria);
	}

	@Override
	public void borrarLibreria(String numero) {
		// TODO Auto-generated method stub
		this.libreriaPublicaRepository.eliminar(numero);
	}

}
