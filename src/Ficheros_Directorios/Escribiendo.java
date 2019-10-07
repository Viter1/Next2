package Ficheros_Directorios;

import java.io.FileWriter;
import java.io.IOException;

public class Escribiendo {

	public void escribir(String archivo_destino) {
		String ejem = "Esto es un ejemplo ya recemos a dios ";
		
		try {
			FileWriter escritura = new FileWriter(archivo_destino,true);
			for (int i = 0; i < ejem.length(); i++) {
				escritura.write(ejem.charAt(i));
			}
			escritura.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
