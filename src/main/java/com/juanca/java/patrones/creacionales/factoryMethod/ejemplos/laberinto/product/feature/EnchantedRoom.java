package com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.product.feature;

import com.juanca.java.patrones.creacionales.factoryMethod.ejemplos.laberinto.product.Room;

public class EnchantedRoom extends Room {
  private final String spell;

  public EnchantedRoom(int roomNo, String spell) {
    super(roomNo);
    this.spell = spell;
  }

  public String getSpell() {
    return spell;
  }

  @Override
  public void enter() {
    // Implementar lógica para entrar en la habitación encantada
  }
}
