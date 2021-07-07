package com.juanca.java.basico._5_.clasesabstractas;

public class _0_Main_clasesabstractas {

	public static void main(String[] args) {
		AFiguraPlana figura = new CuadradoExt(10.3);
		
		// Utilizo el metodo que sobreescribi por voluntad y no por obligacion
		figura.decirNombreDeSuPadre();
		
		// Utilizo el atributo del padre nombre
		figura.setNombre("Cuadrado");
		
		System.out.println(figura.getNombre());
		
		System.out.println(figura.obtenerArea());
		
		/*BigDecimal result = new BigDecimal(1);
		int x = 2;
		double g = 1.0 / x;
		result = result.multiply(new BigDecimal(g));
		String s = result.toString();
		System.out.println(s);*/
	}

}
