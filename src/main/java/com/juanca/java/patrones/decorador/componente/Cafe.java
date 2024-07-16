package com.juanca.java.patrones.decorador.componente;

public class Cafe implements Bebida {

  public Cafe(String tipoPreparacion) {
    this.tipoPreparacion = tipoPreparacion;
  }

  private String tipoPreparacion;

  @Override
  public String getDescription() {
    return "Café: " + getTipoPreparacion();
  }

  @Override
  public double costo() {
    return 2.0;
  }

  public void setTipoPreparacion(String tipoPreparacion) {
    this.tipoPreparacion = tipoPreparacion;
  }

  public String getTipoPreparacion() {
    return tipoPreparacion;
  }

}

