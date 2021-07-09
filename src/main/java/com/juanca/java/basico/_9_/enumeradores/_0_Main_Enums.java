package com.juanca.java.basico._9_.enumeradores;

public class _0_Main_Enums {

	public static void main(String[] args) {
		// Nos da el nombre del atributo como cadena
		System.out.println(TiposCuentasBancarias.CUENTA_AHORROS);

		// Dentro de la cadena CUENTA_AHORROS tenemos un atributo llamado valor
		System.out.println(TiposCuentasBancarias.CUENTA_AHORROS.getValor());
		
		// Dentro de la cadena CUENTA_CORRIENTE tenemos el atributo valor y descripcion
		System.out.println(TiposCuentasBancarias.CUENTA_CORRIENTE.getDescripcion());
		
		// Se puede modificar un atributo dentro de la cadena
		TiposCuentasBancarias.TARJETA_CREDITO.setCantidad(200);
		System.out.println(TiposCuentasBancarias.TARJETA_CREDITO.getCantidad());
		
		// Se puede tener atributos publicos del enumerador
		TiposCuentasBancarias.CUENTA_AHORROS.saldo = 150.55;
		System.out.println(TiposCuentasBancarias.TARJETA_CREDITO.saldo);
		
		System.out.println(TiposCuentasBancarias.CUENTA_AHORROS.saldo);
		
	}

}
