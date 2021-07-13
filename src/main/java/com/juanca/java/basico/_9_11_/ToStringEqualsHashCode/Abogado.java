package com.juanca.java.basico._9_11_.ToStringEqualsHashCode;

public class Abogado {

	private String nombre;
	private int edad;
	private String documento;

	public Abogado (String nombre, int edad, String documento){
		this.nombre = nombre;
		this.edad = edad;
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", documento=" + documento + "]";
	}

	/*
	 * Este metodo lo que genera es un hash o codigo unico para cada objeto
	 * haciendo un cálculo con los datos de sus atributos.
	 * 
	 * Se recomienda siempre implementar junto con equals() para evitar
	 * incosnsistencias con algoritmos de ordenamiento al usar colecciones
	 * como HashMap, HashSet o Hashtable
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((documento == null) ? 0 : documento.hashCode());
		result = prime * result + edad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	/*
	 * Este metodo lo que va haciendo es compararndo desde lo mas sencillo
	 * hasta lo mas interno de los atributos y va descartando
	 */
	@Override
	public boolean equals(Object obj) {

		// si apunta a la misma refencia, entones es el mismo
		if (this == obj)
			return true;

		// Si es nulo o no apunta a nada pues retorna que no es igual
		if (obj == null)
			return false;

		// Si son de diferentes clases, no vale la pena continuar
		if (getClass() != obj.getClass())
			return false;

		// Si llega hasta acá por lo menos ya sabe que es la misma clase
		// y le hace un cast al objeto que recibe
		// esto para comparar ya los atributos con equals de object
		Abogado other = (Abogado) obj;
		if (documento == null) {
			if (other.documento != null)
				return false;
		} else if (!documento.equals(other.documento))
			return false;

		if (edad != other.edad)
			return false;

		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;

		return true;
	}
}