package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telef = new Telefono("movi", "0983343598", 30, false);
		Contacto c = new Contacto("Daniel", "Hidalgo", telef, 61.00);
		System.out.println(c.getNombre() + " " + c.getApellido() + " " + telef.getOperadora() + " " 
		+ telef.getNumero() + " " + telef.getCodigo() + " " + " " + c.getPeso());
	}
}
