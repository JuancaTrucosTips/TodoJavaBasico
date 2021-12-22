package com.juanca.java.basico._4_.interfaces;

import java.util.ArrayList;
import java.util.List;

public class RectanguloImpl implements IFiguraPlana {

	private List<Lado> lados;

	public RectanguloImpl(double tamanioLado1, double tamanioLado2) {

		lados = new ArrayList<Lado>();

		Lado lado1 = new Lado();
		lado1.setTamanio(tamanioLado1);
		lados.add(lado1);
		
		Lado lado2 = new Lado();
		lado2.setTamanio(tamanioLado2);
		lados.add(lado2);
	}

	@Override
	public double obtenerArea() {
		double area = 1;
		for (Lado lado : lados) {
			area *= lado.getTamanio();
		}
		return area;
	}
	
	public double obtenerAreaLambda() {
		return lados.stream().map(Lado::getTamanio).reduce(1.0, (a , b) -> a * b);
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
	public String toString() {
		return "RectanguloImpl [lados=" + lados + "]";
	}

	@Override
	public void obtenerNombre() {
		System.out.println("Rectangulo");
	}

}
