package com.juanca.java.patrones.creacionales.factoryMethod.generico.creator;

import com.juanca.java.patrones.creacionales.factoryMethod.generico.product.ConcreteProduct1;
import com.juanca.java.patrones.creacionales.factoryMethod.generico.product.Product;

public class ConcreteCreator1 implements Creator {

  @Override
  public Product factoryMethod() {
    return new ConcreteProduct1();
  }

}

