package Alumn;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Alumno {
	private int dni;
	private String nombre;
	private GregorianCalendar fechaNacimiento;

	public Alumno(int parDni, String parNombre, GregorianCalendar parFechaNacimiento) {
		parDni = dni;
		parNombre = nombre;
		parFechaNacimiento = fechaNacimiento;
	}

	public int getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public GregorianCalendar getFechaNacimiento() {
		return fechaNacimiento;
	}
	//

	public void setDni(int parDni) {
		dni = parDni;
	}

	public void setNombre(String parNombre) {
		nombre = parNombre;
	}

	public void setFechaNacimiento(GregorianCalendar parFechaNacimiento) {
		fechaNacimiento = parFechaNacimiento;
	}

	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		String fechaNacFormateada = sdf.format(fechaNacimiento.DATE);

		String alumno = "Dni: " + dni + "\n" + "Nombre: " + nombre + "\n" + "Fecha de nacimiento: " + fechaNacFormateada
				+ "\n";

		return alumno;
	}

}