package com.krakedev.evaluacion;

import java.util.ArrayList;



public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos = new ArrayList<Telefono>();
	

	public void agregarTelefono(Telefono telefono) {
		if (telefono != null) {
			telefonos.add(telefono);
		}
	}

	public void mostrarTelefonos() {
		for (int i = 0; i < telefonos.size(); i++) {
			Telefono telefono = telefonos.get(i);
			if (telefono != null && telefono.getEstado().equals("C")) {
				System.out.println("Telefonos con estado 'C':");
				System.out.println("Numero: " + telefono.getNumero() + ", Tipo: " + telefono.getTipo());
			} else {
				System.out.println("no valido");
			}
		}
	}

	public ArrayList<Telefono> recuperarIncorrectos() {
		ArrayList<Telefono> error = new ArrayList<>();
		for (int i = 0; i < telefonos.size(); i++) {
			Telefono elementoTelefono = telefonos.get(i);
			if ("E".equals(elementoTelefono.getEstado())) {
				error.add(elementoTelefono);
			}
		}
		return error;
	}

	public void imprimir() {
		System.out.println("Informacion del Contacto:");
		System.out.println("Cedula: " + cedula);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Direccion: ");
		if (direccion != null) {
			System.out.println("  Calle Principal: " + direccion.getCallePrincipal());
			System.out.println("  Calle Secundaria: " + direccion.getCalleSecundaria());
		} else {
			System.out.println("No tiene asociada una direccion");
		}

		System.out.println("                          ");
		System.out.println("Informacion del Contacto (actualizada):");
		System.out.println("Cedula: " + cedula);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Direccion: ");
		if (direccion != null) {
			System.out.println("  Calle Principal: " + direccion.getCallePrincipal());
			System.out.println("  Calle Secundaria: " + direccion.getCalleSecundaria());
		} else {
			System.out.println("No tiene asociada una direccion");
		}

	}

	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

}
