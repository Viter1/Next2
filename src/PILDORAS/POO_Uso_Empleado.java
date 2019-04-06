package PILDORAS;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;

public class POO_Uso_Empleado {

	public static void main(String[] args) {

		// Empleado emple1 = new Empleado("Paco", 85000, 1945, 7, 27);
		// Empleado emple2 = new Empleado("Ana", 95000, 1995, 6, 2);
		// Empleado emple3 = new Empleado("PATRON", 99999, 1993, 13, 12);
		//
		// emple3.setSueldo(5);
		// emple2.setSueldo(5);
		// emple1.setSueldo(5);
		//
		// System.out.println("NOMBRE: " + emple1.getNombre() + " SUELDO: " +
		// emple1.getSueldo() + " FECHA ALTA: "
		// + emple1.getAltaContrato());
		//
		// System.out.println("NOMBRE: " + emple2.getNombre() + " SUELDO: " +
		// emple2.getSueldo() + " FECHA ALTA: "
		// + emple2.getAltaContrato());
		//
		// System.out.println("NOMBRE: " + emple3.getNombre() + " SUELDO: " +
		// emple3.getSueldo() + " FECHA ALTA: "
		// + emple3.getAltaContrato());

		Jefatura jefe_RRHH = new Jefatura("Patrón", 99999, 1993, 06, 27);
		jefe_RRHH.establece_Incentovo(2570);

		Empleado[] MisEmpleados = new Empleado[6];

		MisEmpleados[0] = new Empleado("Paco", 8500, 1990, 12, 17);

		MisEmpleados[1] = new Empleado("Ana", 9500, 1993, 3, 8);

		MisEmpleados[2] = new Empleado("La quika", 99999, 1993, 13, 12);

		MisEmpleados[3] = new Empleado("Antonio Fernandez");

		MisEmpleados[4] = jefe_RRHH;// Polimorfismo de sustitución

		MisEmpleados[5] = new Jefatura("Ana", 1000, 1999, 5, 26);

		Jefatura jefa_finanzas = (Jefatura) MisEmpleados[5];

		jefa_finanzas.establece_Incentovo(5050);

		// for (int i = 0; i < MisEmpleados.length; i++) {
		// MisEmpleados[i].setSueldo(5);
		// }

		for (Empleado empleado : MisEmpleados) {
			empleado.setSueldo(5);

		}

		// for (int i = 0; i < MisEmpleados.length; i++) {
		// System.out.println("NOMBRE: " + MisEmpleados[i].getNombre() + " SUELDO: " +
		// MisEmpleados[i].getSueldo() +" FECHA ALTA: "
		// + MisEmpleados[i].getAltaContrato());
		// }
		Arrays.sort(MisEmpleados);

		for (Empleado empleado : MisEmpleados) {
			System.out.println("Nombre: " + empleado.getNombre() + " sueldo: " + empleado.getSueldo()
					+ " fecha de alta: " + empleado.getAltaContrato());
		}

	}
}

class Empleado implements Comparable {
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int idSiguiente = 1;

	public Empleado(String nom, double sue, int anio, int mes, int dia) {
		this.nombre = nom;
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

	public Empleado(String nom) {
		this(nom, 3000, 2000, 01, 01);

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
	public int compareTo(Object miObjeto) {
		Empleado otroEmpleado = (Empleado) miObjeto;
		if (this.sueldo < otroEmpleado.sueldo) {
			return -1;
		}

		if (this.sueldo > otroEmpleado.sueldo) {
			return 1;
		}

		return 0;
	}

}

class Jefatura extends Empleado {
	private double incentivo;

	public Jefatura(String nom, double sue, int anio, int mes, int dia) {
		super(nom, sue, anio, mes, dia);

	}

	public void establece_Incentovo(double b) {
		this.incentivo = b;
	}

	public double getSueldo() {
		double sueldoJefe = super.getSueldo();
		return incentivo + sueldoJefe;
	}

}
