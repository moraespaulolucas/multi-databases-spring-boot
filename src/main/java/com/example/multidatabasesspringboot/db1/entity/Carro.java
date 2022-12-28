package com.example.multidatabasesspringboot.db1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "carro")
public class Carro {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  @Column(name = "marca")
  private String marca;

  @Column(name = "modelo")
  private String modelo;

  @Column(name = "ano")
  private int ano;
}
