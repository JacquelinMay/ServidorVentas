package com.init.pea.interfacesservices;

import java.util.List;
import java.util.Optional;

import com.init.pea.modelo.PedidoInterno;

public interface IPedidoInterno {

	
	public List<PedidoInterno > ListarTodo ();
	
	public int Actualizar(PedidoInterno pedidoInterno);
	
	public Optional<PedidoInterno> BuscarXid(int id);
	
	public int Guardar(PedidoInterno pedidoInterno);
	
}
