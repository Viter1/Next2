package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.LogManager;

public class Ficheros1 {
	public static void main(String[] args) {
		leerFichero accediendo = new leerFichero();
		accediendo.lee();
	}

}

class leerFichero {

	public void lee() {
		try {
			FileReader lector = new FileReader("./test.txt");
			int longitudLector = 0;
			while (longitudLector != -1) {
				longitudLector = lector.read();
				char letra = (char) longitudLector;
				System.out.println(letra);
			}
			lector.close();

		 } catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("No se ha encontrado el archivo");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}