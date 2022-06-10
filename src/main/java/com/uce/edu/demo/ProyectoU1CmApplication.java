package com.uce.edu.demo;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.repository.ITransferenciaRepository;
import com.uce.edu.demo.banco.service.ICuentaBancariaService;
import com.uce.edu.demo.banco.service.IDepositoService;
import com.uce.edu.demo.banco.service.IRetiroService;
import com.uce.edu.demo.banco.service.ITransferenciaService;
import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.modelo.banco.modelo.Transferencia;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;


@SpringBootApplication
public class ProyectoU1CmApplication implements CommandLineRunner{
	
	@Autowired
	private ITransferenciaService iTranferenciaService;
	
	@Autowired
	private IDepositoService depositoService;
	
	@Autowired
	private ICuentaBancariaService cuantaBancariaService;
	
	@Autowired
	private IRetiroService retiroService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1CmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// TODO Auto-generated method stub
		//////////////////////////////////////////////////////TRANSFERENCIA
		iTranferenciaService.realizarTranferencia("12", "13", new BigDecimal(20));
		iTranferenciaService.actualizar("12", "130", new BigDecimal(200));
		iTranferenciaService.borrarTransferencia("12");
		iTranferenciaService.buscar("12");
		System.out.println("");
		
		//////////////////////////////////////////////////////Deposito
		this.depositoService.realizarDeposito("14", new BigDecimal(50));
		depositoService.actualizarDeposito("13", new BigDecimal(600));
		depositoService.borrarDeposito("122");
		depositoService.buscarDeposito("14");
		System.out.println("");
		
		////////////////////////////////////////////////////////Cuenta Bancaria
		CuentaBancaria cb1 = new CuentaBancaria();
		cb1.setNumero("000123");
		cb1.setSaldo(new BigDecimal(500));
		this.cuantaBancariaService.ingresarCuentaBancaria(cb1);
		
		CuentaBancaria cb2 = new CuentaBancaria();
		cb2.setNumero("100125");
		cb2.setSaldo(new BigDecimal(800));
		this.cuantaBancariaService.ingresarCuentaBancaria(cb2);
		
		cb1.setNumero("222201");
		this.cuantaBancariaService.actualizar(cb2);
		
		this.cuantaBancariaService.borrarCuentaBancaria("100125");
		
		this.cuantaBancariaService.borrarCuentaBancaria("100125");
		System.out.println("");
		
		//////////////////////////////////////////////////////////RETIRO
		this.retiroService.realizarRetiro("88899", new BigDecimal(501));
		retiroService.actualizarRetiro("88899", new BigDecimal(6009));
		retiroService.borrarRetiro("88899");
		retiroService.buscarRetiro("88899");
		System.out.println("");
		
	}

}
