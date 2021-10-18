package com.npmsoft.springboot.backend.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.npmsoft.springboot.backend.apirest.models.dao.ICLienteDao;
import com.npmsoft.springboot.backend.apirest.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService {
	@Autowired
	private ICLienteDao clienteDao;
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}
	@Override
	@Transactional(readOnly = true)
	public Cliente findById(long id) {
		// TODO Auto-generated method stub
		return clienteDao.findById(id).orElse(null);
	}
	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteDao.save(cliente);
	}
	@Override
	@Transactional
	public void delete(long id) {
		// TODO Auto-generated method stub
		clienteDao.deleteById(id);
	}

}
