package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public void configurarMaquina(String c1, String c2, String c3, String c4) {
		celda1 = new Celda(c1);
		celda2 = new Celda(c2);
		celda3 = new Celda(c3);
		celda4 = new Celda(c4);
	}

	public void mostrarConfiguracion() {
		System.out.println(celda1.getCodigo());
		System.out.println(celda2.getCodigo());
		System.out.println(celda3.getCodigo());
		System.out.println(celda4.getCodigo());
	}

	public Celda buscarCelda(String codigo) {
		
		if (codigo.equals(celda1.getCodigo())) {
			return celda1;
		}
		if (codigo.equals(celda2.getCodigo())) {
			return celda2;
		}
		if (codigo.equals(celda3.getCodigo())) {
			return celda3;
		}
		if (codigo.equals(celda4.getCodigo())) {
			return celda4;
		} 
			return null;
		
	}

	public void cargarProducto(Producto producto, String codigo, int stockInicial) {
		Celda celdaRecuperada = buscarCelda(codigo);
		if(celdaRecuperada!=null) {
			celdaRecuperada.ingresarProducto(producto, stockInicial);
		}else {
			System.out.println("No se encontro la celda: ");
		}
	}

	public void mostrarProductos() {
		System.out.println("Celda 1: " + celda1.getCodigo());
		System.out.println("---------------------");
		System.out.println("Stock: " + celda1.getStock());
		if(celda1.getProducto()!=null) {
			System.out.println("Nombre: " + celda1.getProducto().getNombre());
			System.out.println("Precio: " + celda1.getProducto().getPrecio());
		}else {
			System.out.println("La celda no tiene producto!!!");
		}
		System.out.println("Celda 2: " + celda2.getCodigo());
		System.out.println("---------------------");
		System.out.println("Stock: " + celda2.getStock());
		System.out.println("***********************************");
		if(celda2.getProducto()!=null) {
			System.out.println("Nombre: " + celda2.getProducto().getNombre());
			System.out.println("Precio: " + celda2.getProducto().getPrecio());
		}else {
			System.out.println("La celda no tiene producto!!!");
		}
		System.out.println("***********************************");
		System.out.println("Celda 3: " + celda3.getCodigo());
		System.out.println("---------------------");
		System.out.println("Stock: " + celda3.getStock());
		if(celda3.getProducto()!=null) {
			System.out.println("Nombre: " + celda3.getProducto().getNombre());
			System.out.println("Precio: " + celda3.getProducto().getPrecio());
		}else {
			System.out.println("La celda no tiene producto!!!");
		}
		System.out.println("***********************************");
		System.out.println("Celda 4: " + celda4.getCodigo());
		System.out.println("---------------------");
		System.out.println("Stock: " + celda4.getStock());
		if(celda4.getProducto()!=null) {
			System.out.println("Nombre: " + celda4.getProducto().getNombre());
			System.out.println("Precio: " + celda4.getProducto().getPrecio());
		}else {
			System.out.println("La celda no tiene producto!!!");
		}
		System.out.println("***********************************");
	}

	public Producto buscarProductoEnCelda(String codigo) {
		if (codigo == celda1.getCodigo()) {
			Producto producto1 = celda1.getProducto();
			return producto1;
		}
		if (codigo == celda2.getCodigo()) {
			Producto producto2 = celda2.getProducto();
			return producto2;
		}
		if (codigo == celda3.getCodigo()) {
			Producto producto3 = celda3.getProducto();
			return producto3;
		}
		if (codigo == celda4.getCodigo()) {
			Producto producto4 = celda4.getProducto();
			return producto4;
		} else {
			return null;
		}
	}

	public double consultarPrecio(String codigo) {
		if (codigo == celda1.getCodigo()) {
			double precio1 = celda1.getProducto().getPrecio();
			return precio1;
		}
		if (codigo == celda2.getCodigo()) {
			double precio2 = celda2.getProducto().getPrecio();
			return precio2;
		}
		if (codigo == celda3.getCodigo()) {
			double precio3 = celda3.getProducto().getPrecio();
			return precio3;
		}
		if (codigo == celda4.getCodigo()) {
			double precio4 = celda4.getProducto().getPrecio();
			return precio4;
		} else {
			return 0.00;
		}
	}

	public Celda buscarCeldaProducto(String codigo) {
		if (celda1.getProducto()!=null&&codigo.equals(celda1.getProducto().getCodigo())) {
			return celda1;
		}
		if (celda2.getProducto()!=null&&codigo.equals(celda2.getProducto().getCodigo())) {
			return celda2;
		}
		if (celda3.getProducto()!=null&&codigo.equals(celda3.getProducto().getCodigo())) {
			return celda3;
		}
		if (celda4.getProducto()!=null&&codigo.equals(celda4.getProducto().getCodigo())) {
			return celda4;
		} 
			return null;
	}

	public void incrementarProductos(String codigo, int itemsIncrementar) {
		Celda celdaEncontrada = buscarCeldaProducto(codigo);
		celdaEncontrada.setStock(itemsIncrementar);
	}

	public void vender(String codigo) {
		if (codigo == celda1.getCodigo()) {
			int stock1 = celda1.getStock();
			celda1.setStock(stock1 - 1);

			double precio1 = celda1.getProducto().getPrecio();
			saldo = precio1 + saldo;
		}
		if (codigo == celda2.getCodigo()) {
			int stock2 = celda2.getStock();
			celda1.setStock(stock2 - 1);

			double precio2 = celda2.getProducto().getPrecio();
			saldo = precio2 + saldo;
		}
		if (codigo == celda3.getCodigo()) {
			int stock3 = celda3.getStock();
			celda1.setStock(stock3 - 1);

			double precio3 = celda3.getProducto().getPrecio();
			saldo = precio3 + saldo;
		}
		if (codigo == celda4.getCodigo()) {
			int stock4 = celda4.getStock();
			celda1.setStock(stock4 - 1);

			double precio4 = celda4.getProducto().getPrecio();
			saldo = precio4 + saldo;
		}
		mostrarProductos();
	}
	
	public double venderConCambio(String codigo, double valorIngresado) {
		if (codigo == celda1.getCodigo()) {
			int stock1 = celda1.getStock();
			celda1.setStock(stock1-1);
			
			double precio1 = celda1.getProducto().getPrecio();
			saldo = precio1 + saldo;
			
			double devolver1=valorIngresado-precio1;
			saldo = saldo-devolver1;
			return devolver1;
		}
		if (codigo == celda2.getCodigo()) {
			int stock2 = celda2.getStock();
			celda1.setStock(stock2 - 1);

			double precio2 = celda2.getProducto().getPrecio();
			saldo = precio2 + saldo;
			
			double devolver2=valorIngresado-precio2;
			saldo = saldo-devolver2;
			return devolver2;
		}
		if (codigo == celda3.getCodigo()) {
			int stock3 = celda3.getStock();
			celda1.setStock(stock3 - 1);

			double precio3 = celda3.getProducto().getPrecio();
			saldo = precio3 + saldo;
			
			double devolver3=valorIngresado-precio3;
			saldo = saldo-devolver3;
			return devolver3;
		}
		if (codigo == celda4.getCodigo()) {
			int stock4 = celda4.getStock();
			celda1.setStock(stock4 - 1);

			double precio4 = celda4.getProducto().getPrecio();
			saldo = precio4 + saldo;
			
			double devolver4=valorIngresado-precio4;
			saldo = saldo-devolver4;
			return devolver4;
		}
			return 0.0;
		
		
	}

	

	public Celda getCelda1() {

		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
