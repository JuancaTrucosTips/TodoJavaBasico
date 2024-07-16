package com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.product.feature;

import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.product.Door;
import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.product.Room;

public class DoorNeedingSpell extends Door {
  private boolean isSpellCasted;

  private boolean isOpen;

  public DoorNeedingSpell(Room room1, Room room2) {
    super(room1, room2);
    this.isSpellCasted = false;
    this.isOpen = false;
  }

  public void castSpell() {
    this.isSpellCasted = true;
    this.isOpen = true; // Suponemos que el hechizo abre la puerta
  }

  @Override
  public void enter() {
    if (isSpellCasted) {
      // Permitir la entrada si el hechizo ha sido lanzado
    } else {
      // Implementar lógica si el hechizo no ha sido lanzado
    }
  }
}