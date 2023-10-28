package com.juanca.java.patrones.decorador;

public class ConLeche extends DecoradorCafe {

  public ConLeche(Bebida bebida) {
    super(bebida);
  }

  @Override
  public String getDescription() {
    return bebida.getDescription() + ", Con leche";
  }

  @Override
  public double costo() {
    return bebida.costo() + 0.5;
  }

}
