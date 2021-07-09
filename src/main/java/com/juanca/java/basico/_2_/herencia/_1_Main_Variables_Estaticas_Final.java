package com.juanca.java.basico._2_.herencia;

import java.util.ArrayList;
import java.util.List;

/*
 * Para esto es bueno tener en cuenta el contexto estatico y dinamico que maneja Java
 */

public class _1_Main_Variables_Estaticas_Final {

	public static void main(String[] args) {
		List<LadoPoligono> lados = new ArrayList<LadoPoligono>();
		
		// Usando la variable estatica modificables, es decir, sin final
		Cuadrado.MI_NOMBRE = "Cuadrado 1";
		System.out.println(Cuadrado.MI_NOMBRE);
		
		// Usando la variable estatica NO Modificable, es decir, con final
		// Si intento hacer esto: Cuadrado.MIS_LADOS = 8; no me deja
		for (int i = 0; i < Cuadrado.MIS_LADOS; i++) {
			LadoPoligono lado = new LadoPoligono();
			lado.setTamanio(12.0);
			lados.add(lado);
		}	
	
		Cuadrado.MI_NOMBRE = "Cuadrado 2";
		System.out.println(Cuadrado.MI_NOMBRE);
		
		Cuadrado cuadrado1 = new Cuadrado(lados);
		// No se puede acceder a las variables estaticas de la clase desde una
		// instancia del objeto de la clase
		//cuadrado1.MIS_LADOS;
		
		// Si se quiere acceder desde un objeto o instancia se debe crear un metodo no estatico
		// dentro de la clase
		cuadrado1.conocerLados();
	}

}
