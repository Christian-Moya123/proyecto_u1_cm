package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.modelo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.modelo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {
	public void insertar(Transferencia t); 
	public void actualizar(Transferencia t);
	public Transferencia buscar(String numero);
	public void eliminar(String numero);
	
	public List<Transferencia> consultaar(String cuentaa, LocalDateTime fechaInico, LocalDateTime fechaFin);

}
