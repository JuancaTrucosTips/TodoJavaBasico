package com.juanca.java.basico._9_11_.ToStringEqualsHashCode;

public class _0_Main_ToStringEqualsHashCode {

	public static void main(String[] args) {
		Abogado abogado1 = new Abogado("Juan Carlos", 31, "71598763");
		System.out.println("Abogado1: " + abogado1.toString());

		Abogado abogado2 = new Abogado("Juan Carlos", 31, "71598763");
		System.out.println("Abogado2: " + abogado2.toString());

		System.out.println("Son iguales en su contenido: " + abogado1.equals(abogado2));

		System.out.println();
		// Al hacer lo siguiente estamos es comparando referencias en memoria 
		// y no el contenido como anteriormente con equals
		// solo se usa == cuando son tipos de datos primitivos

		if (abogado1 == abogado2) 
			System.out.println("Son iguales en referencia o en memoria");
		else
			System.out.println("No son iguales en referencia o en memoria");

		System.out.println();

		/*
		 * Por regla, si el m�todo equals() entre dos objetos devuelve verdadero, 
		 * entonces el hashcode deber�a ser igual.
		 */

		System.out.println("Los hash son iguales: " + (abogado1.hashCode() == abogado2.hashCode()));
		
		System.out.println("Cambio de prueba_rama");
		
	}

}
