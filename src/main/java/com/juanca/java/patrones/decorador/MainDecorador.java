package com.juanca.java.patrones.decorador;

import com.juanca.java.patrones.decorador.componente.Bebida;
import com.juanca.java.patrones.decorador.componente.Cafe;
import com.juanca.java.patrones.decorador.concretas.DecoradorConCrema;
import com.juanca.java.patrones.decorador.concretas.DecoradorConLeche;

public class MainDecorador {

  public static void main(String[] args) {
    Bebida miCafe = new Cafe("Americano");
    miCafe = new DecoradorConLeche(miCafe);
    miCafe = new DecoradorConCrema(miCafe);

    System.out.println("Descripción: " + miCafe.getDescription());
    System.out.println("Costo: $" + miCafe.costo());
  }

}
