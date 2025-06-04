package com.krakedev;

public class Calculadora {
	public int sumar(int valor1,int valor2) {
		int resultado;
		resultado=valor1+valor2;
		return resultado;
	}
	public int restar(int valor1,int valor2) {
		int resultado;
		resultado=valor1-valor2;
		return resultado;
	}
	public double multiplicar(double valor1,double valor2) {
		double resultado;
		resultado=valor1*valor2;
		return resultado;
	}
	public double division(double dividendo,double divisor) {
		double resultado;
		resultado=dividendo/divisor;
		return resultado;
	}
	public double promedio(double valor1,double valor2, double valor3) {
		double resultado;
		double resultadoPromediado;
		resultado=valor1+valor2+valor3;
		resultadoPromediado=resultado/3;
		return resultadoPromediado;
	}
	public void mostrarResultado() {
		System.out.println("Ahorita no jove, Sali al almuerzo. Regreso en 15 minutos");
	}
}
