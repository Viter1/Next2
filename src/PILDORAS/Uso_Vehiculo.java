package PILDORAS;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche miCoche1 = new Coche();

		miCoche1.establece_color("Rojo");

		Herencia_furgoneta miFurgo1 = new Herencia_furgoneta(580 , 7);

		miFurgo1.establece_color("Azul");
		miFurgo1.configura_asientos("si");
		miFurgo1.configura_climatizador("si");
		
		System.out.println(miCoche1.dime_datos_generales() + " "+ miCoche1.dime_color());
		
		System.out.println(miFurgo1.dime_datos_generales() + " "+ miFurgo1.dime_datos_furgoneta());

	}

}
