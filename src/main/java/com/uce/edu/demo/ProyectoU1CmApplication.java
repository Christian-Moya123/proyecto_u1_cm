package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica;
import com.uce.edu.demo.consultorio.CitaMedica2;
import com.uce.edu.demo.tarea.Administracion;
import com.uce.edu.demo.tarea.Administracion2;
import com.uce.edu.demo.tarea.Administracion3;

@SpringBootApplication
public class ProyectoU1CmApplication implements CommandLineRunner{
	
	//1)DI por atributo
	//@Autowired
	//private CitaMedica cita;
	
	//3)DI por metodos set
	//@Autowired
	//private CitaMedica2 cita;
	////////////////////////////////////////////////////////////////////////
	
	//tarea
	//DI ATRIBUTO
	@Autowired
	private Administracion administracion;
	
	//DI CONSTRUCTOR
	@Autowired 
	private Administracion2 administracion2;
	
	//DI METODO SET
	@Autowired 
	private Administracion3 administracion3;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1CmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Mi primer proyecto con Spring Framework");
		
		//ejercicio en clase
		/*
		String respuesta = this.cita.agendar(LocalDateTime.now(), "Javier", "Teran", 32, "Christian", "Moya", 23);
		System.out.println(respuesta);
		*/
		
		/////////////////////////////////////////////////////////////////////////////////////
		//tarea 5
		//Inyeccion de dependencias por atributo
		
		String respuesta1 = this.administracion.venta(45, "Las Sombras", "Edwin Guitierres", 10.6, "Norma", LocalDateTime.now());
		System.out.println("el libro fue administrado: ");
		System.out.println(this.administracion.toString());
		System.out.println();
		System.out.println(respuesta1);
		System.out.println();
		
		//Inyeccion de dependencias por constructor
		
		String respuesta2 = this.administracion2.venta(100, "GEGE", "Alex Neo", 22.5, "Ivrea", LocalDateTime.now());
		System.out.println("el libro fue administrado: ");
		System.out.println(this.administracion2.toString());
		System.out.println();
		System.out.println(respuesta2);
		System.out.println();
		
		//Inyeccion por metodo Set
		String respuesta3 = this.administracion3.venta(25, "Mirian", "Abel Carbajar", 5.5, "Panini", LocalDateTime.now());
		System.out.println("el libro fue administrado: ");
		System.out.println(this.administracion3.toString());
		System.out.println();
		System.out.println(respuesta3);
	}

}
