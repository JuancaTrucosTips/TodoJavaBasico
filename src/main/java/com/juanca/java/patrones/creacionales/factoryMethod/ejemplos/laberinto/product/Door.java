package com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.product;

public class Door implements MapSite {

  private final Room room1;

  private final Room room2;

  public Door(Room room1, Room room2) {
    this.room1 = room1;
    this.room2 = room2;
  }

  // Constructor, getters, setters y método para abrir/cerrar la puerta

  @Override
  public String getDescription() {
    return "Puerta entre las habitaciones #" + room1.getRoomNumber() + " y #" + room2.getRoomNumber();
  }

  @Override
  public void enter() {
    System.out.println("Entrando por la puerta...");
    room1.enter();
  }

}
