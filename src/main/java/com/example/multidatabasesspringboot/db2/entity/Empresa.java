package com.example.multidatabasesspringboot.db2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "empresa")
public class Empresa {
  @Id
  private int id;

  @Column(name = "nome_fantasia")
  private String nome_fantasia;

  @Column(name = "cnpj")
  private int cnpj;
}
