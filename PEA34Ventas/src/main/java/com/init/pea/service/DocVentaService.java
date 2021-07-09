package com.init.pea.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.init.pea.dao.DocVentaDAO;
import com.init.pea.interfacesservices.IDocVenta;
import com.init.pea.modelo.Docventa;

@Service
public class DocVentaService implements IDocVenta{

	@Autowired
	private DocVentaDAO rDocVenta;
	
	@Override
	public List<Docventa> ListarTodo() {
		return (List<Docventa>) rDocVenta.findAll();
	}

	@Override
	public int Actualizar(Docventa docVenta) {
		if (docVenta == null) {
			return 0;
		}
		rDocVenta.save(docVenta);
		return 1;
	}

	@Override
	public Optional<Docventa> BuscarXid(int id) {
		Optional docVenta = rDocVenta.findById(id);
		return docVenta;
	}

	@Override
	public int Guardar(Docventa docVenta) {
		if(docVenta == null) {
			return 0;
		}
		rDocVenta.save(docVenta);
		return 1;
	}

}
