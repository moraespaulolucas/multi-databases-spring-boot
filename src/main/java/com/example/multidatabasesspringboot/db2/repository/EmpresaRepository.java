package com.example.multidatabasesspringboot.db2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.multidatabasesspringboot.db2.entity.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {

}
