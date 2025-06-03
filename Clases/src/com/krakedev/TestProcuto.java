package com.krakedev;

public class TestProcuto {

	public static void main(String[] args) {
		Producto productoA=new Producto();
		Producto productoB=new Producto();
		Producto productoC=new Producto();
		
		productoA.nombre="aspirina";
		productoA.descripcion="calma el dolor de cabeza";
		productoA.precio=1.50;
		productoA.stockActual=20;
		
		productoB.nombre="paracetamol";
		productoB.descripcion="calma dolores fisicos";
		productoB.precio=2.50;
		productoB.stockActual=15;
		
		productoC.nombre="carbamacepina";
		productoC.descripcion="controla la epilepsia";
		productoC.precio=4.50;
		productoC.stockActual=5;
		
		System.out.println("nombre: "+productoA.nombre);
		System.out.println("descripcion: "+productoA.descripcion);
		System.out.println("precio: "+productoA.precio);
		System.out.println("stockActual: "+productoA.stockActual);
		System.out.println("-----------------------------------");
		System.out.println("nombre: "+productoB.nombre);
		System.out.println("descripcion: "+productoB.descripcion);
		System.out.println("precio: "+productoB.precio);
		System.out.println("stockActual: "+productoB.stockActual);
		System.out.println("-----------------------------------");
		System.out.println("nombre: "+productoC.nombre);
		System.out.println("descripcion: "+productoC.descripcion);
		System.out.println("precio: "+productoC.precio);
		System.out.println("stockActual: "+productoC.stockActual);
	}

}
