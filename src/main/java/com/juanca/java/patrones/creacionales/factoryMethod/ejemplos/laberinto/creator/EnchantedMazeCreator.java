package com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.creator;

import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.domain.Maze;
import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.product.MapSite;
import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.product.Room;
import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.product.Wall;
import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.product.feature.DoorNeedingSpell;
import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.product.feature.EnchantedRoom;

public class EnchantedMazeCreator implements MazeEnchantedCreator {

  private Maze maze;

  @Override
  public void createMaze() {
    maze = new Maze();
  }

  @Override
  public Room makeEnchantedRoom(int roomNo, String spell) {
    return new EnchantedRoom(roomNo, spell);
  }

  @Override
  public void addRoom(Room room) {
    maze.addRoom(room);
  }

  /*@Override
  public Room getRoom(int roomNumber) {
    return maze.getRoom(roomNumber);
  }*/

  @Override
  public DoorNeedingSpell makeDoorNeedingSpell(Room room1, Room room2) {
    return new DoorNeedingSpell(room1, room2);
  }

  @Override
  public MapSite makeWall() {
    return new Wall();
  }

}
