package com.init.pea.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.init.pea.dao.ClienteDAO;
import com.init.pea.interfacesservices.ICliente;
import com.init.pea.modelo.Cliente;

@Service
public class ClienteService implements ICliente {

	@Autowired
	private ClienteDAO rCliente;
	
	@Override
	public List<Cliente> ListarTodo() {
		return (List<Cliente>) rCliente.findAll();
	}

	@Override
	public int Actualizar(Cliente cli) {
		if (cli == null) {
			return 0;
		}
		rCliente.save(cli);
		return 1;
	}

	@Override
	public Optional<Cliente> BuscarXid(int id) {
		Optional cliente = rCliente.findById(id);
		return cliente;
	}

	@Override
	public int Guardar(Cliente cli) {
		if(cli == null) {
			return 0;
		}
		rCliente.save(cli);
		return 1;
	}

}
