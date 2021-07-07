package com.juanca.java.basico._1_.encapsulamiento;

public class _2_EncapsulamientoBueno {

	private int cedulaCliente;

	public int getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(int cedulaCliente) {
		if( cedulaCliente < 0 )
			System.out.println("ha ingresado un numero negativo a una cedula");
		else 
			this.cedulaCliente = cedulaCliente;
	}
}
