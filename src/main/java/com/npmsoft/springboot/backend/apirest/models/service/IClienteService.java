package com.npmsoft.springboot.backend.apirest.models.service;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.npmsoft.springboot.backend.apirest.models.entity.Cliente;
import com.npmsoft.springboot.backend.apirest.models.entity.Region;

public interface IClienteService {

	public List<Cliente> findAll();
	
	public Page<Cliente> findAll(Pageable pageable);

	public Cliente findById(long id);

	public Cliente save(Cliente cliente);

	public void delete(long id);
	
	public List<Region> findAllRegiones();
	
}
