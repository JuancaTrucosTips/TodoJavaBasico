package com.juanca.java.basico._3_1_.usoinstanceof;

import com.juanca.java.basico._3_.polimorfismo.Medico;
import com.juanca.java.basico._3_.polimorfismo.Persona;
import com.juanca.java.basico._3_.polimorfismo.Programador;

public class _0_Main_UsoInstanceOf {

	public static void main(String[] args) {
		System.out.println("Primero apunta a Persona");
		// Primero apunta a Persona
		Persona persona = new Persona();
		decirDeQueTipoEs(persona);
		decirDeQueTipoEsNoIdeal(persona);

		System.out.println();

		System.out.println("Luego apunta a Medico");
		// Luego apunta a Medico
		persona = new Medico();
		decirDeQueTipoEs(persona);
		decirDeQueTipoEsNoIdeal(persona);

	}

	/*
	 * La idea de instanceof es saber cual es el tipo al cual apunta la variabe
	 * por que en Herencia y por el polimorfismo podría apuntar a diferentes clases
	 * una variable.
	 * 
	 *  Idealmente en este tipo de metodos preguntar primero por las hijas
	 *  hasta llegar al padre y hacerlo if else ya que podria devolver 
	 *  verdadero en otros tipos padres por la herencia que existe
	 *  ver el método a continuación.
	 *  
	 *  También nos sirve para estar seguro al hacer conversiones con casteos ()
	 */
	public static void decirDeQueTipoEs(Persona persona) {
		System.out.println("decirDeQueTipoEs");
		if (persona instanceof Medico) {
			System.out.println("Es de Tipo Medico");
		} else if (persona instanceof Programador){
			System.out.println("Es de Tipo Programador");
		}else if (persona instanceof Persona) {
			System.out.println("Es de Tipo Persona");
		}else if (persona instanceof Object) {
			System.out.println("Es de Tipo Object");
		}
	}

	public static void decirDeQueTipoEsNoIdeal(Persona persona) {
		System.out.println("decirDeQueTipoEsNoIdeal");
		if (persona instanceof Medico) {
			System.out.println("Es de Tipo Medico");
		} 

		if (persona instanceof Programador){
			System.out.println("Es de Tipo Programador");
		}

		if (persona instanceof Persona) {
			System.out.println("Es de Tipo Persona");
		}

		if (persona instanceof Object) {
			System.out.println("Es de Tipo Object");
		}
	}

}
