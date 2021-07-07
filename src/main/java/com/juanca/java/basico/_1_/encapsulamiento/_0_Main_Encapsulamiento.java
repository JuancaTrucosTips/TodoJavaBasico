package com.juanca.java.basico._1_.encapsulamiento;

public class _0_Main_Encapsulamiento {

	public static void main(String[] args) {
		System.out.println("_1_EncapsulamientoMalo");
		_1_EncapsulamientoMalo encapsularMalo = new _1_EncapsulamientoMalo();
		encapsularMalo.cedulaCliente = -5;
		System.out.println("La cedula del cliente es: " + encapsularMalo.cedulaCliente);
		
		System.out.println();
		
		System.out.println("_2_EncapsulamientoBueno");
		System.out.println("Se valida que la variable cumpla con lo establecido");
		_2_EncapsulamientoBueno encapsulamientoBueno = new _2_EncapsulamientoBueno();
		encapsulamientoBueno.setCedulaCliente(-1);	
		System.out.println("La cedula del cliente es: " + encapsulamientoBueno.getCedulaCliente());

	}

}
