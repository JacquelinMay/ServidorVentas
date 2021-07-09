package com.init.pea.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "prxpe")
public class PrXpe {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idprxpe  ;
	
	@ManyToOne
	@JoinColumn(name = "idpedidointerno")
	private PedidoInterno pedidoInterno;
	@ManyToOne
	@JoinColumn(name = "idproducto")
	private Producto  producto;
	
	
	public PrXpe() {
		super();
	}
	public PrXpe(int idprxpe, PedidoInterno pedidoInterno, Producto producto) {
		super();
		this.idprxpe = idprxpe;
		this.pedidoInterno = pedidoInterno;
		this.producto = producto;
	}
	public int getIdprxpe() {
		return idprxpe;
	}
	public void setIdprxpe(int idprxpe) {
		this.idprxpe = idprxpe;
	}
	public PedidoInterno getPedidoInterno() {
		return pedidoInterno;
	}
	public void setPedidoInterno(PedidoInterno pedidoInterno) {
		this.pedidoInterno = pedidoInterno;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
	
}
