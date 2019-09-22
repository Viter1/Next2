package FicherosLeyendoYEescribiendoBytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lectura_Escritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;

		int datosEntrada[] = new int[181135];

		try {
			FileInputStream archivoLectura = new FileInputStream("./img/imagen.jpeg");
			boolean final_ar = false;
			while (!final_ar) {
				int byte_entrada = archivoLectura.read();
				if (byte_entrada != -1) {
					datosEntrada[counter] = byte_entrada;

				} else {
					final_ar = true;
				}
				System.out.println(datosEntrada[counter]);
				counter++;

			}
		} catch (IOException e) {
			System.out.println("No se ha podido crear la imagen");
		}
		System.out.println("cunter " + counter);
		crea_fichero(datosEntrada);
		
	}
	
	static void crea_fichero(int datosNuevoFichero[]) {
		
		try {
			FileOutputStream archivoEscritura = new FileOutputStream("./img/imagen_copia2.jpeg");
			
			for (int i = 0; i < datosNuevoFichero.length ; i++) {
				archivoEscritura.write(datosNuevoFichero[i]);
			}
			
			archivoEscritura.close();
			
		} catch (IOException e) {
			System.err.println("No se ha podido copiar la imagen");
		}
		
	}

}
