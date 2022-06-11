package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.modelo.banco.modelo.Deposito;
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

	@Override
	public List<Retiro> consultar(String cuentaa, LocalDateTime fechaInico, LocalDateTime fechaFin) {
		List<Retiro> listaRetiros = new ArrayList<>();
		Retiro reti1 = new Retiro();
		reti1.setFecha(LocalDateTime.of(2022, 12, 20,13,34,10));
		reti1.setMonto(new BigDecimal(47));
		reti1.setNumeroCuenta("11551");
		
		listaRetiros.add(reti1);
		
		
		return listaRetiros;
	}

}
