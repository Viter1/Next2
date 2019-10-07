package Ficheros_Directorios;

import java.io.File;
import java.io.IOException;

public class Ficheros_Directorio3 {
	public static void main(String[] args) {
		// Creando directorio
		File crearDirect = new File("." + File.separator + "prueba.txt");
		// crearDirect.mkdir();
		String archivo_destino = crearDirect.getAbsolutePath();

		try {
			crearDirect.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Escribiendo accede_es = new Escribiendo();
		accede_es.escribir(archivo_destino);
		
		// Borrar nuestro archivo
		// crearDirect.delete();

	}

}
