package com.uce.edu.demo.libreria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.libreria.modelo.LibreriaPrivada;
import com.uce.edu.demo.libreria.modelo.LibreriaPublica;
import com.uce.edu.demo.libreria.modelo.Registro;
import com.uce.edu.demo.libreria.repository.IRegistroRepository;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.repository.IMatriculaRepository;

@Service
public class RegistroServiceImpl implements IRegistroService{
	
	@Autowired
	private IRegistroRepository registroRepository;
	
	@Autowired
	private LibreriaPublica libreriaPublica;
	
	@Autowired
	private LibreriaPrivada libreriaPrivada;

	@Override
	public void ingresarRegistro(Registro registro) {
		// TODO Auto-generated method stub
		System.out.println("DI desde Service Simglenton:" + this.libreriaPrivada);
		System.out.println("DI desde Service Simglenton:" + this.libreriaPublica);
		this.registroRepository.insertar(registro);
	}

	@Override
	public Registro buscarPorRegistro(String numero) {
		// TODO Auto-generated method stub
		
		return this.registroRepository.buscar(numero);
	}

	@Override
	public void actualizarRegistro(Registro registro) {
		// TODO Auto-generated method stub
		this.registroRepository.actualizar(registro);
	}

	@Override
	public void borrarRegistro(String numero) {
		// TODO Auto-generated method stub
		this.registroRepository.buscar(numero);
	}


}
