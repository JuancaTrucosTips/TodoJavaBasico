package com.juanca.java.basico._9_16_.HighOrderFunctions;
/*
 * Funcion que puede recibir una funcion o 2 como parametro de entrada
 */

public class Main_HighOrderFunctions implements ISumar {

	public static void main(String[] args) {
		Main_HighOrderFunctions main_HighOrderFunctions = new Main_HighOrderFunctions();
		System.out.println("Para ver la diferencia primero creamos metodos para usar de forma tradicional");
		System.out.println(Main_HighOrderFunctions.funcionNormalSumar(5, 2));
		System.out.println(main_HighOrderFunctions.aply(5, 2));
		
		System.out.println("\nUsando HighOrderFunctions");
		ISumar suma = (a , b) -> a + b;
		System.out.println(main_HighOrderFunctions.funcionHighOrderSumar(suma, 10, 5));
		

	}
	
	public static int funcionNormalSumar(int a, int b) {
		return a + b;
	}

	@Override
	public int aply(int a, int b) {
		return a + b;
	}
	
	public int funcionHighOrderSumar(ISumar sumar, int a, int b) {
		return sumar.aply(a, b);
	}

}
