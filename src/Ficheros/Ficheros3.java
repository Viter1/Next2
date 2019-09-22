package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ficheros3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leerFichero2 leer = new leerFichero2() ;
		leer.lee();
	}

}

class leerFichero2 {
	// Metodo para leer lienas
	public void lee() {
		try {
			FileReader lector = new FileReader("./test.txt");
			BufferedReader bf = new BufferedReader(lector);
			String longitudLector = "";

			while (longitudLector != null) {
				longitudLector = bf.readLine();
				if (longitudLector!=null) {
					System.out.println(longitudLector);
				}
				
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
