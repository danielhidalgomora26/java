package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1=new Producto();
		Producto producto2=new Producto();
		
		producto1.setPrecio(10.50);
		producto2.setPrecio(-8.50);
		
		producto1.calcularPrecioPromo(10.00);
		producto2.calcularPrecioPromo(90.00);
	}

}
