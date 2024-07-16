package com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.product;

import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.domain.Direction;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Room implements MapSite {

  private final int roomNumber;

  private final List<MapSite> sides;

  public Room(int roomNumber) {
    this.roomNumber = roomNumber;
    // This mean that whatever room has always four sides
    this.sides = IntStream
        .range(0, 4)
        .mapToObj(i -> (MapSite) null)
        .collect(Collectors.toCollection(ArrayList::new));
  }

  // Constructor, getters, setters y métodos para establecer lados (paredes o puertas)

  @Override
  public String getDescription() {
    return "Habitación #" + getRoomNumber();
  }

  @Override
  public void enter() {
    System.out.println("Entrando en la habitación #" + getRoomNumber());
  }

  public int getRoomNumber() {
    return roomNumber;
  }

  public void setSide(Direction direction, MapSite mapSite) {
    // Implementar lógica para establecer el lado basado en la dirección
    sides.set(direction.ordinal(), mapSite);
  }

  public MapSite getSide(Direction direction) {
    // Implementar lógica para obtener el lado basado en la dirección
    return sides.get(direction.ordinal());
  }

}