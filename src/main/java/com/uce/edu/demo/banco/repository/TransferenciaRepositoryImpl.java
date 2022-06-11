package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.modelo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository {

	@Override
	public void insertar(Transferencia t) {
		// TODO Auto-generated method stub
	System.out.println("se inserta la transferencia en la base de datos" + t);	
	}

	@Override
	public void actualizar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("transferencia  actualizada" + t);
		
	}

	@Override
	public Transferencia buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("se busca la transferencia:" + numero);
		Transferencia tra =  new Transferencia();
		tra.setNumero(numero);
		tra.setNumeroCuentaDestino("2500");
		tra.setNumeroCuentaOrigen("6000");
		return tra;
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado o en la base la transferencia:" + numero);
	}

	@Override
	public List<Transferencia> consultaar(String cuentaa, LocalDateTime fechaInico, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Transferencia> listaConsulta = new ArrayList<>();
		Transferencia trans1 = new Transferencia();
		trans1.setFechaTransferencia(LocalDateTime.now());
		trans1.setMontoTransferir(new BigDecimal(100));
		trans1.setNumeroCuentaDestino("425145");
		trans1.setNumeroCuentaOrigen("1312");
		
		listaConsulta.add(trans1);
		
		return listaConsulta;
	}

}
