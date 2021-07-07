package com.juanca.java.basico._5_.clasesabstractas;

public abstract class AFiguraPlana {

	private String nombre;
	
	public void decirNombreDeSuPadre() {
		System.out.println("Clase Abstracta de Figura Plana");
	}
	
	public abstract double obtenerArea();
	public abstract double obtenerPerimetro();
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@SuppressWarnings("unused")
	private Double calcularLados() {
		return 2 * 0.0;
	}
}
