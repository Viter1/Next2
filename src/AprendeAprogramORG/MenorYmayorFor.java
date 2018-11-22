package AprendeAprogramORG;

import java.util.Scanner;

public class MenorYmayorFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int X = in.nextInt();
		int num1;
		int auxMenor = 0;
		int auxMayor = 0;
		int aux2 = 0;
		for (int i = 0; i < X; i++) {
			num1 = in.nextInt();
			if (num1 > aux2) {
				auxMayor = num1;
			} else if (auxMayor <= num1 || auxMayor==num1)
				auxMenor = num1;
			{

				aux2 = num1;
			}
		}
			System.out.println(auxMenor + " Es el menor");
			System.out.println(auxMayor + " Es el mayor");
		
	}
}
