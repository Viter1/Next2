package Arrays_Y_Strings;

import java.util.Arrays;

public class EjClase1 {
	public static String inReverse(int[] values) {
		String message = "";
		int aux[] = new int[values.length];

		for (int i = 0; i < values.length; i++) {
			aux[i] = values[values.length - 1 - i];

		}
		String valores = Arrays.toString(aux);
		message = valores;
		return message;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int values[] = { 1, 2, 3, 4, 5, };
		System.out.println(Arrays.toString(values));

		System.out.println(inReverse(values));

	}

}
