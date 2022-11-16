package com.idat.ev3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.ev3.model.UsuarioCliente;
import com.idat.ev3.repository.UsuarioClienteRepository;

@Service
public class UsuarioClienteServiceImpl implements UsuarioClienteService{
	@Autowired
	private UsuarioClienteRepository repositorio;
				
	@Override
	public void guardar(UsuarioCliente usuariocliente) {
		repositorio.save(usuariocliente);
	}

	@Override
	public void actualizar(UsuarioCliente usuariocliente) {
		repositorio.saveAndFlush(usuariocliente);
	}

	@Override
	public void eliminar(Integer id) {
		repositorio.deleteById(id);
	}

	@Override
	public List<UsuarioCliente> listar() {
		return repositorio.findAll();
	}

	@Override
	public UsuarioCliente obtener(Integer id) {
		return repositorio.findById(id).orElse(null);
	}
}
