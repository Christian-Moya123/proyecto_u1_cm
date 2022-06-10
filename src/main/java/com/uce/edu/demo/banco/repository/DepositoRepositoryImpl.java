package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.modelo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoReposity{
	
	@Override
	public void insertar(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("se creo el deposito " + d);
	}

	@Override
	public void eliminar(String numeroCuentaD) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado o en la base el deposito:" + numeroCuentaD);
	}

	@Override
	public void actualizar(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("deposito actualizada" + d);
	}

	@Override
	public Deposito buscar(String numeroCuentaD) {
		// TODO Auto-generated method stub
		System.out.println("se busca el deposito:" + numeroCuentaD);
		Deposito dep =  new Deposito();
		dep.setNumeroCuentaDestino(numeroCuentaD);
		dep.setMonto(new BigDecimal(50));
		return dep;
	}

}
