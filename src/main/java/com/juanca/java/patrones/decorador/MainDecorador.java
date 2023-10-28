package com.juanca.java.patrones.decorador;

public class MainDecorador {

  public static void main(String[] args) {
    Bebida miCafe = new Cafe();
    miCafe = new ConLeche(miCafe);
    miCafe = new ConCrema(miCafe);

    System.out.println("Descripción: " + miCafe.getDescription());
    System.out.println("Costo: $" + miCafe.costo());
  }

}
