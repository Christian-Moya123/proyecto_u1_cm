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
import com.uce.edu.demo.santamaria.modelo.Inventario;
import com.uce.edu.demo.santamaria.modelo.Producto;
import com.uce.edu.demo.santamaria.reposity.IInventarioRepository;
import com.uce.edu.demo.santamaria.service.IInventarioService;
import com.uce.edu.demo.santamaria.service.IProductoService;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;


@SpringBootApplication
public class ProyectoU1CmApplication implements CommandLineRunner{
	
	@Autowired
	private IInventarioService iInventarioService;
	
	@Autowired
	private IProductoService iProductoService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1CmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// TODO Auto-generated method stub
	
		
		
		this.iProductoService.insertar("Leche", 5, new BigDecimal(50),LocalDateTime.of(2021, 12, 31, 1, 45),"444");
		this.iProductoService.insertar("Yogurt", 54, new BigDecimal(21),LocalDateTime.of(2020, 1, 24, 4, 15),"333");
		this.iProductoService.insertar("Carne", 15, new BigDecimal(10),LocalDateTime.of(2018, 2, 01, 12, 05),"222");
		this.iProductoService.insertar("Agua", 22, new BigDecimal(55),LocalDateTime.of(2019, 11, 02, 2, 11),"111");
		this.iProductoService.insertar("Carne", 15, new BigDecimal(10),LocalDateTime.of(2022, 8, 11, 21, 59),"555");
		
		this.iProductoService.ingresarInventario("55", LocalDateTime.now());
		
		this.iInventarioService.imprimirInventario();
		
		System.out.println("");
		System.out.println("Invetario Filtrado");
		this.iProductoService.consultar(LocalDateTime.of(2019, 12, 31, 1, 45));
		this.iInventarioService.imprimirInventario();
	
	}

}
