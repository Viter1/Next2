package Arrays_Y_Strings;

import java.util.Arrays;

public class Sueldos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sueldos = new int[5];
		sueldos[0] = 1200;
		sueldos[1] = 750;
		sueldos[2] = 820;
		sueldos[3] = 550;
		sueldos[4] = 490;
		int aux = 0;

		for (int i = 0; i < sueldos.length- 1; i++) {
			if (sueldos[i] > sueldos[i + 1]) {
				aux = sueldos[i];
				sueldos[i] = sueldos[i + 1];
				sueldos[i + 1] = aux;

			}

		}
		System.out.println("El mayor sueldo de todos es: " + sueldos[sueldos.length - 1]);

	}

}
