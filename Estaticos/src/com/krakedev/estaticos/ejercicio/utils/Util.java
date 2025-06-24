package com.krakedev.estaticos.ejercicio.utils;

public class Util {
	public static String formatearHora(int entero) {
		String string=entero+"";
		if(string.length()==2) {
			return string;
		}else {
			return "0"+string;
		}
	}
	public static String formatearDia(int entero) {
		if(entero==0) {
			return "Lunes";
		}else if(entero==1) {
			return "Martes";
		}else if(entero==2) {
			return "Miercoles";
		}else if(entero==3) {
			return "Jueves";
		}else if(entero==4) {
			return "Viernes";
		}else if(entero==5) {
			return "Sabado";
		}else if(entero==6) {
			return "Domingo";
		}else {
			return "numero no valido :c";
		}
		
	}
}
