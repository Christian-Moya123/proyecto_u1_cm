package com.uce.edu.demo.libreria.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.repository.IDepositoReposity;
import com.uce.edu.demo.banco.service.ICuentaBancariaService;
import com.uce.edu.demo.libreria.modelo.LibreriaPrivada;
import com.uce.edu.demo.libreria.repository.ILibreriaPrivadaRepository;
import com.uce.edu.demo.modelo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.modelo.banco.modelo.Deposito;

@Service
public class LibreriaPrivadaServiceImpl implements ILibreriaPrivadaService{
	
	@Autowired
	private  ILibreriaPrivadaRepository libreriaPrivadaRepository;
	
	
	@Override	
	public void ingresarLibreria(LibreriaPrivada libreria) {
		// TODO Auto-generated method stub
		this.libreriaPrivadaRepository.insertar(libreria);
	}
	@Override
	public LibreriaPrivada buscarPorLibreria(String numero) {
		// TODO Auto-generated method stub
		return this.buscarPorLibreria(numero);
	}
	@Override
	public void actualizarLibreria(LibreriaPrivada libreria) {
		// TODO Auto-generated method stub
		this.libreriaPrivadaRepository.actualizar(libreria);
	}
	@Override
	public void borrarLibreria(String numero) {
		// TODO Auto-generated method stub
		this.libreriaPrivadaRepository.eliminar(numero);
	}
	
}
