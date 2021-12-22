package com.juanca.java.basico._4_.interfaces;

import java.util.ArrayList;
import java.util.List;

public class CuadradoImpl implements IFiguraPlana {

	private List<Lado> lados;

	public CuadradoImpl(double tamanio) {
		Lado lado = new Lado();
		lado.setTamanio(tamanio);

		lados = new ArrayList<Lado>();
		lados.add(lado);
	}

	@Override
	public double obtenerArea() {
		double area = 0;
		for (Lado lado : lados) {
			area = lado.getTamanio() * lado.getTamanio(); 
		}
		return area;
	}

	@Override
	public double obtenerPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Lado> getLados() {
		return lados;
	}

	public void setLados(List<Lado> lados) {
		this.lados = lados;
	}

	@Override
	public double obtenerAreaLambda() {
		// Se puede hacer de cualquiera de las 2 formas
		//return lados.stream().map(Lado::gettamanio).reduce(1.0, (a , b) -> b * b );
		return lados.stream().map(Lado::getTamanio).reduce(1.0, (a , b) -> Math.pow(b, 2.0) );		
	}

	@Override
	public void obtenerNombre() {
		System.out.println("Cuadrado");
	}

}
