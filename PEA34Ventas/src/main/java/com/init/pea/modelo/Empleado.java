
package com.init.pea.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idempleado;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String dni;
    
    
	public Empleado() {
		super();
	}
	public Empleado(int idempleado, String nombre, String apellido, String direccion, String telefono, String dni) {
		super();
		this.idempleado = idempleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.dni = dni;
	}
	public int getIdempleado() {
		return idempleado;
	}
	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}




}