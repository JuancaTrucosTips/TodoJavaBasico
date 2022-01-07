package com.juanca.java.basico._4_.interfaces;

public interface IFiguraPlana {
	
	// Estas tres variables es para probar como funcionan desde una interface al poner
	// static, final
	public static final int VALOR_MULTIPLICADOR = 1;
	public static int VALOR_MULTIPLICADOR_2 = 3;
	public String nombre = "IFiguraPlana";

	public double obtenerArea();
	double obtenerAreaLambda(); // por defecto es public
	public double obtenerPerimetro();
	void obtenerNombre();
	
	public default void imprimirQueEs(){
		System.out.println("Figura");
	};
	
	public static void imprimirQueNoEs(){
		System.out.println("No soy un n�mero");
	};
	
	public default void imprimirQueNoEsDefault(){
		imprimirQueNoEs();
	}
}
