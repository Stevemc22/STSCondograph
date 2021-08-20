package com.cenfotec.condograph.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Condominio implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "direccion", nullable = false)
	private String direccion;
	
	@Column(name = "cedula_juridica", nullable = false)
	private int cedulaJuridica;
	
	@Column(name = "representante", nullable = false)
	private String representante;
	
	@Column(name = "unidades", nullable = false)
	private int unidades;
	
	@Column(name = "cuota_condominal", nullable = false)
	private int cuotaCondominal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCedulaJuridica() {
		return cedulaJuridica;
	}

	public void setCedulaJuridica(int cedulaJuridica) {
		this.cedulaJuridica = cedulaJuridica;
	}

	public String getRepresentante() {
		return representante;
	}

	public void setRepresentante(String representante) {
		this.representante = representante;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public double getCuotaCondominal() {
		return cuotaCondominal;
	}

	public void setCuotaCondominal(int cuotaCondominal) {
		this.cuotaCondominal = cuotaCondominal;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
