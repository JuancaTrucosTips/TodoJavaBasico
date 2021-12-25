package com.juanca.java.basico._3_.polimorfismo;
/*
 * Para aplicar el concepto de polimorfismo debe existir herencia
 * En este caso un metodo que recibe un objeto de la clase padre puede
 * funcionar con las hijas
 */
public class _1_Main_Polimorfismo_Metodo {
	
	public static void main(String... args) {
		Persona persona = new Persona("JuanCa", 31);
		imprimir(persona);
		
		Persona persona1 = new Persona();
		persona1.edad = 16;
		imprimir(persona1);
		
		Programador programador = new Programador();
		programador.edad = 19;
		programador.nombre = "Estela";
		programador.setEspecialidad("Backend developer");
		imprimir(programador);
		
		Medico medico = new Medico();
		medico.nombre = "Pacho";
		medico.edad = 25;
		medico.setEspecialidad("Otorrino");
		imprimir(medico);
		
		
		Persona medico2 = new Medico("Petronila", 25, "Médico General");
		imprimir(medico2);
		
		Medico medico3 = (Medico) medico2;
		imprimir(medico3);
		
	}
	
	/*
	 * Este metodo se crea con la clase mas generica o Padre
	 * Y puede recibir como referencia objetos tanto de ella misma como de las 
	 * clases hijas
	 */
	public static void imprimir(Persona persona){
		System.out.println(persona);
	}

}
