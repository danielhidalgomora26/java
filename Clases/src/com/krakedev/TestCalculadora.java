package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		calcu=new Calculadora();
		
		int resultadoSuma;
		int resultadoResta;
		double resultadoMultiplicacion;
		double resultadoDivision;
		double resultadoPromedio;
		
		resultadoSuma=calcu.sumar(5,3);
		resultadoResta=calcu.restar(10,3);
		resultadoMultiplicacion=calcu.multiplicar(3, 5);
		resultadoDivision=calcu.division(10, 2);
		resultadoPromedio=calcu.promedio(10, 2,8);
		
		calcu.mostrarResultado();
		System.out.println("RESULTADO SUMA: "+resultadoResta);
		System.out.println("RESULTADO RESTA: "+resultadoSuma);
		System.out.println("RESULTADO MULTIPLICACION: "+resultadoMultiplicacion);
		System.out.println("RESULTADO DIVICION: "+resultadoDivision);
		System.out.println("RESULTADO PROMEDIO: "+resultadoPromedio);
		
	}

}
