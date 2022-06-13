package com.uce.edu.demo.santamaria.reposity;

import java.time.LocalDateTime;

import com.uce.edu.demo.santamaria.modelo.Producto;

public interface IProductoRepository {
	public void actualizarProductos(Producto p);
	public Producto buscarProducto(String numero);
	public void insertarProducto(Producto p);
	public void eliminarProductos(String numero);
	
}
