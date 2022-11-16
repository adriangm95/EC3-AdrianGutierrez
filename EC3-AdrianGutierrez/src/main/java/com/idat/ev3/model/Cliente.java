package com.idat.ev3.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
 
@Entity
@Table(name ="cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer idCliente;
	private String nombre;
	private String celular;
	
	@ManyToMany(mappedBy= "clientes", cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	private List<Hospital> hospitales = new ArrayList<>();
	
	@OneToOne
	private UsuarioCliente usuariocliente;

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public List<Hospital> getHospitales() {
		return hospitales;
	}

	public void setHospitales(List<Hospital> hospitales) {
		this.hospitales = hospitales;
	}

	public UsuarioCliente getUsuariocliente() {
		return usuariocliente;
	}

	public void setUsuariocliente(UsuarioCliente usuariocliente) {
		this.usuariocliente = usuariocliente;
	}
	
}
