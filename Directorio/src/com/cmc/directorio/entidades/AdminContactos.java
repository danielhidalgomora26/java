package com.cmc.directorio.entidades;

public class AdminContactos {
	public Contacto buscarMasPesado(Contacto c1,Contacto c2) {
		if(c1.getPeso()>c2.getPeso()) {
			return c1;
		}
		if(c2.getPeso()>c1.getPeso()) {
			return c2;
		}else {
			return null;
		}
	}
	
	public boolean compararOperadoras(Contacto c1,Contacto c2) {
		if(c1.getTelefono().getOperadora()=="movi"&&c2.getTelefono().getOperadora()=="movi") {
			return true;
		}
		if(c1.getTelefono().getOperadora()=="claro"&&c2.getTelefono().getOperadora()=="claro") {
			return true;
		}else {
			return false;
		}
	}
	
	public void activarUsuario(Contacto c) {
		if(c.getTelefono().isTieneWhatsapp()==true) {
			c.setActivo(true);
		}
	}
}
