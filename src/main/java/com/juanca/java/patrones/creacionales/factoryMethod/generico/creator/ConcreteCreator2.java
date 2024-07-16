package com.juanca.java.patrones.creacionales.factoryMethod.generico.creator;

import com.juanca.java.patrones.creacionales.factoryMethod.generico.product.ConcreteProduct2;
import com.juanca.java.patrones.creacionales.factoryMethod.generico.product.Product;

public class ConcreteCreator2 implements Creator {

  @Override
  public Product factoryMethod() {
    return new ConcreteProduct2();
  }

}

