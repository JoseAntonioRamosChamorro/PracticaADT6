package practica;

import java.util.ArrayList;
import java.util.List;

public class Centro {
	private String centroNombre;
	private String centroDireccion;
	private List<Alumno> alumnos;

	public  Centro() {
		centroNombre = "";
		centroDireccion = "";
		alumnos = new ArrayList<Alumno>();
	}

	public Centro(String centroNombre, String centroDireccion, List<Alumno> alumnos) {
		this.centroNombre = centroNombre;
		this.centroDireccion = centroDireccion;
		this.alumnos = alumnos;
	}

	public String getCentroNombre() {
		return centroNombre;
	}

	public void setCentroNombre(String centroNombre) {
		this.centroNombre = centroNombre;
	}

	public String getCentroDireccion() {
		return centroDireccion;
	}

	public void setCentroDireccion(String centroDireccion) {
		this.centroDireccion = centroDireccion;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	public String toString() {
		String devolver = "El centro "+ centroNombre+ " el cual esta "+ centroDireccion
				+ " tiene a los alumnos: "+alumnos;
		return devolver;
	}

}
