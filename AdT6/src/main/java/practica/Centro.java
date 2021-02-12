package practica;

import java.util.ArrayList;
import java.util.List;

public class Centro {
	private String centroNombre;
	private String centroDireccion;
	private List<Alumnos> alumnos;

	public  Centro() {
		centroNombre = "";
		centroDireccion = "";
		alumnos = new ArrayList<Alumnos>();
	}

	public Centro(String centroNombre, String centroDireccion, List<Alumnos> alumnos) {
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

	public List<Alumnos> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumnos> alumnos) {
		this.alumnos = alumnos;
	}
	public String toString() {
		String devolver = "El centro "+ centroNombre+ " el cual esta "+ centroDireccion
				+ " tiene a los alumnos: "+alumnos;
		return devolver;
	}

}
