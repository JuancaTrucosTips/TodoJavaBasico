package com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto;

import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.creator.EnchantedMazeCreator;
import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.creator.MazeCreator;
import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.creator.MazeEnchantedCreator;
import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.domain.Direction;
import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.product.MapSite;
import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.product.Room;
import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.product.feature.DoorNeedingSpell;
import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.product.feature.EnchantedRoom;

public class MazeEnchantedClient {

  public static void main(String[] args) {
    MazeEnchantedCreator creator = new EnchantedMazeCreator();
    creator.createMaze();

    Room room1 = creator.makeEnchantedRoom(1, "Abracadabra");
    Room room2 = creator.makeEnchantedRoom(2, "Hocus Pocus");
    creator.addRoom(room1);
    creator.addRoom(room2);

    MapSite door = creator.makeDoorNeedingSpell(room1, room2);
    room1.setSide(Direction.NORTH, door);
    room2.setSide(Direction.SOUTH, door);
    room1.setSide(Direction.EAST, creator.makeWall());
    room1.setSide(Direction.WEST, creator.makeWall());
    room1.setSide(Direction.SOUTH, creator.makeWall());
    room2.setSide(Direction.NORTH, creator.makeWall());
    room2.setSide(Direction.EAST, creator.makeWall());
    room2.setSide(Direction.WEST, creator.makeWall());

    // Ejemplo de cómo se podría interactuar con las habitaciones y puertas encantadas
    System.out.println("Hechizo de la habitación 1: " + ((EnchantedRoom) room1).getSpell());
    ((DoorNeedingSpell) door).castSpell();
    door.enter();
  }

}
