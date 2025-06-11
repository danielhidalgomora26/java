package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		Telefono telef1= new Telefono("movi", "0983343598", 30, false);
		Telefono telef2= new Telefono("movi", "0983673598", 12, true);
		
		Contacto c1= new Contacto("Daniel", "Hidalgo", telef1, 61.00);
		Contacto c2= new Contacto("Nicolas", "Livisaca", telef2, 57.00);
		
		AdminContactos contacto=new AdminContactos();
		
		Contacto masPesado=contacto.buscarMasPesado(c1, c2);
		System.out.println(masPesado.getNombre()+" "+masPesado.getApellido()+" "+masPesado.getPeso()
		+" "+masPesado.getTelefono().getNumero()+" "+masPesado.getTelefono().getOperadora());
		
		boolean operadora=contacto.compararOperadoras(c1, c2);
		System.out.println(operadora);
	}
}
