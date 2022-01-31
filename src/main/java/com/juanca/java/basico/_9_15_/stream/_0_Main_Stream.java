package com.juanca.java.basico._9_15_.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
		
		/*
		 * allMatch : Verifia si el predicado es verdadero o fals
		 * anyMatch : Verifica si por lo menos alguno cumple el predicado
		 * nonematch : Verifica si ningun elemento pasa el predicado
		 */
		System.out.println("\nUsando allMatch, anyMatch, noneMatch");
		List<Integer> listaNumeros = Arrays.asList(100, 300, 50);
		
		boolean allMatch = listaNumeros.stream().allMatch(numero -> numero > 301);
		System.out.println(allMatch);
		
		boolean anyMatch = listaNumeros.stream().anyMatch(numero -> numero > 100);
		System.out.println(anyMatch);
		
		boolean noneMatch = listaNumeros.stream().noneMatch(numero -> numero < 20);
		System.out.println(anyMatch);
		
		System.out.println("\nUsando average");
		setUpUsers();
		
		double promedio = users.stream()
				.mapToInt(User::getId)
				.average()
				.orElse(0);
		
		System.out.println(promedio);
		
		System.out.println("\nUsando IntStream of");
		IntStream numeros = IntStream.of(1,5,9,6);
		double suma = numeros.sum();
		System.out.println(suma);
		
		System.out.println("\nUsando IntStream Range");
		double suma2 = IntStream.rangeClosed(1, 3).sum();
		System.out.println(suma2);
		
		System.out.println("\nUsando Reduce");
		int sumaInt = users.stream()
				.map(User::getId)
				.reduce(0, Integer::sum);
		System.out.println(sumaInt);
		
		System.out.println("\nUsando joining");
		String nombres = users.stream()
				.map(User::getNombre)
				.collect(Collectors.joining(" - "));
		
		System.out.println(nombres);
		
		/* Collectors.toSet()
		 * Garantiza que no hay elementos repetidos 
		 * pero no garantiza el orden
		 */
		System.out.println("\nUsando toSet");
		Set<String> listadoNombresUnicos = users.stream()
				.map(User::getNombre)
				.collect(Collectors.toSet());
		
		listadoNombresUnicos.stream().forEach(nombre -> System.out.println(nombre));
		
		 /* DoubleSummaryStatistics
		  * Obtenemos varios datos en 1 sola variable de count, sum, avg, max y min∫
		 */
		System.out.println("\nUsando DoubleSummaryStatistics");
		DoubleSummaryStatistics doubleSummaryStatistics = users.stream()
				.collect(Collectors.summarizingDouble(User::getId));
		System.out.println("Average: " + doubleSummaryStatistics.getAverage());
		
		// Otra forma
		DoubleSummaryStatistics doubleSummaryStatistics1 = users.stream()
				.mapToDouble(User::getId)
				.summaryStatistics();
		System.out.println("Sum: " + doubleSummaryStatistics1.getSum());
		
		/*
		 * PartitioningBy
		 * La lista nos la va a partir en 2: 1->Donde se cumple el predicado
		 * 									 2->Donde no se cumple el predicado
		 */
		System.out.println("\nUsando partitioningBy");
		List<Integer> numerosLista = users.stream().map(User::getId).collect(Collectors.toList());
		Map<Boolean, List<Integer>> mapaMayor = numerosLista.stream()
				.collect(Collectors.partitioningBy(numero -> numero >3));
		
		System.out.println("Lista 1, cumple predicado");
		mapaMayor.get(true).stream().forEach(System.out::println);
		
		System.out.println("Lista 2, NO cumple predicado");
		mapaMayor.get(false).stream().forEach(System.out::println);
		
		/* Collectors.groupingBy(
		 * Nos permite agrupar segun queramos
		 * para el ejemplo se usa Character para usar la primera letra del nombre para prdenar
		 */
		Map<Character, List<User>> mapaAgrupadoPorLetras = users.stream()
				.collect(Collectors.groupingBy(usuario -> Character.valueOf(usuario.getNombre().charAt(0))));
		mapaAgrupadoPorLetras.get('J').stream().forEach(usuario -> System.out.println(usuario.getNombre()));
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
