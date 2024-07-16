package com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.creator;

import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.domain.Maze;
import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.product.Door;
import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.product.MapSite;
import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.product.Room;
import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.product.Wall;

public class SimpleMazeCreator implements MazeCreator {

  private Maze maze;

  @Override
  public void createMaze() {
    maze = new Maze();
    // Implementar la lógica de construcción del laberinto simple

  }

  @Override
  public Room getRoom(int roomNumber) {
    return maze.getRoom(roomNumber);
  }

  @Override
  public void addRoom(Room room) {
    maze.addRoom(room);
  }

  @Override
  public MapSite makeWall() {
    return new Wall();
  }

  @Override
  public MapSite makeDoor(Room room1, Room room2) {
    return new Door(room1, room2);
  }

}
