package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item producto=new Item();
		
		producto.setNombre("Camiseta");
		producto.setProductosActuales(20);
		producto.imprimir();
		System.out.println("---------------------");
		producto.vender(5);
		producto.imprimir();
		System.out.println("---------------------");
		producto.devolver(5);
		producto.imprimir();
		
	}

}
