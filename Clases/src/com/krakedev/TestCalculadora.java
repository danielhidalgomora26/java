package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		calcu=new Calculadora();
		
		int resultadoSuma;
		int resultadoResta;
		double resultadoMultiplicacion;
	
		resultadoSuma=calcu.sumar(5,3);
		resultadoResta=calcu.restar(10,3);
		resultadoMultiplicacion=calcu.multiplicar(3, 5);
		
		System.out.println("RESULTADO SUMA: "+resultadoResta);
		System.out.println("RESULTADO RESTA: "+resultadoSuma);
		System.out.println("RESULTADO MULTIPLICACION: "+resultadoMultiplicacion);
	}

}
