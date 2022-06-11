package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.modelo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.modelo.banco.modelo.Retiro;
import com.uce.edu.demo.modelo.banco.modelo.Transferencia;

public interface IRetiroReposity {
	public void actualizar(Retiro r);
	public Retiro buscar(String numero);
	public void insertar(Retiro r);
	public void eliminar(String numero);
	
	public List<Retiro> consultar(String cuentaa, LocalDateTime fechaInico, LocalDateTime fechaFin);
}
