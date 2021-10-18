package com.npmsoft.springboot.backend.apirest.models.service;

import java.util.List;

import com.npmsoft.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteService {

	public List<Cliente> findAll();

	public Cliente findById(long id);

	public Cliente save(Cliente cliente);

	public void delete(long id);
	
}
