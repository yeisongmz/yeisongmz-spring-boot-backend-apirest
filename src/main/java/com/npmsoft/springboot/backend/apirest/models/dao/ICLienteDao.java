package com.npmsoft.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.npmsoft.springboot.backend.apirest.models.entity.Cliente;

public interface ICLienteDao extends CrudRepository<Cliente, Long> {
	 
}
