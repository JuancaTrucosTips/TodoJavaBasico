package com.juanca.java.basico._6_.operadores;

/*
 * En este caso los operadores de + - * /
 * Tienen un prioridad o precedencia que dice quien se ejecuta primero
 * En conclusión el orden es (* ó /) (+ ó -)
 *
 */
public class _2_Main_Asignacion {

	public static void main(String[] args) {
		int a = 6, b = 9;

		// Se evalua de izquierda a derecha
		// Operador +  y - tienen la misma prioridad
		// Primero suma y luego resta
		int c = a + 5 - b;
		System.out.println(c);

		// En este caso primero multiplica y luego suma y luego resta
		int d = c + 2 * 9 - 1;
		System.out.println(d);

		// Acá con el parentesis obligamos que primero sume
		// Y luego multiplique y luego resta
		d = (c + 2) * 9 - 1;		
		System.out.println(d);

		// En este caso primero resta y luego multiplica
		// y por ultimo suma
		d = c + 2 * (9 - 1);
		System.out.println(d);

		// Primero multiplica 1*4, luego resta y luego
		// multiplica y por ultimo suma
		d = c + 2 * (9 - 1 * 4);
		System.out.println(d);

		// En este caso la multiplicación y división tienen el mismo nivel
		// de precedencia o prioridad
		// Primero multiplica lo del parentesis 2*4, luego divide
		// Luego resta y por ultimo suma
		d = c + 2 * (9 - 2 * 4 / 2);
		System.out.println(d);
		
		// Primero hace las operaciones de los parentesis mas internos
		// Luego Multiplica y luego divide
		// Por ultimo suma 1
		int k = ((12 - 2) * ( 21 - 11)) / ((1+1)*(15-10)) + 1 ;		
		System.out.println(k);
	}

}
