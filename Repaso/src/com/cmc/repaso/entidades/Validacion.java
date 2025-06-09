package com.cmc.repaso.entidades;

public class Validacion {
	public boolean validarMonto(double monto) {
		if(monto>0) {
			System.out.println("Es Correcto");
			return true;
		}else {
			System.out.println("Es Incorrecto");
			return false;
		}
	}
}
