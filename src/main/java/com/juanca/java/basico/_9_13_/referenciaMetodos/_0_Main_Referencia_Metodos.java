package com.juanca.java.basico._9_13_.referenciaMetodos;

import java.util.ArrayList;
import java.util.List;

/*
 * Forma corta de expresión Lambda que tiene una llamda a un metodo, reduciendo aún más el código de una
 * expresión Lambda
 * 
 * la referencia a metodo puede usarse en lugar de la función Lambda
 */

public class _0_Main_Referencia_Metodos {

	public static void main(String[] args) {

		/*
		 * Normalmente se realiza la implementación de los métodos de la interfaz
		 */
		ITrabajo trabajo = new ITrabajo() {

			@Override
			public void realizarAccion() {
				User.referenciaMetodoEstatico();
			}
		};

		trabajo.realizarAccion();

		/*
		 * Con expresiones Lambda quedaria de esta forma
		 */

		ITrabajo trabajoLambda = () -> User.referenciaMetodoEstatico();
		trabajoLambda.realizarAccion();

		/*
		 * Con referencia a métodos queda aún con menos código
		 */

		ITrabajo trabajoLambda2 = User::referenciaMetodoEstatico;
		trabajoLambda2.realizarAccion();

		//////////

		User user = new User("Pedro");

		ITrabajo trabajoLambda3 = () -> user.referenciaMetodoCualquiera();
		trabajoLambda3.realizarAccion();

		ITrabajo trabajoLambda4 = user::referenciaMetodoCualquiera;
		trabajoLambda4.realizarAccion();

		///

		ITrabajoString trabajoParametro = (valor) -> valor.toUpperCase();
		System.out.println(trabajoParametro.realizarAccion("Juan Carlos"));

		ITrabajoString trabajoParametro2 = String::toUpperCase;
		System.out.println(trabajoParametro2.realizarAccion("Juan Carlos"));

		List<User> usuarios = new ArrayList<>();
		usuarios.add(new User("Juan"));
		usuarios.add(new User("Carlos"));
		usuarios.add(new User("Estefania"));
		usuarios.add(new User("Manuela"));

		usuarios.forEach(nombre -> nombre.mostarNombre());
		System.out.println();
		usuarios.forEach(User::mostarNombre);

		// Referecia a un contructor
		IUser userCons = new IUser() {

			@Override
			public User crear(String nombre) {
				return new User(nombre);
			}
		};

		userCons.crear("Juan Carlos");

		IUser userCons1 = (nombre) -> new User(nombre);
		IUser userCons2 = User::new;
	}

}
