package com.juanca.java.arquitectura.hexagonal._03_dominio_core.modelo;

public class Task {

  private int id;

  private String description;


  public Task(String description) {
    this.description = description;
  }

  public Task(int id, String description) {
    this.id = id;
    this.description = description;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
