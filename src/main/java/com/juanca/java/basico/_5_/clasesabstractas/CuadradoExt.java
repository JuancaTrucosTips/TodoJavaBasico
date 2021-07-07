package com.juanca.java.basico._5_.clasesabstractas;

import java.util.ArrayList;
import java.util.List;

public class CuadradoExt extends AFiguraPlana{

	private List<Side> sides;

	public CuadradoExt() {
		// TODO Auto-generated constructor stub
	}

	public CuadradoExt (double size){
		sides = new ArrayList<Side>();
		Side side = new Side();
		side.setSize(size);

		sides.add(side);
	}

	@Override
	public double obtenerArea() {
		return sides.stream().map(Side::getSize).reduce(1.0, (a , b) -> Math.pow(b, 2.0));
	}

	@Override
	public double obtenerPerimetro() {
		// TODO Auto-generated method stub
		return 0.0;
	}

	/* Funcion que se sobreescribe solo por que queremos*/
	// Hace parte del padre por que se hereda pero esta no es obligatoria
	@Override
	public void decirNombreDeSuPadre() {
		super.decirNombreDeSuPadre();
		System.out.println("Luego Sobre escribe el metodo en el hijo");
	}

}
