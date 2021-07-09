package com.init.pea.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="pedidointerno")
public class PedidoInterno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idpediointerno;
	
	@Temporal(TemporalType.DATE)
	private Date fecha ;
	private String detalle ;
	
	
	
	public PedidoInterno() {
		super();
	}
	
	public PedidoInterno(int idpediointerno, Date fecha, String detalle) {
		super();
		this.idpediointerno = idpediointerno;
		this.fecha = fecha;
		this.detalle = detalle;
	}
	public int getIdpediointerno() {
		return idpediointerno;
	}
	public void setIdpediointerno(int idpediointerno) {
		this.idpediointerno = idpediointerno;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	

}
