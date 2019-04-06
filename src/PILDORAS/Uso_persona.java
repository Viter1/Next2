package PILDORAS;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona lasPersona[] = new Persona[2];
		lasPersona[0] = new Empleado2("Luis Conde", 2000, 2009, 02, 25);
		lasPersona[1] = new Alumno("Ana Lopez", "Biologicas");

		for (Persona p : lasPersona) {
			System.out.println(p.DameNombre()+ " , " + p.DameDescripcion());
		}
		
//		for (int i = 0; i < lasPersona.length; i++) {
//			System.out.println(lasPersona[i].DameDescripcion());
//		}

	}

}

abstract class Persona {
	String nombre;

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public String DameNombre() {
		return nombre;
	}

	public abstract String DameDescripcion();

}

class Empleado2 extends Persona {
	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int idSiguiente = 1;

	public Empleado2(String nom, double sue, int anio, int mes, int dia) {
		super(nom);
		this.sueldo = sue;
		/*
		 * Al llamar al Obejeto GregorianCalendar nos devuelve un dato de tipo date y
		 * con esto lo almacenamos en una variable date
		 * 
		 */
		GregorianCalendar calen = new GregorianCalendar(anio, mes - 1, dia);
		this.altaContrato = calen.getTime();
		id = idSiguiente;
		idSiguiente++;

	}

	public String getNombre() {
		return nombre + " Id " + id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje / 100;
		this.sueldo = sueldo += aumento;
	}

	public Date getAltaContrato() {
		return altaContrato;
	}

	public void setAltaContrato(Date altaContrato) {
		this.altaContrato = altaContrato;
	}

	@Override
	public String DameDescripcion() {

		return "Este empleado tiene un id= " + id + " con un sueldo igual a " + sueldo;
	}

}

class Alumno extends Persona {

	private String carrera;

	public Alumno(String nombre, String carrera) {
		super(nombre);
		this.carrera = carrera;

	}

	@Override
	public String DameDescripcion() {

		return "Este alumno está estudiando la carrera de " + carrera;
	}

}
