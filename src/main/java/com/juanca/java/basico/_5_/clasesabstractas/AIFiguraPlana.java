package com.juanca.java.basico._5_.clasesabstractas;

public abstract class AIFiguraPlana {
	
	/*
	 * Esta clase es para mostrar como podria ser entre comillas igual esta clase a una interfaz
	 * Como la creada en el paquete de interfaces IFiguraPlana
	 */

	public abstract double obtenerArea();
	abstract double obtenerAreaLambda(); // por defecto es public
	public abstract double obtenerPerimetro();
	abstract void obtenerNombre();
	
	public void imprimirQueEs(){
		System.out.println("Figura");
	};
	
	public static void imprimirQueNoEs(){
		System.out.println("No soy un número");
	};
	
	public void imprimirQueNoEsDefault(){
		imprimirQueNoEs();
	}
}
