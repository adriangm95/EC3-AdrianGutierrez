package com.idat.ev3.service;

import java.util.List;

import com.idat.ev3.model.UsuarioCliente;

public interface UsuarioClienteService {
	void guardar(UsuarioCliente usuariocliente);
	void actualizar(UsuarioCliente usuariocliente);
	void eliminar(Integer id);
	List<UsuarioCliente> listar();
	UsuarioCliente obtener(Integer id);
}
