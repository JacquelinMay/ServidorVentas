package com.init.pea.interfacesservices;

import java.util.List;
import java.util.Optional;

import com.init.pea.modelo.Docventa;

public interface IDocVenta {
	
	public List<Docventa > ListarTodo ();
	
	public int Actualizar(Docventa  docVenta);
	
	public Optional<Docventa> BuscarXid(int id);
	
	public int Guardar(Docventa docVenta);

}
