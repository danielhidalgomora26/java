package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion validarMonto=new Validacion();
		validarMonto.validarMonto(10);
		validarMonto.validarMonto(0);
	}

}
