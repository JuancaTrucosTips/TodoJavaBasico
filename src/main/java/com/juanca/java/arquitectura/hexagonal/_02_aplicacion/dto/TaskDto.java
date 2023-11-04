package com.juanca.java.arquitectura.hexagonal._02_aplicacion.dto;

public class TaskDto {

  private int id;

  private String description;

  public TaskDto(String description) {
    this.description = description;
  }


  public TaskDto(int id, String description) {
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
