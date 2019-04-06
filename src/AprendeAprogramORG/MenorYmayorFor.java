package AprendeAprogramORG;

import java.util.Scanner;

public class MenorYmayorFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// vamosss yaa
		Scanner in = new Scanner(System.in);
		int X = in.nextInt();
		int num1;
		int auxMenor = Integer.MIN_VALUE;
		int auxMayor = Integer.MAX_VALUE;
		for (int i = 0; i < X; i++) {
			num1 = in.nextInt();

			if (num1 < auxMayor) {
				auxMayor = num1;
			}

			if (num1 > auxMenor) {
				auxMenor = num1;
			}

		}
		System.out.println(auxMenor + " Es el mayor");
		System.out.println(auxMayor + " Es el menor");

	}
}
