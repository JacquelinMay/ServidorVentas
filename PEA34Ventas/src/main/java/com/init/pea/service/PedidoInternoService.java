package com.init.pea.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.init.pea.dao.DocVentaDAO;
import com.init.pea.dao.PedidoInternoDAO;
import com.init.pea.interfacesservices.IPedidoInterno;
import com.init.pea.modelo.PedidoInterno;

@Service
public class PedidoInternoService implements IPedidoInterno{


	@Autowired
	private PedidoInternoDAO rPedidoI;
	
	
	@Override
	public List<PedidoInterno> ListarTodo() {
		return (List<PedidoInterno>) rPedidoI.findAll();
	}

	@Override
	public int Actualizar(PedidoInterno pedidoInterno) {
		if (pedidoInterno == null) {
			return 0;
		}
		rPedidoI.save(pedidoInterno);
		return 1;
	}

	@Override
	public Optional<PedidoInterno> BuscarXid(int id) {
		Optional pedidoInterno = rPedidoI.findById(id);
		return pedidoInterno;
	}

	@Override
	public int Guardar(PedidoInterno pedidoInterno) {
		if(pedidoInterno == null) {
			return 0;
		}
		rPedidoI.save(pedidoInterno);
		return 1;
	}

}
