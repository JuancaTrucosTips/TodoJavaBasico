package com.juanca.java.patrones.decorador.concretas;

import com.juanca.java.patrones.decorador.DecoradorCafe;
import com.juanca.java.patrones.decorador.componente.Bebida;

public class DecoradorConCrema extends DecoradorCafe {

  public DecoradorConCrema(Bebida bebida) {
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
