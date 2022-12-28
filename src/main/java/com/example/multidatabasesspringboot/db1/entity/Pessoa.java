package com.example.multidatabasesspringboot.db1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "pessoa")
public class Pessoa {
  @Id
  private int id;

  @Column(name = "nome")
  private String nome;

  @Column(name = "idade")
  private int idade;
}
