package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1=new Cuadrado();
		double areac1;
		double perimetroc1;
		c1.setLado(5);
		areac1=c1.calcularArea();
		perimetroc1=c1.calcularPerimetro();
		System.out.println("Area de c1: "+areac1);
		System.out.println("Perimetro de c1: "+perimetroc1);
	}

}
