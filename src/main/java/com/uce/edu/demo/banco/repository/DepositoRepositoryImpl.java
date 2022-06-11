package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Deposito> consultar(String cuenta, LocalDateTime fechaInico, LocalDateTime fechaFin) {
		List<Deposito> listaDepositos = new ArrayList<>();
		Deposito depo1 = new Deposito();
		depo1.setFecha(LocalDateTime.of(2021, 2, 10,8,50,2));
		depo1.setMonto(new BigDecimal(40));
		depo1.setNumeroCuentaDestino("111");
		
		Deposito depo2 = new Deposito();
		depo2.setFecha(LocalDateTime.of(2021, 3, 15,9,53,2));
		depo2.setMonto(new BigDecimal(55));
		depo2.setNumeroCuentaDestino("123");
		
		listaDepositos.add(depo2);
		listaDepositos.add(depo1);

		return listaDepositos;
	}

}
