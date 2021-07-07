package com.juanca.java.basico._2_.herencia;

import java.util.ArrayList;
import java.util.List;

public class _0_Main_Herencia {

	public static void main(String[] args) {
		List<LadoPoligono> lados = new ArrayList<LadoPoligono>();

		int ladosCuadrado = 4;
		for (int i = 0; i < ladosCuadrado; i++) {
			LadoPoligono lado = new LadoPoligono();
			lado.setTamanio(12.0);
			lados.add(lado);
		}
		
		Cuadrado cuadrado = new Cuadrado(lados);
		
		// Solo por ejercicio el metodo perimetro se sobreescribe de como lo hace el padre
		System.out.println(cuadrado.perimetro());
		
		// Se accede a los metodos de la clase padre que no se sobreescribieron
		System.out.println(cuadrado.perimetroMejorado());
		System.out.println(cuadrado.perimetroMejorado2());

	}

}
