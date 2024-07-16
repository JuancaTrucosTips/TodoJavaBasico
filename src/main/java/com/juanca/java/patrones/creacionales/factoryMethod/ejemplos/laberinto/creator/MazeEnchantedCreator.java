package com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.creator;

import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.product.MapSite;
import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.product.Room;
import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.product.feature.DoorNeedingSpell;

// Principio de Sustitución de Liskov y segregación de interfaces creeé esta

public interface MazeEnchantedCreator {

  void createMaze();

  Room makeEnchantedRoom(int roomNo, String spell);

  void addRoom(Room room);

  DoorNeedingSpell makeDoorNeedingSpell(Room room1, Room room2);

  MapSite makeWall();

}
