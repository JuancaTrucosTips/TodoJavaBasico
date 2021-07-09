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
		// Esto es lo que la herencia permite, es decir, reutilizar metodos que son
		// semejantes en varias clases y evita repetir código
		System.out.println(cuadrado.perimetroMejorado());
		System.out.println(cuadrado.perimetroMejorado2());

		/*
		 * Uso de metodos public o protected
		 */
		System.out.println(cuadrado.tipoPoligono);
		System.out.println(cuadrado.tiposLados);
		
		// por convención a mi particularmente me gusta mas con metodos que 
		// acceder directamente a los atributos
		System.out.println(cuadrado.getTiposLados());
		
		// Normalmente podria volver a instanciar la variable y esto 
		// crear otro objeto de la clase y la variable ya apunta a esa nueva
		// referencia
		Cuadrado cuadradoAuxiliar = new Cuadrado(lados);
		System.out.println(cuadradoAuxiliar);
		
		cuadradoAuxiliar = new Cuadrado(lados);
		System.out.println(cuadradoAuxiliar);
		
		// al impimir el objeto notar que pirmero apunta a una referencia y ahora a otra
		
		/*
		 * Con la palabra o modificador final protegemos que eso no ocurra 
		 * si es necesario
		 */
		
		final Cuadrado cuadradoAuliar2 = new Cuadrado(lados);
		System.out.println(cuadradoAuliar2);
		//cuadradoAuliar2 = new Cuadrado(lados);
	}

}
