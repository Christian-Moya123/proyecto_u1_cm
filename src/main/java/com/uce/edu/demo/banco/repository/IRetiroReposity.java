package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.modelo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.modelo.banco.modelo.Retiro;

public interface IRetiroReposity {
	public void actualizar(Retiro r);
	public Retiro buscar(String numero);
	public void insertar(Retiro r);
	public void eliminar(String numero);
}
