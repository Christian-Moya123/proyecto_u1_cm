package com.uce.edu.demo.santamaria.reposity;

import com.uce.edu.demo.santamaria.modelo.Inventario;

public interface IInventarioRepository {
	public void actualizar(Inventario i);
	public Inventario buscar(String numero);
	public void insertar(Inventario i);
	public void eliminar(String numero);


}
