package Ficheros;

import java.io.FileWriter;
import java.io.IOException;

public class Ficheros2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Escribiendo acceso = new Escribiendo();
		acceso.escribir();

	}

}

class Escribiendo {

	public void escribir() {
		String frase = "Esto es una prueba";
		
		try {
			FileWriter escritura = new FileWriter("./test.txt");
			for (int i = 0; i < frase.length(); i++) {
				escritura.write(frase.charAt(i));
			}
			escritura.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}