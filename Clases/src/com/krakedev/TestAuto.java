package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1= new Auto("Kia",2007,1200.500);
		Auto auto2= new Auto("Chevrolet",2005);
		
		auto1.setMarca("Kia");
		auto1.setAnio(2007);
		auto1.setPrecio(1200.500);
		
		auto2.setMarca("Chevrolet");
		auto2.setAnio(2005);
		auto2.setPrecio(1500.100);
		
		System.out.println("marca 1: "+auto1.getMarca());
		System.out.println("anio 1: "+auto1.getAnio());
		System.out.println("precio 1: "+auto1.getAnio());
		
		System.out.println("-------------------");
		
		System.out.println("marca 2: "+auto2.getMarca());
		System.out.println("anio 2: "+auto2.getAnio());
		System.out.println("precio 2: "+auto2.getAnio());
	}

}
