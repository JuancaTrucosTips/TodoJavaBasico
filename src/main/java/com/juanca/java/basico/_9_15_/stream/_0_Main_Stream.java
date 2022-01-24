package com.juanca.java.basico._9_15_.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
		
		/*
		 * Find First
		 */
		setUpUsers();
		User primerUsuario = users.stream()	
				.filter(usuario -> "Juan".equals(usuario.getNombre()))
				.findFirst()
				.orElse(new User(0, "vacio"));
		
		System.out.println();
		System.out.println("Find First");
		System.out.println(primerUsuario.getId() + " " +  primerUsuario.getNombre());
		
		/*
		 * FlatMap
		 * Tiene los datos de diferentes arrays o listados y los concatena en un unico stream
		 */
		
		List<List<String>> nombreVariasListas = new ArrayList<List<String>>(
				Arrays.asList(
					new ArrayList<String>(Arrays.asList("James", "Karol G")),
					new ArrayList<String>(Arrays.asList("Messi", "Cris H"))
					)
				);
		
		List<String> nombresUnicaLista = nombreVariasListas.stream()
				.flatMap(elemento -> elemento.stream())
				.collect(Collectors.toList());
		
		System.out.println();
		System.out.println("FlatMap");	
		nombresUnicaLista.forEach(valor -> System.out.println(valor));
		
		/*
		 * Peek, actua como un ForEach pero sin ser una opción final
		 * se puede seguir haciendo cosas en el ciclo del stream
		 */
		
		System.out.println("");
		setUpUsers();
		System.out.println("Peak");
		List<User> users2 = users.stream()
				.peek(usuario -> usuario.setNombre(usuario.getNombre() + " Apellido"))
				.collect(Collectors.toList());
		
		users2.forEach(usuario -> System.out.println(usuario.getNombre()));
		
		System.out.println("");
		setUpUsers();
		System.out.println("Count");
		
		Long numeroFiltrado = users2.stream()
				.filter(usuario -> usuario.getId() < 3)
				.count();
		
		System.out.println("cantidad que cumple el filtro: " + numeroFiltrado);
		
		System.out.println("");
		System.out.println("Skip y Limit");
		/*
		 * Skip, saltar tantos elementos como queramos
		 */
		
		String [] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
		List<String> letrasFiltradas = Arrays.stream(letras)
				.skip(2)
				.limit(4)
				.collect(Collectors.toList());
		
		letrasFiltradas.forEach(letra -> System.out.println(letra));
		
		/* sorted
		 * Nos sirve para ordenar listados de datos
		 */
		
		System.out.println("");
		setUpUsers();
		System.out.print("Sorted: \n");

		List<User> usuariosOrdenados = users.stream()
				.sorted(Comparator.comparing(User::getNombre))
				.collect(Collectors.toList());
		
		usuariosOrdenados.forEach(usuario -> System.out.println(usuario.getNombre()));
		
		/*
		 * Uso de min y max
		 */
		
		System.out.println("\nMin");
		User minUser = users.stream()
				.min(Comparator.comparing(User::getId))
				.orElse(new User(0,"lista vacia"));
		
		System.out.println("usuario con el minimo id, es: " + minUser.getId() + " - " + minUser.getNombre());
		
		/*
		 * distinct
		 */
		System.out.println("\nUso de distinct");
		String [] letrasDuplicadas = {"a", "b", "c", "a", "e", "r", "g", "h", "h", "j" };
		List<String> letrasUnicas = Arrays.stream(letrasDuplicadas)
				.distinct().collect(Collectors.toList());
		
		letrasUnicas.forEach(letra -> System.out.println(letra));
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
