package com.juanca.java.basico._9_10_.contextoEstaticoDinamico;

public class _0_Main_Contexto_Estatico_Dinamico {

	public static void main(String[] args) {
		Persona persona1 = new Persona();
		System.out.println("persona1 = " + persona1);
		System.out.println("");
		
		// Para este otro caso ya no se ejecuta el contexto estatico
		// por que ya se ejecutó una vez en la linea 6
		// es decir, en el primero llamado a la clase Persona
		Persona persona2 = new Persona();
		System.out.println("persona2 = " + persona2);
	}

}
