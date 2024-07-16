package com.juanca.java.patrones.creacionales.factoryMethod.generico;

import com.juanca.java.patrones.creacionales.factoryMethod.generico.creator.ConcreteCreator1;
import com.juanca.java.patrones.creacionales.factoryMethod.generico.creator.ConcreteCreator2;
import com.juanca.java.patrones.creacionales.factoryMethod.generico.creator.Creator;
import com.juanca.java.patrones.creacionales.factoryMethod.generico.product.Product;

/**
 * La interfaz Product define la funcionalidad común de todos los productos.
 * <p>
 * La interfaz Creator define el método fábrica. Las clases ConcreteCreator1 y ConcreteCreator2 implementan la interfaz Creator y
 * proporcionan sus propias implementaciones del método factoryMethod().
 * <p>
 * Crea instancias de las clases ConcreteCreator1 y ConcreteCreator2 y las utiliza para crear instancias de las clases ConcreteProduct1 y
 * ConcreteProduct2, respectivamente.
 */
public class Client {

  public static void main(String[] args) {
    Creator creator1 = new ConcreteCreator1();
    Product product1 = creator1.factoryMethod();
    product1.operation();

    Creator creator2 = new ConcreteCreator2();
    Product product2 = creator2.factoryMethod();
    product2.operation();
  }

}