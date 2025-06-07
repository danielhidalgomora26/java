package com.krakedev.test;

import com.krakedev.Producto;

public class TestProcuto {

	public static void main(String[] args) {
		Producto productoA=new Producto("aspirina","calma el dolor de cabeza",1.50,20);
		Producto productoB=new Producto("paracetamol","calma dolores fisicos",2.50,15);
		Producto productoC=new Producto("carbamacepina",4.50,5);
		
		productoA.setNombre("aspirina");
		productoA.setDescripcion("calma el dolor de cabeza");
		productoA.setPrecio(1.50);
		productoA.setStockActual(20);
		
		productoB.setNombre("paracetamol");
		productoB.setDescripcion("calma dolores fisicos");
		productoB.setPrecio(2.50);
		productoB.setStockActual(15);
		
		productoC.setNombre("carbamacepina");
		productoC.setDescripcion("controla la epilepsia");
		productoC.setPrecio(4.50);
		productoC.setStockActual(5);
		
		System.out.println("nombre: "+productoA.getNombre());
		System.out.println("descripcion: "+productoA.getDescripcion());
		System.out.println("precio: "+productoA.getPrecio());
		System.out.println("stockActual: "+productoA.getStockActual());
		System.out.println("-----------------------------------");
		System.out.println("nombre: "+productoB.getNombre());
		System.out.println("descripcion: "+productoB.getDescripcion());
		System.out.println("precio: "+productoB.getPrecio());
		System.out.println("stockActual: "+productoB.getStockActual());
		System.out.println("-----------------------------------");
		System.out.println("nombre: "+productoC.getNombre());
		System.out.println("descripcion: "+productoC.getDescripcion());
		System.out.println("precio: "+productoC.getPrecio());
		System.out.println("stockActual: "+productoC.getStockActual());
	}

}
