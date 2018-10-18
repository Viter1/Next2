package Alumn;

import java.util.GregorianCalendar;

public class TestAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar fechaNacDavid = new GregorianCalendar( 10,10,1993);
		
		Alumno AlumnoDavid = new Alumno(50371, "David", fechaNacDavid);
		
		System.out.println(AlumnoDavid.toString());

	}

}
