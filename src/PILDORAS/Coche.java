package PILDORAS;

public class Coche {
	private int ruedas, largo, ancho, motor, peso_plataforma, peso_total;
	private String color;
	private boolean asientos_cuero, climatizador;

	public Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;

	}

	public String dime_datos_generales() {
		return "la plataforma del vehiculo tiene " + ruedas + " ruedas Mide " + largo / 1000
				+ " metros de largo con un ancho de " + ancho + " cm y un peso de plataforma de " + peso_plataforma + " kg";

	}

	public void establece_color(String color_coche) {
		color = color_coche;
	}

	public String dime_color() {
		return "El color es " + color;

	}

	public void configura_asientos(String asientos_cuero) {
		if (asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero = true;
		} else {
			this.asientos_cuero = false;
		}
	}
	
	public void configura_climatizador(String climatizador) {
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		} else {
			this.climatizador= false;
		}
	}

	public String dime_asientos() {
		if (asientos_cuero == true) {
			return "El coche tiene asientos de cuero";
		} else {
			return "El coche no tiene asientos de cuero";
		}
	}

	public String dime_climatizador() {
		if (climatizador == true) {
			return "El coche tiene climatizador";
		} else {
			return "El coche no tiene climatizador";
		}
	}

	public String dime_peso_coche() {// setter & getter juntos *OJO* esto no se debe hacer
		int peso_carroceria = 500;
		peso_total = peso_carroceria + peso_plataforma;
		if (asientos_cuero) {
			peso_total += 50;
		}
		if (climatizador) {
			peso_total += 20;
		}
		return "El peso total es " + peso_total;

	}

}
