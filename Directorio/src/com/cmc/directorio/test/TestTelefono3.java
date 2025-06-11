package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono telf1=new Telefono("movi","098234256",40,false);
		Telefono telf2=new Telefono("claro","098234289",10,false);
		Telefono telf3=new Telefono("movi","098223234",80,false);
		
		AdminTelefono at=new AdminTelefono();
		int movi=at.contarMovi(telf1, telf2, telf3);
		System.out.println(movi);
	}

}
