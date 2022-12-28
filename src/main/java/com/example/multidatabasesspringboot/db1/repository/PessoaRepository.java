package com.example.multidatabasesspringboot.db1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.multidatabasesspringboot.db1.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
