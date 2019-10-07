package Ficheros_Directorios;

import java.io.File;

public class Ficheros_Directorios1 {
	public static void main(String[] args) {
		File archivo = new File("."+File.separator+"bin" );
		System.out.println(archivo.getAbsolutePath());
		System.out.println(archivo.exists());
		

	}

}
