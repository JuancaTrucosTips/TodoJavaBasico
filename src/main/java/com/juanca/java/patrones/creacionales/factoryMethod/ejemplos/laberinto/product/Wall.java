package com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.product;

public class Wall implements MapSite {

  @Override
  public String getDescription() {
    return "Pared";
  }

  @Override
  public void enter() {
    System.out.println("No puedes entrar por una pared.");
  }

}