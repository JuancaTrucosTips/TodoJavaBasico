package com.juanca.java.basico._5_.clasesabstractas;

public interface IAFiguraPlana {
// Comparaci�n con interfaces
	
	// No puedo crear atributos
	//private String nombre;
	
	// Puedo crear metodos con su implementaci�n pero solo con public default
	// o public static
	public static String getNombre() {
		return "nombre";
	}
}
