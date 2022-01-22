package com.juanca.java.basico._9_13_.referenciaMetodos;

public class User {
	
	private String nombre;
	
	public User(String nombre) {
		this.nombre = nombre;
	}
	
	public static void referenciaMetodoEstatico() {
		System.out.println("Ejecutando Referencia a Método Estático");
	}
	
	/*public static String referenciaMetodoEstaticoString(String nombre) {
		return nombre;
	}*/
	
	public void referenciaMetodoCualquiera() {
		System.out.println("Ejecutando Referencia a Método Cualquiera");
	}
	
	public void mostarNombre() {
		System.out.println(this.nombre);
	}

}
