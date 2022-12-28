package com.example.multidatabasesspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.multidatabasesspringboot.db1.repository.CarroRepository;
import com.example.multidatabasesspringboot.db1.repository.PessoaRepository;
import com.example.multidatabasesspringboot.db2.repository.CidadeRepository;
import com.example.multidatabasesspringboot.db2.repository.EmpresaRepository;
import com.example.multidatabasesspringboot.model.Response;

@RestController
@RequestMapping("/api")
public class Controller {

  @Autowired
  CarroRepository carroRepository;
  @Autowired
  PessoaRepository pessoaRepository;

  @Autowired
  CidadeRepository cidadeRepository;
  @Autowired
  EmpresaRepository empresaRepository;

  @GetMapping
  public Response getResponse() {
    Response response = new Response(
        carroRepository.findAll(),
        pessoaRepository.findAll(),
        cidadeRepository.findAll(),
        empresaRepository.findAll());
    return response;
  }
}
