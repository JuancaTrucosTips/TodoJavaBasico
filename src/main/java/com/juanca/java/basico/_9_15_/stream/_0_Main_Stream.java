package com.juanca.java.basico._9_15_.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Un Stream representa una secuencia de elementos que admite diferentes tipos de operaciones
 * para realizar calculos sobre dichos elementos.
 * 
 * Un Stream tiene un conjunto de funciones que se ejecutan de forma anidada.
 * 
 * Tenemos diferentes operaciones que se pueden anidar.
 * 
 * Las mas conocidas permiten, reducir, recopilar y hacer map
 * 
 * Los Streams son envoltorios que pemiten operar con esos datos para  de forma rapida y masiva.
 */

public class _0_Main_Stream {

	private static List<User> users;

	public static void main(String[] args) {
		setUpUsers();
		
		/*
		 * Formas de crear un Stream
		 */
		Stream stream = Stream.of(users);
		users.stream();
		
		/*
		 * For Each
		 */
		
		imprimirListaStream();
		users.stream().forEach(user -> user.setNombre(user.getNombre() + " Arias"));
		imprimirListaStream();
		
		/*
		 * map, nos permite hacer transformaciones rapidas en 1 sola linea de codigo de los datos originales
		 */
		
		List<Integer> identificadoresUsuarios = users.stream().map(User::getId).collect(Collectors.toList());		
		System.out.println();
		identificadoresUsuarios.forEach(id -> System.out.println(id));
		
		List<String> listadoNombres = users.stream().map(User::getNombre).collect(Collectors.toList());
		System.out.println();
		listadoNombres.stream().forEach(nombre -> System.out.println(nombre));
		
		/*
		 * Filters
		 * Nos ayuda a crear objetos con los filtros que usemos
		 */
		
		setUpUsers();
		
		List<User> usersFilters = users.stream()
				.filter(user -> !"Juan".equals(user.getNombre()))
				.filter(user -> user.getId() >= 2)
				.collect(Collectors.toList());
		System.out.println();
		usersFilters.forEach(user -> System.out.println(user.getNombre()));
		
		List<Integer> listadoIdentificadoresOk = users.stream().map(User::getId)
				.filter(id -> id > 2)
				.collect(Collectors.toList());
		
		System.out.println();
		listadoIdentificadoresOk.forEach(id -> System.out.println(id));
	
	}

	private static void imprimirListaStream() {
		System.out.println("");
		users.stream().forEach(user -> System.out.println(user.getNombre()));
	}

	private static void setUpUsers() {
		users = new ArrayList<>();
		users.add(new User(1, "Juan"));
		users.add(new User(2, "Estefa"));
		users.add(new User(3, "Carlos"));
		users.add(new User(4, "Manuela"));
		users.add(new User(5, "Juan"));
	}

}
