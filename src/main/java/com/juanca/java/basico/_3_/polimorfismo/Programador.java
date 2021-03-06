package com.juanca.java.basico._3_.polimorfismo;

public class Programador extends Persona {
	
	private String especialidad;
	
	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public void decirQuienEres() {
		System.out.println("Soy un Programador.");
	}
	
	public void programarServicioWeb(){
		System.out.println("Programar Servicio Web Ok.");
	}

	@Override
	public String toString() {
		return super.toString() + " es Programador [especialidad=" + especialidad + "]";
	}
	
}
