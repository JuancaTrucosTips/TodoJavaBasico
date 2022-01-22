package com.juanca.java.basico._9_12_.lambda;

/*
 * Funciones Lambda conocidas como funciona anonimas o sin nombre.
 * Clave de la programación declarativa.
 * 
 * Las funciones lambda funcionan son métodos abstractos anónimo sin nombre. 
 * Se usa para usar un metodo definido en una interfaz funcional (1 metodo abstracto y el metodo especifica el proposito de la interfaz)
 *  y este método no ha sido implementado y se puede usar sin necesidad de heredar de la interfaz.
 * 
 * Son funciones que se van a usar 1 sola vez, es decir, no es una función que se declare y 
 * se utilice varias veces.
 * 
 * Parametro de entrada de las funciones de alto nivel???
 * Fucniona con filter, map y reduce.
 * 
 * Código más claro, reduce las lineas de código.
 * 
 * 	Argumentos  Operador Cuerpo
 * (parámetros) -> expresión
 * 
 */

public class _0_Main_Lambda {

	public static void main(String[] args) {

		/*
		 * Clase anonima para implementar una interfaz
		 */
		IMinombre minombreAnonima = new IMinombre() {
			@Override
			public String miNombre() {
				return "Juan Carlos Anonimo";
			}
		};

		System.out.println(minombreAnonima.miNombre());

		/* La idea es hacerlo más sencillo utilizando Lambdas */
		IMinombre minombreLambda = () -> "Juan Carlos Lambda";
		/*
		 * Si fuera el caso, dentro () podrian existir parametros si así lo tuviera el
		 * metodo abrastracto de la interfaz
		 */

		System.out.println(minombreLambda.miNombre());
		
		ISuma suma = (a, b) -> a + b;
		
		System.out.println(suma.sumar(2, 1));
		
		ISuma suma2 = (a, b) -> {
			a = a * b;
			b = a + b;
			System.out.println("Mensaje dentro de la función lambda");
			return a + b;
		};
		
		/*
		 * Si esta función se necesitara utilizar en otra parte, en ese caso si sería mejor hacer una 
		 * implementación de la funcion con una clase Impl como se conoce normalmente.
		 */
		
		System.out.println(suma2.sumar(1, 2));
		
		IMetodoPorDefecto conMetodoPorDefectoImpl = new MetodoPorDefectoImpl();
		conMetodoPorDefectoImpl.mostrarNombre("Juan Ca");
		
		System.out.println(conMetodoPorDefectoImpl.nombrePorDefecto("Juan Ca"));
		
		IMetodoPorDefecto conMetodoPorDefectoLambda = nombre -> System.out.println(nombre + " en Lambda");
		/*
		 * Cuando es 1 solo parámetro se puede quitar los parentesis () de los parámetros.
		 */
		
		conMetodoPorDefectoLambda.mostrarNombre("Juan Ca");
		
	}

}
