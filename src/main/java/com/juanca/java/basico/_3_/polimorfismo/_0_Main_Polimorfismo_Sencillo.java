package com.juanca.java.basico._3_.polimorfismo;

import java.util.ArrayList;
import java.util.List;

/* Es bueno comprender primero como funciona la Memoria en Java (pila o stack y heap)
 * En el polimorfismo se usan los conceptos de UpCasting y DownCasting
 * consiste en la posibilidad de que una referencia a objetos de una clase 
 * pueda conectarse también con objetos de descendientes de ésta
 */
public class _0_Main_Polimorfismo_Sencillo {

	public static void main(String[] args) {

		List<Persona> listaPersonas = new ArrayList<Persona>();

		// Se crear el objeto persona, es decir, se instancia como Persona
		// Digamos que es alguien que solo tienen informacion personal
		Persona persona = new Persona();
		persona.decirQuienEres();
		listaPersonas.add(persona);
		System.out.println(persona);
		System.out.println();

		/*	Ahora esa variable persona que apunta al objeto Persona quiere continuar 
		con los comportamientos y atributos de Persona y además ser Medico
		Entonces con new lo convertimos a Medico pero solo toma el comportamiento en comun
		es decir, el metodo que se sobre-escribe dle padre que es Persona.
		Tecnicamente lo que hacemos es que la variable persona apunta a la referencia nueva
		creada por new Medico y el Objeto Persona queda solo en el Heap
		 */
		persona = new Medico(); // Asignación polimorfica por la Herencia que hay
		persona.decirQuienEres();
		listaPersonas.add(persona);
		System.out.println(persona);
		System.out.println();

		/* Ahora si se quiere adquirir los demas comportamientos de Medico 
		 * creamos una variable medico y le decimos que apunte a persona
		 * es decir, sigue siendo la misma persona pero ahora debemos convertila a Medico
		 * por eso se hace el cast (Medico) ya que Medico hereda de persona y permite convertirla
		 * */
		Medico medico = new Medico(); // Asignación polimorfica por la Herencia que hay
		medico = (Medico) persona; // Tambien se puede usar instanceof y convertir
		medico.realizarConsulta();
		System.out.println(medico);
		System.out.println();

		persona = new Programador(); // Asignación polimorfica por la Herencia que hay
		persona.decirQuienEres();
		listaPersonas.add(persona);
		System.out.println(persona);
		System.out.println();

		/* Pensaria que ya la variable persona tiene acceso a los comportamientos de Programador
		   pero NO ES ASÏ ya que no se ha convertido a la clase Programamdor
		   a no ser que tuvieran metodos en común y se sobreescribiera en la hija
		   Por esto la siguiente linea no funcionaria
		 */
		//persona.programarServicioWeb();

		Persona otraPersona = new Programador();
		otraPersona.decirQuienEres();
		listaPersonas.add(otraPersona);
		System.out.println(otraPersona);
		System.out.println();

		Medico medicoAuxiliar = new Medico();
		medicoAuxiliar.decirQuienEres();
		System.out.println(medicoAuxiliar);

		/* Asignación Polimorfica sin cast
		 * En la linea 69 no me pide cast por que ya lo hace por el simple hecho
		 * que Medico hereda de Persona
		 */
		Persona personaAuxiliar = medicoAuxiliar; // Asignacion polimorfica
		personaAuxiliar.decirQuienEres();
		System.out.println(personaAuxiliar);

	}

}
