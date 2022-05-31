package com.uce.edu.demo.consultorio;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitaMedica2 {
	
	private LocalDateTime fechaCita;
	
	
	//3) DI por metodo set
	private Doctor doctor;// A SUS METODO SET LE PONGO @AUTOWIRED
	private Paciente paciente;//A SUS METODO SET LE PONGO @AUTOWIRED
	
	
	public String agendar(LocalDateTime fechaCita, String nombre, String apellido, int edad, String ciudad,
	String nombrePaciente, int edadPaciente){
		
		
		this.doctor.setNombre(nombre);
		this.doctor.setApellido(apellido);
		this.doctor.setEdad(edad);
		this.doctor.setCiudad(ciudad);
		
		this.paciente.setNombre(nombrePaciente);
		this.paciente.setEdad(edadPaciente);
		
		//se inserta la cita en la base de  datos
		return "Cita agendada";
	}
	
	//SET y GET
	public Doctor getDoctor() {
		return doctor;
	}
	@Autowired
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	
	public Paciente getPaciente() {
		return paciente;
	}
	
	@Autowired
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}
	
	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}
	
	
	
}
