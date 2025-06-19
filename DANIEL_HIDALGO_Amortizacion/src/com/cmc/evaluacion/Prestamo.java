package com.cmc.evaluacion;

import java.util.ArrayList;

public class Prestamo {
	private double monto;
	private double interes;
	private int plazo;
	private ArrayList<Cuota> cuotas=new ArrayList<>();;
	private String cedulaCliente;
	
	public void mostrarPrestamo() {
	    System.out.println("[monto=" + monto + ", interes=" + interes + ", plazo=" + plazo + "]");
	}
	
	public Prestamo(double monto, double interes, int plazo) {
		this.monto = monto;
		this.interes = interes;
		this.plazo = plazo;
		this.cuotas=new ArrayList<>();
		for(int i=0;i<plazo;i++) {
			cuotas.add(new Cuota(1+i));
			
		}
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public double getInteres() {
		return interes/100;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public int getPlazo() {
		return plazo;
	}
	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}
	public ArrayList<Cuota> getCuotas() {
		return cuotas;
	}
	public String getCedulaCliente() {
	    return cedulaCliente;
	}
	public void setCedulaCliente(String cedulaCliente) {
	    this.cedulaCliente = cedulaCliente;
	}
	
}
