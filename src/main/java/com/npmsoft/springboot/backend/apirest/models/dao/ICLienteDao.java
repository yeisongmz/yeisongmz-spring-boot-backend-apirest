package com.npmsoft.springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.npmsoft.springboot.backend.apirest.models.entity.Cliente;
import com.npmsoft.springboot.backend.apirest.models.entity.Region;

public interface ICLienteDao extends JpaRepository<Cliente, Long> {
	
	@Query("from Region")
	public List<Region> findAllRegiones();
	
	
}
