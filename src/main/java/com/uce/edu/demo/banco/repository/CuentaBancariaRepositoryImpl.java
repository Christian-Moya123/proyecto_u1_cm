package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;
import com.uce.edu.demo.modelo.banco.modelo.CuentaBancaria;

@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository{

	@Override
	public void actualizar(CuentaBancaria c) {
		// aqui hay que construir los SQL
		System.out.println("cuanta bancaria actualizada" + c);
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("se busca la cuenta bancaria:" + numero);
		CuentaBancaria cta =  new CuentaBancaria();
		cta.setNumero(numero);
		cta.setSaldo(new BigDecimal(100));
		return cta;
	}

	@Override
	public void insertar(CuentaBancaria e) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base la cuenta bancaria:" + e);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado o en la base la cuenta bancaria:" + numero);
	}

}
