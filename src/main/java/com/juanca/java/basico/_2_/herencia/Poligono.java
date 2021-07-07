package com.juanca.java.basico._2_.herencia;

import java.util.ArrayList;
import java.util.List;

public class Poligono {

	private List<LadoPoligono> ladosPoligono;

	public Poligono(List<LadoPoligono> lados) {
		this.ladosPoligono = new ArrayList<LadoPoligono>();
		this.ladosPoligono.addAll(lados);
	}

	public double perimetro() {
		double valorPerimetro = 0.0;
		for (LadoPoligono ladoPoligono : ladosPoligono) {
			valorPerimetro += ladoPoligono.getTamanio();
		}
		return valorPerimetro;
	}
	
	public double perimetroMejorado() {
		double valorPerimetro = ladosPoligono.stream().map(LadoPoligono::getTamanio).reduce(0.0, (a , b) -> a + b );
		return valorPerimetro;
	}
	
	public double perimetroMejorado2() {
		return ladosPoligono.stream().mapToDouble(lado -> lado.getTamanio()).sum();
	}

}
