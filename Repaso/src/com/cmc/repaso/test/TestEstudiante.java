package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante estudiante1=new Estudiante("Daniel");
		Estudiante estudiante2=new Estudiante("Nico");
		estudiante1.calificar(8.50);
		estudiante2.calificar(7.25);
		
	}

}
