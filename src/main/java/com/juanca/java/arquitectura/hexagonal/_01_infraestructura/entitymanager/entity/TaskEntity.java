package com.juanca.java.arquitectura.hexagonal._01_infraestructura.entitymanager.entity;

public class TaskEntity {

  private int id;

  private String description;

  public TaskEntity(String description) {
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
