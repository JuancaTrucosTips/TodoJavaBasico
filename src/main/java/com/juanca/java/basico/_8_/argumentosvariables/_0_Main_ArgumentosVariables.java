package com.juanca.java.basico._8_.argumentosvariables;

/*
 * Tambien llamado varargs
 */

public class _0_Main_ArgumentosVariables {

	public static void main(String[] args) {

		sumarNumeros(5, 9, 8);
		
		Libro libro1 = new Libro();
		libro1.setNombre("Padre Rico Padre Pobre");
		libro1.setAutor("Robert Kiyosaki");
		
		Libro libro2 = new Libro();
		libro2.setNombre("Titanes");
		libro2.setAutor("Tim Ferris");
		
		impimirLibros(libro1, libro2);
	}

	// El argumento que es variable debe ir siempre al final
	// Acá por estar al inicio falla en la compilación
	/*private static void sumarNumeros(int... numeros, String nombre){

	}*/

	private static void sumarNumeros(int... numeros){
		int suma = 0;
		for (int i : numeros) {
			suma += i;
		}

		System.out.println("La suma es: " + suma);
	}

	private static void impimirLibros(Libro... libros){
		for (Libro libro : libros) {
			System.out.println(libro.toString());
		}
	}

}
