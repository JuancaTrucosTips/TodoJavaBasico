package com.juanca.java.basico._9_15_.stream;

class User {
	private int id;
	private String nombre;
	
	public User(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
