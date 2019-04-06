package PILDORAS;

public class POO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados emple1 = new Empleados("Paco");
		Empleados emple2 = new Empleados("Pablo");
		Empleados emple3 = new Empleados("Patron");
		Empleados emple4 = new Empleados("JUJUS");

		emple1.CambioSeccions("Ventas");

		System.out.println(emple1.DevuelveDatos());

		System.out.println(emple2.DevuelveDatos());

		System.out.println(emple3.DevuelveDatos());
		
		System.out.println(emple4.DevuelveDatos());
		
		System.out.println(Empleados.dameIdSiguiente());
		
	
	}

}

class Empleados {
	private final String nombre;
	private String seccion;
	private int id;
	private static int idSiguiente = 1;

	public Empleados(String nom) {
		this.nombre = nom;
		this.seccion = "Administracion";
		id = idSiguiente;
		idSiguiente++;

	}

	public String getNombre() {
		return nombre;
	}

	public String getSeccion() {
		return seccion;
	}

	public void CambioSeccions(String seccion) {
		this.seccion = seccion;

	}

	public String DevuelveDatos() {
		return "El nombre es " + nombre + " la seccion es " + seccion + " su identificador es " + id;

	}
	
	public static String dameIdSiguiente () {
		return "El id siguiente es " + idSiguiente ;
	}

}