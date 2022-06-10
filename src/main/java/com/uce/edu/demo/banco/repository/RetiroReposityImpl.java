package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.modelo.banco.modelo.Retiro;

@Repository
public class RetiroReposityImpl implements IRetiroReposity{

	@Override
	public void actualizar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("retiro actualizada" + r);
		
	}

	@Override
	public Retiro buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("se busca el retiro:" + numero);
		Retiro ret =  new Retiro();
		ret.setNumeroCuenta(numero);
		ret.setMonto(new BigDecimal(230));
		return ret;
	}

	@Override
	public void insertar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base el retiro:" + r);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado o en la base el retiro:" + numero);
	}

}
