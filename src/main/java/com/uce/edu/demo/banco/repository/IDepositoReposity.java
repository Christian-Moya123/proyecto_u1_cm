package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.modelo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.modelo.banco.modelo.Deposito;

public interface IDepositoReposity {
	public void insertar(Deposito d);
	public void eliminar(String numeroCuentaD);
	public void actualizar(Deposito d);
	public Deposito buscar(String numeroCuentaD);
	
	public List<Deposito> consultar(String cuenta, LocalDateTime fechaInico, LocalDateTime fechaFin);
}
