package com.init.pea.interfacesservices;

import java.util.List;
import java.util.Optional;

import com.init.pea.modelo.Cliente;

public interface ICliente {

	
	public List<Cliente> ListarTodo ();
	
	public int Actualizar(Cliente cli);
	
	public Optional<Cliente> BuscarXid(int id);
	
	public int Guardar(Cliente cli);
	
}
