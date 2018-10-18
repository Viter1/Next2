import java.util.Scanner;

public class ParOImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Ingrese un valor: ");
		
		int v = in.nextInt();
		
		int resto = v%2;//Jodidamente importate 
		
/*		if (resto==0) {
			System.out.println(v +" Es par");
			
		} else {
			System.out.println(v +" Es impar");
		}
*/
		
		String siLinea = (resto == 0) ? "Es par" : "Es impar";
		
		System.out.println(v+" "+siLinea);
	}

}
