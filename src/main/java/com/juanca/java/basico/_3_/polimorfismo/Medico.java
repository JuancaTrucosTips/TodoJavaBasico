package com.juanca.java.basico._3_.polimorfismo;

public class Medico extends Persona{
	private String especialidad;
	
	@Override
	public void decirQuienEres() {
		System.out.println("Soy un Medico.");
	}
	
	public void realizarConsulta() {
		System.out.println("Consulta Medica OK.");
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return super.toString() + " es Medico [especialidad=" + especialidad + "]";
	}
}
