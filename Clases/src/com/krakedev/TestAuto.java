package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1= new Auto();
		Auto auto2= new Auto();
		
		
		auto1.marca="Kia";
		auto1.anio=2007;
		auto1.precio=1200.500;
		
		auto2.marca="Chevrolet";
		auto2.anio=2005;
		auto2.precio=1500.100;
		
		System.out.println("marca 1: "+auto1.marca);
		System.out.println("anio 1: "+auto1.anio);
		System.out.println("precio 1: "+auto1.precio);
		System.out.println("-------------------");
		System.out.println("marca 2: "+auto2.marca);
		System.out.println("anio 2: "+auto2.anio);
		System.out.println("precio 2: "+auto2.precio);
	}

}
