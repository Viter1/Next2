import java.util.HashSet;
import java.util.Set;

public class TareaAcpetaElReto_listas {
	static java.util.Scanner in;

	public static boolean casoDePrueba() {
		int n;
		n = in.nextInt();
		if (n == 0) {
			return false;
		}
		//
		if (n!=0) {
			 Set set=new HashSet();
			 set.add((in.nextInt()));
		   
		} else {
			System.out.println("IMPAR");
		}
		return true;
	}

	public static void main(String args[]) {
		in = new java.util.Scanner(System.in);
		while (casoDePrueba())
			;
	}

}
