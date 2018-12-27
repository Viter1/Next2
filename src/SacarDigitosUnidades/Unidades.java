package SacarDigitosUnidades;

public class Unidades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 365;
		int sum = 0;
		while (n > 0) {
			int digito = n % 10;
			sum = sum + digito;
			n = n / 10;

		}
		System.out.println(sum);
	}

}
