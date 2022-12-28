package com.example.multidatabasesspringboot.db1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.multidatabasesspringboot.db1.entity.Carro;

public interface CarroRepository extends JpaRepository<Carro, Integer> {
  
}
