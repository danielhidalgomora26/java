package com.cmc.evaluacion;

import java.util.ArrayList;

public class CalculadoraAmortizacion {
	private double co;
	private double i;
	private double n;

	public static void generarTabla(Prestamo prestamo) {
		double interesMensual = prestamo.getInteres() / 12;
		double calculoCuota = calcularCuota(prestamo);
		ArrayList<Cuota> cuotas = prestamo.getCuotas();
		for (Cuota cuota : cuotas) {
			cuota.setCuota(calculoCuota);
		}
		cuotas.get(0).setInicio(prestamo.getMonto());

		for (int i = 0; i < cuotas.size(); i++) {
			Cuota actual = cuotas.get(i);
			Cuota siguiente = (i + 1 < cuotas.size()) ? cuotas.get(i + 1) : null;
			calcularValoresCuota(interesMensual, calculoCuota, actual, siguiente);
		}
		Cuota ultima = cuotas.get(cuotas.size() - 1);
		double saldoFinal = ultima.getSaldo();

		if (saldoFinal != 0) {
			double nuevoAbono = ultima.getAbonoCapital() + saldoFinal;
			double nuevaCuota = nuevoAbono + ultima.getInteres();

			ultima.setAbonoCapital(nuevoAbono);
			ultima.setCapital(nuevoAbono);
			ultima.setCuota(nuevaCuota);
			ultima.setSaldo(0);
		}
	}
	
	public static void mostrarTabla(Prestamo prestamo) {
		System.out.println("Número | Cuota   | Inicio  | Interés | Abono   | Saldo");
	    generarTabla(prestamo); 
	    ArrayList<Cuota> cuotas = prestamo.getCuotas();
	    for (int i = 0; i < cuotas.size(); i++) {
	        Cuota cuota = cuotas.get(i);
	        cuota.mostrarPrestamo();
	    }
	}

	
	public static void calcularValoresCuota(double interesMensual, double cuotafija, Cuota cuotaActual, Cuota cuotaSiguiente) {
		double inicio = cuotaActual.getInicio();

		double interes = inicio * interesMensual;
		double abonoCapital = cuotafija - interes;
		double saldoFinal = inicio - abonoCapital;

		cuotaActual.setInteres(interes);
		cuotaActual.setAbonoCapital(abonoCapital);
		cuotaActual.setSaldo(saldoFinal);

		if (cuotaSiguiente != null) {
			cuotaSiguiente.setInicio(saldoFinal);
		}
	}

	public static double calcularCuota(Prestamo prestamo) {
		double co = prestamo.getMonto();
		double i = prestamo.getInteres() / 12;
		double n = prestamo.getPlazo();

		double numerador = co * i;
		double denominador = 1 - Math.pow(1 + i, -n);
		return numerador / denominador;
	}

	public double getCo() {
		return co;
	}

	public void setCo(double co) {
		this.co = co;
	}

	public double getI() {
		return i;
	}

	public void setI(double i) {
		this.i = i;
	}

	public double getN() {
		return n;
	}

	public void setN(double n) {
		this.n = n;
	}

}
