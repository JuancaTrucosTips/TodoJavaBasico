package com.juanca.java.basico._7_.caracteresEspeciales;

public class _0_Main_CaracteresEspeciales {

	public static void main(String[] args) {
		String pais = "Colombia";
		
		// Poner un salto de línea
		System.out.print("Tu nombre es: \n" + "Juan?\n\n");
		
		// Retorno de carro
		// Imaginarse cuando se retorna el carro de la maquina de escribir
		// Es un concepto antiguo pero acá se usa cuando escribimos en ficheros
		System.out.print("Hola Brother: \rJuan\rQueVaina \r\n");

		
		// normalmente se usa al final de línea \r\n
		// es decir, devuelve el carro al inicio y luego salte a la linea siguiente
		
		// Pero cuando usamos System.out es más comodo usar
		// System.out.println ya que no tenemos que terminar cada cadena con
		// estos caracteres
		
		// https://es.stackoverflow.com/questions/172366/diferencia-entre-r-y-n-java
		
		
		// Poner un tabulador
		System.out.print("Del País: \t" + pais + "\r\n");
		
		// Eliminar un caracter a la izquierda
		//System.out.print("Hola Brother de: \b\b\b\b" + pais + "\r\n");
		
		// Usar comillas dobles y en general u otros caracteres como
		// las comillas simples '' o el mismo \
		System.out.println("Cual es tu país: " + "\"" + pais + "\"");
		
		// Se usa como un salto de página
		// en inglés y maquina de escribir se le conoce como form feed
		//System.out.print("A ver que hace \f");
	}

}
