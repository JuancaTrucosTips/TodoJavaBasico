package com.juanca.java.basico._9_14_.optional;

import java.util.Optional;

/* Principal función reducir los Null Pointer Excpetion de manera considerable
 * 
 * Envoltorio de un tipo de dato
 */

public class _0_Main_Optional {

	public static void main(String[] args) {
		/*
		 * Hasta acá todo normal
		 */
		probarOptional("Juan Ca Optional");
		
		/*
		 * El problema ocurre cuando le pasamos un null
		 */
		
		//probarOptional(null);
		
		
		orElseOptiona(null);
		
		orElseThrow("JuanQuita");
		
		isPresent(null);
	}
	
	public static void probarOptional(String nombre) {
		System.out.println(nombre.length());
	}

	public static void probarOptionalOk(String nombre) {
		System.out.println(nombre.length());
	}
	
	public static void crearOptional() {
		Optional<String> optional = Optional.empty();
		System.out.println(optional.get());
				
	}
	
	public static void orElseOptiona(String nombre) {
		// Acepta vlaor nulo en la variable de entrada y no lanza excepción
		Optional<String> optional = Optional.ofNullable(nombre);
		
		/* No acepta valor null, si llega null lanza excepcion */
		
		//Optional<String> optional1 = Optional.of(nombre);
		
		/* Eso es necesario siempre utilizar el orElse para evitar null pointer
		 */
		
		String valor = Optional.ofNullable(nombre).orElse("vacio");
		
		System.out.println(valor);
		
	}
	
	public static void orElseThrow(String nombre) {
		
		/*
		 * De esta forma podemos lanzar excepciones
		 */
		String valor = Optional.ofNullable(nombre).orElseThrow(NullPointerException::new);
		
		System.out.println(valor);
	}
	
	public static void isPresent (String nombre) {
		Optional<String> valor = Optional.ofNullable(nombre);
		
		System.out.println(valor.isPresent());
		
		System.out.println(valor.isEmpty());
	}
	
}