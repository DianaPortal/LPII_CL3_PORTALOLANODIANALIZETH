package com.bd.basico.servicio;

import java.util.List;

import com.bd.basico.modelo.TBL_PRODUCTOCL3;

public interface IProductoServicio {
	
	//declaramos los metodos
	public List<TBL_PRODUCTOCL3>ListadoProductos();
	public void RegistrarProducto(TBL_PRODUCTOCL3 producto);	
	public TBL_PRODUCTOCL3 BuscarporId(Integer id);
	public void Eliminar(Integer id);

}//fin de la interfaz
