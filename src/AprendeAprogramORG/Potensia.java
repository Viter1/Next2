package AprendeAprogramORG;

import java.util.Scanner;

public class Potensia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		double base = in.nextDouble();
		int exp = in.nextInt();
		double myFloat = base;
		

		for (int i = 1; i < exp; i++) {
			myFloat *= base;

		}
		System.out.printf("%.02f", myFloat);

	}

}
