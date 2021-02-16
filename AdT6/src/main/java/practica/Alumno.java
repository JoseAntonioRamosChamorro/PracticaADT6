package practica;

public class Alumno {

	private String alumno;
	private String direccion;
	private String asignatura;
	private int nota;
	private int horas;

	public Alumno() {
		alumno="";
		direccion ="";
		asignatura="";
		nota=0;
		horas=0;
	}
	public Alumno(String alumno,String direccion,String asignatura,int nota,int horas) {
		this.alumno =alumno;
		this.direccion=direccion;
		this.asignatura=asignatura;
		this.nota=nota;
		this.horas=horas;
	}
	public String getAlumno() {
		return alumno;
	}
	public void setAlumno(String alumno) {
		this.alumno = alumno;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
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



}


