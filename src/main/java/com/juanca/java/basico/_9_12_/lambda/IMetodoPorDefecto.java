package com.juanca.java.basico._9_12_.lambda;

/*
 * Varias clases que implementan esta interfaz y si hay metodos que siempre van a ser igual
 * para eso mejor se usa los metodos por defecto
 */

@FunctionalInterface
public interface IMetodoPorDefecto {

	public void mostrarNombre (String nombre);
	public default String nombrePorDefecto (String nombre) {
		return nombre + " Por Defecto";
	}
	
	public default String nombrePorDefecto2 (String nombre) {
		return nombre + " Por Defecto 2";
	}
	
}
