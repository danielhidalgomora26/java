package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		Persona p; // 1. Declaro una variable llamada p de tipo persona
		p = new Persona(); // 2. Instanciar un objeto Persona, referenciarlo con p

		Persona p2 = new Persona();

		// 3. Modificar los atributos
		p.setNombre("Mario");
		p.setEdad(45);
		p.setEstatura(1.56);

		// 4. Accedo a los atributos
		System.out.println("nombre: " + p.getNombre());
		System.out.println("edad: " + p.getEdad());
		System.out.println("edad: " + p.getEstatura());

		p2.setNombre("Angelina");

		System.out.println("*********");
		System.out.println("p.nombre: " + p.getNombre());
		System.out.println("p2.nombre: " + p2.getNombre());

	}

}
