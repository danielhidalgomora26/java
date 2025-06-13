package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
		maquina.agregarCelda(new Celda("A1"));
		maquina.agregarCelda(new Celda("A2"));
		maquina.agregarCelda(new Celda("A3"));
		maquina.agregarCelda(new Celda("B1"));
		maquina.agregarCelda(new Celda("B2"));
		maquina.agregarCelda(new Celda("B3"));

		maquina.cargarProducto(new Producto("P1", "Papitas", 0.85), "A1", 5);
		maquina.cargarProducto(new Producto("P2", "Doritos", 0.5), "A2", 4);
		maquina.cargarProducto(new Producto("P3", "Jet", 0.25), "A3", 6);
		maquina.cargarProducto(new Producto("P4", "DeTodito", 0.6), "B1", 3);
		maquina.cargarProducto(new Producto("P5", "Snickers", 1.0), "B2", 2);
		maquina.cargarProducto(new Producto("P6", "Chicles", 1.5), "B3", 8);
		
		ArrayList<Producto> productosMenores = maquina.buscarMenores(0.85);
		
		System.out.println("Productos Menores: " + productosMenores.size());
		for(int i=0;i<productosMenores.size();i++) {
			Producto elementoProducto=productosMenores.get(i);
			System.out.println("Nombre: "+elementoProducto.getNombre()+" Precio: "+elementoProducto.getPrecio());
		}
		
	
	}

}
