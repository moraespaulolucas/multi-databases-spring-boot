package com.example.multidatabasesspringboot.db2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.multidatabasesspringboot.db2.entity.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
  
}
