package com.init.pea.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.init.pea.modelo.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, Integer>{

}
