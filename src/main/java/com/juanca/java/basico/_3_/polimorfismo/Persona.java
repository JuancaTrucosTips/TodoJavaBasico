package com.juanca.java.basico._3_.polimorfismo;

public class Persona {
	
	protected String nombre;
	protected int edad;
	
	public Persona() {
	
	}
	
	public Persona (String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void decirQuienEres () {
		System.out.println("Soy una Persona.");
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

}
