import java.util.Scanner;

public class Mayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Ingresa tu edad");
		
		int edad = in.nextInt();
		
		if (edad >= 18) {
			System.out.println("Mayor de 18");
			
		} else {
			System.out.println("En un par de años eres menor");

		}

	}

}
