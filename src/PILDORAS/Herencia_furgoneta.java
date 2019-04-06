package PILDORAS;

public class Herencia_furgoneta extends Coche {

	private int capacidad_carga;
	private int plazas_extra;

	public Herencia_furgoneta(int capacidad_carga, int plazas_extra) {
		super();
		this.capacidad_carga = capacidad_carga;
		this.plazas_extra = plazas_extra;
	}

	public String dime_datos_furgoneta() {
		return "La capacidad de carga es " + capacidad_carga + " y las plazas son " + plazas_extra;
	}
	
	
	
}
