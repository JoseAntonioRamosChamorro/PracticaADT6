package practica;

public class Alumnos {
	private String alumnoNombre;
	private String alummnoDireccion;
	private String asignatura;
	private int nota;
	private int horas;

	public Alumnos() {
		alumnoNombre = "";
		alummnoDireccion ="";
		asignatura ="";
		nota = 0;
		horas = 0;
	}
	public Alumnos(String nombreAlum,String direccionAlum,String asignatura,int nota,int horas) {
		this.alumnoNombre = nombreAlum;
		this.alummnoDireccion = direccionAlum;
		this.asignatura = asignatura;
		this.nota = nota;
		this.horas = horas;
	}
	public String getNombreAlum() {
		return alumnoNombre;
	}
	public void setNombreAlum(String nombreAlum) {
		this.alumnoNombre = nombreAlum;
	}
	public String getDireccionAlum() {
		return alummnoDireccion;
	}
	public void setDireccionAlum(String direccionAlum) {
		this.alummnoDireccion = direccionAlum;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public String toString() {
		return "El alumno "+ alumnoNombre+ " que viene en la dirección "+ alummnoDireccion
				+ " que tiene la asignatura "+asignatura +" con "+horas+ " horas a sacado un "+nota;
	}
}
