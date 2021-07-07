package com.juanca.java.basico._6_.operadores;

import java.util.Arrays;

/*

+ = , para sumar el operando izquierdo con el operando derecho y luego asignarlo a la variable de la izquierda.
– = , para restar el operando izquierdo con el operando derecho y luego asignarlo a la variable de la izquierda.
* = , para multiplicar el operando izquierdo con el operando derecho y luego asignándolo a la variable de la izquierda.
/ = , para dividir el operando izquierdo con el operando derecho y luego asignarlo a la variable de la izquierda.
^ = , para aumentar la potencia del operando izquierdo al operando derecho y asignarlo a la variable de la izquierda.
% = , para asignar el módulo del operando izquierdo con el operando derecho y luego asignarlo a la variable de la izquierda.

*/
import java.util.List;

public class _1_Main_Igualdad {

	public static void main(String[] args) {
		// Esta lista por el uso de Arrays.asList no es posible añadirle datos
		List<Integer> listaNumeros = Arrays.asList(3, 5, 7, 9);

		// Lo sigueinte compilaria pero saca error en tiempo de ejecución. UnsupportedOperationException
		//listaNumeros.add(12);

		// Imprimir los datos de la lista por consola
		listaNumeros.forEach(System.out::println);
		System.out.println();

		int masIgualSuma = 0;
		int i = 1;
		while (i < 10) {
			//sumaMasMas = sumaMasMas + i;
			// lo que está a la derecho se acumula lo que que está a la izquierda
			masIgualSuma += i;
			i++;
		}
				
		System.out.println("masIgualSuma: " + masIgualSuma);
		
		// Para restar seria -=
		// Para multiplicar seria *=
		// Para dividir seria /=
		// Para potencia ^=
		// Para modulo %=
		
		// se recorre la lista de numeros y se suma el primero con el siguiente y se acumula
		int suma = listaNumeros.stream().map(Integer::valueOf).reduce(0, (a , b) -> a += b);
		System.out.println(suma);
		
		// se recorre la lista de numeros y se suma el primero con el siguiente y se acumula
		int multiplicar = listaNumeros.stream().map(Integer::valueOf).reduce(1, (a , b) -> a *= b);
		System.out.println(multiplicar);
		
	}

}
