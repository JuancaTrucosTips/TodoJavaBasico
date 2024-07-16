package com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.domain;


import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.product.Room;
import java.util.HashMap;
import java.util.Map;

/**
 * Utiliza un HashMap para almacenar las habitaciones del laberinto, donde la clave es el número de habitación y el valor es la instancia de
 * Room.
 */

public class Maze {

  // para almacenar las habitaciones del laberinto. La clave será el número de habitación
  private final Map<Integer, Room> rooms;

  public Maze() {
    rooms = new HashMap<>();
  }

  public void addRoom(Room room) {
    rooms.put(room.getRoomNumber(), room);
  }

  public Room getRoom(int roomNumber) {
    return rooms.get(roomNumber);
  }

}
