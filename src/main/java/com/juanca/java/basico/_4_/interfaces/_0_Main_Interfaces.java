package com.juanca.java.basico._4_.interfaces;

public class _0_Main_Interfaces {

	public static void main(String[] args) {
		double tamanio = 20.3;
		IFiguraPlana figura = new CuadradoImpl(tamanio);
					
		System.out.println("Metodos que se pueden accceder desde la interfaz");
		// La interface IFigura tiene un metodo estatico al cual se puede acceder 
		IFiguraPlana.imprimirQueNoEs();
		figura.imprimirQueEs();
		figura.imprimirQueNoEsDefault();
		System.out.println();
		
		figura.obtenerNombre();
		System.out.println("Area: " + figura.obtenerArea());		
		System.out.println("Con lambadas y streams");
		System.out.println(figura.obtenerAreaLambda());
		System.out.println("");
		
		// Ahora el rectangulo
		figura = new RectanguloImpl(10.5, 20.2);
				
		figura.obtenerNombre();
		System.out.println("Area: " + figura.obtenerArea());		
		System.out.println("Con lambadas y streams");
		System.out.println(figura.obtenerAreaLambda());
	}

}
