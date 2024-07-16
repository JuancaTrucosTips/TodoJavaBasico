package com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.creator;

import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.product.MapSite;
import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.product.Room;

public interface MazeCreator {

  void createMaze();

  void addRoom(Room room);

  Room getRoom(int roomNumber);

  MapSite makeDoor(Room room1, Room room2);

  MapSite makeWall();

}
