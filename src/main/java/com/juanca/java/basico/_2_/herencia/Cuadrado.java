package com.juanca.java.basico._2_.herencia;

import java.util.List;

public class Cuadrado extends Poligono{
	
	// Se puede acceder a ella desde donde sea pero no modificar su valor
	public static final int MIS_LADOS = 4;
	// Se puede acceder a ella desde donde sea y modificar su valor
	public static String MI_NOMBRE = "";
	// Se puede acceder a ella solo dentro de la clase o instancia y no modificar su valor
	public final double PI = 3.14;
	// Se puede acceder solo dentro de la clase
	private final double PI_2 = 3.14 * 2;

	public Cuadrado(List<LadoPoligono> lados) {
		super(lados);
	}

	// Solo por ejercicio se sobre escribe este metodo del padre
	@Override
	public double perimetro() {
		return 0.0 * PI * PI_2;
	}
	
	public void conocerLados(){
		System.out.println(Cuadrado.MIS_LADOS);
	}

}
