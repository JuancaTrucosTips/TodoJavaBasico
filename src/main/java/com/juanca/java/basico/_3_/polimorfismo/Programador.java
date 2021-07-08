package com.juanca.java.basico._3_.polimorfismo;

public class Programador extends Persona {
	
	@Override
	public void decirQuienEres() {
		System.out.println("Soy un Programador.");
	}
	
	public void programarServicioWeb(){
		System.out.println("Programar Servicio Web Ok.");
	}
}
