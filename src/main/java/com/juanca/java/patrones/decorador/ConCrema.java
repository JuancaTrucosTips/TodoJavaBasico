package com.juanca.java.patrones.decorador;

public class ConCrema extends DecoradorCafe {

  public ConCrema(Bebida bebida) {
    super(bebida);
  }

  @Override
  public String getDescription() {
    return bebida.getDescription() + ", Con Crema";
  }

  @Override
  public double costo() {
    return bebida.costo() + 0.3;
  }

}
