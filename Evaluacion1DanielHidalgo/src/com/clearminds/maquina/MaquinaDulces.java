package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;

	
	
	public void agregarCelda(Celda codigo) {
		Celda codigoCelda = codigo;
		celdas.add(codigoCelda);
	}

	public void mostrarConfiguracion() {
		for (int i = 0; i < celdas.size(); i++) {
			Celda elementoCelda = celdas.get(i);
			System.out.println("Celda: " + elementoCelda.getCodigo());
		}
	}

	public Celda buscarCelda(String codigo) {
		Celda elementoCelda = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (codigo.equals(elementoCelda.getCodigo())) {
				return elementoCelda;
			}
		}
		return null;
	}

	public void cargarProducto(Producto producto, String codigo, int itemsIniciales) {
		Celda celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, itemsIniciales);
	}

	public void mostrarProductos() {
		for (int i = 0; i < celdas.size(); i++) {
			Celda elementoCelda = celdas.get(i);
			if (elementoCelda.getProducto() != null) {
				System.out.println("Celda: " + elementoCelda.getCodigo() + " Stock: " + elementoCelda.getStock()
						+ " Producto: " + elementoCelda.getProducto().getNombre() + " Precio: "
						+ elementoCelda.getProducto().getPrecio());
			} else {
				System.out.println("Celda: " + elementoCelda.getCodigo() + " Stock: " + elementoCelda.getStock()
						+ " Sin Producto asignado ");
			}
		}
	}

	public Producto buscarProductoEnCelda(String codigo) {
		Producto productoEncontrado = null;
		for (int i = 0; i < celdas.size(); i++) {
			Celda elementoCelda = celdas.get(i);
			if (codigo.equals(elementoCelda.getCodigo())) {
				productoEncontrado = elementoCelda.getProducto();
				return productoEncontrado;
			}
		}
		return null;
	}

	public double consultarPrecio(String codigo) {
		double precio = 0.0;
		for (int i = 0; i < celdas.size(); i++) {
			Celda elementoCelda = celdas.get(i);
			if (codigo.equals(elementoCelda.getCodigo())) {
				precio = elementoCelda.getProducto().getPrecio();
				return precio;
			}
		}
		return 0.0;
	}

	public Celda buscarCeldaProducto(String codigo) {
		Celda celdaEncontrada = null;
		for (int i = 0; i < celdas.size(); i++) {
			Celda elementoCelda = celdas.get(i);
			Producto producto = elementoCelda.getProducto();
			if (elementoCelda.getProducto() != null && codigo.equals(producto.getCodigo())) {
				celdaEncontrada = elementoCelda;
				return celdaEncontrada;
			}
		}
		return null;
	}
	
	public void incrementarProductos(String codigoProducto, int itemsIncrementados) {
		Celda celdaEncontrada=buscarCeldaProducto(codigoProducto);
		celdaEncontrada.setStock(itemsIncrementados);
	}
	
	public void vender(String codigoCelda) {
		Celda elementoCelda=null;
		for(int i=0;i<celdas.size();i++) {
			elementoCelda=celdas.get(i);
			if(codigoCelda.equals(elementoCelda.getCodigo())) {
				int stock=elementoCelda.getStock();
				elementoCelda.setStock(stock-1);
			}
			if(elementoCelda.getProducto()!=null&& codigoCelda.equals(elementoCelda.getCodigo())) {
				double precioProducto=elementoCelda.getProducto().getPrecio();
				saldo=saldo+precioProducto;
			}
		}
		
	}
	
	public double venderConCambio(String codigoCelda, double valorIngresado) {
		double cambio=0;
		for(int i=0;i<celdas.size();i++) {
			Celda elementoCelda=celdas.get(i);
			if(codigoCelda.equals(elementoCelda.getCodigo())) {
				int stock=elementoCelda.getStock();
				elementoCelda.setStock(stock-1);
			}
			if(elementoCelda.getProducto()!=null&& codigoCelda.equals(elementoCelda.getCodigo())) {
				double precioProducto=elementoCelda.getProducto().getPrecio();
				saldo=saldo+precioProducto;
				cambio=valorIngresado-precioProducto;
				saldo=saldo-cambio;
				return cambio;
			}
		}
		return cambio;
	}
	
	public ArrayList<Producto> buscarMenores(double limite){
		ArrayList<Producto> productosMenores=new ArrayList<Producto>();
		for(int i=0;i<celdas.size();i++) {
			Celda elementoCelda=celdas.get(i);
			Producto producto=elementoCelda.getProducto();
			if(elementoCelda.getProducto()!=null &&producto.getPrecio()<=limite) {
				productosMenores.add(producto);
			}
		}
		return productosMenores;
	}
	
	
	
	public MaquinaDulces() {
		celdas = new ArrayList<>();
	}

	public ArrayList<Celda> getCeldas() {
		return celdas;
	}

	public void setCeldas(ArrayList<Celda> celdas) {
		this.celdas = celdas;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
