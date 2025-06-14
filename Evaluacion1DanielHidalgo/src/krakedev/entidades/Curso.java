package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes = new ArrayList<>();

	public String buscarEstudiantePorCedula(Estudiante estudiante) {
		for (int i = 0; i < estudiantes.size(); i++) {
			Estudiante elementoEstudiante = estudiantes.get(i);
			if (elementoEstudiante.getCedula().equals(estudiante.getCedula())) {
				System.out.println("El estudiante esta dentro del curso");
			}
		}
		return null;
	}

	public void matricularEstudiantes(Estudiante estudiante) {
		String estudianteEncontrado = buscarEstudiantePorCedula(estudiante);
		if (estudianteEncontrado == null) {
			estudiantes.add(estudiante);
		} else {
			System.out.println("El estudiante se encuentra dentro del curso");
		}
	}

	public double calcularPromedioCurso() {
		double totalPromedio = 0;
		double promedioEstudiantes;
		for (int i = 0; i < estudiantes.size(); i++) {
			Estudiante elementoEstudiante = estudiantes.get(i);
			promedioEstudiantes = elementoEstudiante.calcularPromedioNotasEstudiante();
			totalPromedio += promedioEstudiantes;
		}
		double totalPromedioEstudiantes = totalPromedio / estudiantes.size();
		return totalPromedioEstudiantes;
	}

	public void mostrar() {
		for (int i = 0; i < estudiantes.size(); i++) {
			Estudiante estudiante = estudiantes.get(i);
			System.out.println("Estudiante [Nombre= " + estudiante.getNombre() + ", Apellido= "
					+ estudiante.getApellido() + ", Cedula= " + estudiante.getCedula() + "]");
		}

	}

	public ArrayList<Estudiante> getEstudiante() {
		return estudiantes;
	}

	public void setEstudiante(ArrayList<Estudiante> estudiante) {
		this.estudiantes = estudiante;
	}
}
