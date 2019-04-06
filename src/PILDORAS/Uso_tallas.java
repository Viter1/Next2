package PILDORAS;

import java.util.Scanner;

public class Uso_tallas {

	// enum Talla {
	// MINI, MEDIANO, GRANDE, MUY_GRANDE
	// };

	enum Tallas {
		// NO PODEMOS CREAR INSTANCIAS DE TIPO CONTRUCTOR
		MINI("S"), Mediano("M"), GRANDE("L"), MUY_GRANDE("XXL");
		private String abreviatura;

		private Tallas(String abreviatura) {
			this.abreviatura = abreviatura;

		}

		public String DameAbreviatura() {
			return abreviatura;
		}

	}

	public static void main(String[] args) {
		// solo se almacena un tipo de valores
		// Talla s = Talla.MINI;
		// Talla m = Talla.MEDIANO;
		// Talla L = Talla.MEDIANO;
		// Talla xl = Talla.GRANDE;
		// Talla xxl = Talla.MUY_GRANDE;
		Scanner in = new Scanner(System.in);
		System.out.println("¿que talla deseas?: MINI , MEDIANO , GRANDE O MUY GRANDE");
		String entradaDatos = in.nextLine().toUpperCase();
		Tallas la_talla = Enum.valueOf(Tallas.class, entradaDatos);
		System.out.println("La talla es = " + la_talla);
		System.out.println("Abreviatura = " + la_talla.DameAbreviatura());
	}

}
