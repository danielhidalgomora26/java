package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono telf1=new Telefono("movi","097834256",40,false);
		Telefono telf2=new Telefono("claro","046234289",10,false);
		Telefono telf3=new Telefono("movi","099223234",80,false);
		Telefono telf4=new Telefono("claro","095623234",80,false);
		
		AdminTelefono at=new AdminTelefono();
		int claro=at.contarClaro(telf1, telf2, telf3, telf4);
		System.out.println(claro);
	}

}
