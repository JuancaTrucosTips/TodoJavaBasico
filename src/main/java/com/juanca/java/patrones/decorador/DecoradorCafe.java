package com.juanca.java.patrones.decorador;

public abstract class DecoradorCafe implements Bebida {

  protected Bebida bebida;

  public DecoradorCafe(Bebida bebida) {
    this.bebida = bebida;
  }

  @Override
  public String getDescription() {
    return bebida.getDescription();
  }

  @Override
  public double costo() {
    return bebida.costo();
  }

}
