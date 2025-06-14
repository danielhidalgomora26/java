package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> nota = new ArrayList<>();

	public void agregarNota(Nota nuevaNota) {
		boolean errores = false;
		for (int i = 0; i < nota.size(); i++) {
			Nota elementoNota = nota.get(i);
			if (elementoNota.getMateria().equals(nuevaNota.getMateria())) {
				System.out.println("Nota repetida");
				errores = true;
			}
		}
		if (nuevaNota.getCalificacion() >= 0 && nuevaNota.getCalificacion() <= 10 && errores == false) {
			nota.add(nuevaNota);
		} else {
			System.out.println("Calificacion Invalida");
		}
	}

	public Estudiante(String nombre, String apellido, String cedula) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
	}

	public void modificarNota(String codigo, double nuevaNota) {
		boolean errores = true;
		for (int i = 0; i < nota.size(); i++) {
			Nota elementoNota = nota.get(i);
			if (elementoNota.getMateria().getCodigo().equals(codigo) && nuevaNota >= 0 && nuevaNota <= 10) {
				elementoNota.setCalificacion(nuevaNota);
				errores = false;
			}
		}
		if (errores == true) {
			System.out.println("Materia no encontrada");
		}
	}

	public double calcularPromedioNotasEstudiante() {
		double notaPromedio = 0;
		Nota elementoNota = null;
		double notaSuma = 0;
		for (int i = 0; i < nota.size(); i++) {
			elementoNota = nota.get(i);
			double notaNota = elementoNota.getCalificacion();
			notaSuma += notaNota;
		}
		notaPromedio = notaSuma / nota.size();
		return notaPromedio;
	}

	public void mostrar() {
		System.out.println("Estudiante [Nombre= " + nombre + ", Apellido= " + apellido + ", Cedula= " + cedula + "]");
		System.out.println("Notas:");
		
		for (int i = 0; i < nota.size(); i++) {
			Nota elementoNota = nota.get(i);
			System.out.println(
					"Materia: " + elementoNota.getMateria() + ", Calificacion: " + elementoNota.getCalificacion());
		}
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNota() {
		return nota;
	}

	public void setNota(ArrayList<Nota> nota) {
		this.nota = nota;
	}

}
