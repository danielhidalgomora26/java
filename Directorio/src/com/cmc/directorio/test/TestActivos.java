package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono telef = new Telefono("movi", "0983343598", 30, false);
		Contacto c = new Contacto("Daniel", "Hidalgo", telef, 61.00);
		
		System.out.println(c.isActivo());
		
		AdminContactos contacto=new AdminContactos(); 
		contacto.activarUsuario(c);
		
		System.out.println("-----------------");
		System.out.println(c.isActivo());
		
		
	}
}
