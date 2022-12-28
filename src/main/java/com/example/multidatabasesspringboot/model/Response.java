package com.example.multidatabasesspringboot.model;

import java.util.List;

import com.example.multidatabasesspringboot.db1.entity.Carro;
import com.example.multidatabasesspringboot.db1.entity.Pessoa;
import com.example.multidatabasesspringboot.db2.entity.Cidade;
import com.example.multidatabasesspringboot.db2.entity.Empresa;

import lombok.Data;

@Data
public class Response {
  private List<Carro> carros;
  private List<Pessoa> pessoas;
  private List<Cidade> cidades;
  private List<Empresa> empresas;
  
  public Response(List<Carro> carros, List<Pessoa> pessoas, List<Cidade> cidades, List<Empresa> empresas) {
    this.carros = carros;
    this.pessoas = pessoas;
    this.cidades = cidades;
    this.empresas = empresas;
  }
  
  
}
