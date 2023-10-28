package com.juanca.java.patrones.decorador;

public class Cafe implements Bebida {

  @Override
  public String getDescription() {
    return "Café";
  }

  @Override
  public double costo() {
    return 2.0;
  }

}

