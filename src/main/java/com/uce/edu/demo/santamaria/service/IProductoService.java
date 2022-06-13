package com.uce.edu.demo.santamaria.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.uce.edu.demo.santamaria.modelo.Producto;

public interface IProductoService {
	public void actualizar(Producto p);
	public Producto buscar(LocalDateTime fecha);
	public void insertar(String nombre, int cantidad, BigDecimal valor, LocalDateTime fechaIngreso, String numero);
	public void eliminar(String numero);
	public void ingresarInventario(String numero, LocalDateTime fecha);
	public void consultar(LocalDateTime fecha);

}
