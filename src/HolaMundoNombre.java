import java.util.Scanner;

public class HolaMundoNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);

	System.out.println("Ingrese nombre, edad y altura");

			String nom = in.nextLine();
			int edad = in.nextInt();
			double altura = in.nextDouble();
			
			System.out.println("Nombre: " + nom);
			System.out.println("Edad: "+edad );
			System.out.println("Altura: "+altura);
							  

	}

}
