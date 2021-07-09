package com.juanca.java.basico._9_.enumeradores;

public enum TiposCuentasBancarias {
	TARJETA_CREDITO("T", "Tarjeta de Crédito", 100),
	CUENTA_AHORROS("A", "Cuenta de Ahorros"),
	CUENTA_CORRIENTE("C")
	;

	private final String valor;
	private final String descripcion;
	private int cantidad;
	public double saldo;
	
	private TiposCuentasBancarias(String valor) {
		this.valor = valor;
		this.descripcion = "";
	}
	
	private TiposCuentasBancarias(String valor, String descripcion) {
		this.valor = valor;
		this.descripcion = descripcion;
	}
	
	private TiposCuentasBancarias(String valor, String descripcion, int cantidad) {
		this.valor = valor;
		this.descripcion = descripcion;
	}

	public String getValor() {
		return valor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
