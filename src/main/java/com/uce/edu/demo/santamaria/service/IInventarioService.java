package com.uce.edu.demo.santamaria.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.santamaria.modelo.Inventario;
import com.uce.edu.demo.santamaria.modelo.Producto;

public interface IInventarioService {
	public void actualizar(Inventario i);
	public Inventario buscar(String numero);
	public void insertar(List<Producto> producto, String numero, LocalDateTime fechaIngreso);
	public void eliminar(String numero);
	public void imprimirInventario();

}
