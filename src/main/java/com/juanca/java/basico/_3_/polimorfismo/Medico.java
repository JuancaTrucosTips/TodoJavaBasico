package com.juanca.java.basico._3_.polimorfismo;

public class Medico extends Persona{
	
	@Override
	public void decirQuienEres() {
		System.out.println("Soy un Medico.");
	}
	
	public void realizarConsulta() {
		System.out.println("Consulta Medica OK.");
	}
}
