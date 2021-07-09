

package com.init.pea.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "docvyprod")
public class DocVyProd {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int iddocvyprod ;

	@ManyToOne
	@JoinColumn(name = "docventaid ")
	private Docventa  docventa;
	@ManyToOne
	@JoinColumn(name = "productoid ")
	private Producto producto;
	public int getIddocvyprod() {
		return iddocvyprod;
	}
	public void setIddocvyprod(int iddocvyprod) {
		this.iddocvyprod = iddocvyprod;
	}
	public Docventa getDocventa() {
		return docventa;
	}
	public void setDocventa(Docventa docventa) {
		this.docventa = docventa;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	

	

}


