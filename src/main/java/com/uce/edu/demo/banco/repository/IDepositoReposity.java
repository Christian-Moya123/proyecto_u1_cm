package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.modelo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.modelo.banco.modelo.Deposito;

public interface IDepositoReposity {
	public void insertar(Deposito d);
	public void eliminar(String numeroCuentaD);
	public void actualizar(Deposito d);
	public Deposito buscar(String numeroCuentaD);
}
