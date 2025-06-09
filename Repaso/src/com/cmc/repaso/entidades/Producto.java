package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private double precio;
	
	public double calcularPrecioPromo(double porcentajeDescuento) {
		precio=precio*(1-porcentajeDescuento/100);
		System.out.println(precio);
		return precio;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	
	
	public void setPrecio(double precio) {
		this.precio = precio;
		if(precio>0) {
			System.out.println("Precio Correcto");
		}else {
			precio=precio*-1;
			System.out.println("Precio Arreglado");
		}
	}
}
