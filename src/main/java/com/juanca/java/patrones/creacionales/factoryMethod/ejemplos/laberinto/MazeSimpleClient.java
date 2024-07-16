package com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto;

import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.creator.MazeCreator;
import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.creator.SimpleMazeCreator;
import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.domain.Direction;
import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.product.MapSite;
import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.product.Room;

public class MazeSimpleClient {

  public static void main(String[] args) {
    MazeCreator mazeCreator = new SimpleMazeCreator();
    mazeCreator.createMaze();

    Room room1 = new Room(1);
    Room room2 = new Room(2);
    mazeCreator.addRoom(room1);
    mazeCreator.addRoom(room2);

    MapSite door = mazeCreator.makeDoor(room1, room2);
    room1.setSide(Direction.NORTH, door);
    room2.setSide(Direction.SOUTH, door);
    room1.setSide(Direction.EAST, mazeCreator.makeWall());
    room1.setSide(Direction.WEST, mazeCreator.makeWall());
    room1.setSide(Direction.SOUTH, mazeCreator.makeWall());
    room2.setSide(Direction.NORTH, mazeCreator.makeWall());
    room2.setSide(Direction.EAST, mazeCreator.makeWall());
    room2.setSide(Direction.WEST, mazeCreator.makeWall());

    // Simulación de interacción con el laberinto
    System.out.println("Habitación 1, lado Norte: " + room1.getSide(Direction.NORTH).getDescription());
    System.out.println("Habitación 2, lado Sur: " + room2.getSide(Direction.SOUTH).getDescription());


  }

}
