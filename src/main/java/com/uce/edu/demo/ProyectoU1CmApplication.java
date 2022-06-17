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
import com.uce.edu.demo.banco.service.IFachadaCuentaBancaria;
import com.uce.edu.demo.banco.service.IRetiroService;
import com.uce.edu.demo.banco.service.ITransferenciaService;
import com.uce.edu.demo.libreria.modelo.LibreriaPrivada;
import com.uce.edu.demo.libreria.modelo.LibreriaPublica;
import com.uce.edu.demo.libreria.modelo.Registro;
import com.uce.edu.demo.libreria.service.IRegistroService;
import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
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
	private LibreriaPrivada libreriaPrivada1;
	
	@Autowired
	private LibreriaPrivada libreriaPrivada2;
	
	@Autowired
	private LibreriaPublica libreriaPublica1;
	
	@Autowired
	private LibreriaPublica libreriaPublica2;
	
	@Autowired
	private IRegistroService iRegistroService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1CmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Ejemplo Singlenton");
		this.libreriaPrivada1.setnLibros(88);
		this.libreriaPrivada1.setNombre("Anabel");
		System.out.println(this.libreriaPrivada1);
		System.out.println(this.libreriaPrivada2);
		this.libreriaPrivada2.setNombre("Agua");
		System.out.println(this.libreriaPrivada1);
		System.out.println();
		System.out.println("Ejemplo Prototype");
		this.libreriaPublica1.setnLibros(44);
		this.libreriaPublica1.setNombre("Cards");
		System.out.println(this.libreriaPublica1);
		System.out.println(this.libreriaPublica2);
		this.libreriaPublica2.setNombre("12 QI");
		System.out.println(this.libreriaPublica1);
		System.out.println();
		Registro registro1 = new Registro();
		registro1.setlPrivada(libreriaPrivada1);
		registro1.setlPublica(libreriaPublica1);
		registro1.setNumero("1234");
		
		this.iRegistroService.ingresarRegistro(registro1);
		System.out.println();
		Registro registro2 = new Registro();
		registro2.setlPrivada(libreriaPrivada1);
		registro2.setlPublica(libreriaPublica1);
		registro2.setNumero("789");
		
		this.iRegistroService.ingresarRegistro(registro2);
	}

}
