package Ficheros_Directorios;

import java.io.File;

public class Ficheros_Directorio2 {

	public static void main(String[] args) {
		// acceso fichero
		File ruta = new File("C:" + File.separator + "Users" + File.separator + "usuario" + File.separator + "Desktop"
				+ File.separator + "camarero");
		String nombre_archivo[] = ruta.list();

		for (int i = 0; i < nombre_archivo.length; i++) {
			System.out.println(nombre_archivo[i]);
			// Contructor que nos permite especificar dos argumentos de tipo string
			// (la ruta de nuestra carpeta , y el nombre del archivo)
			File f = new File(ruta.getAbsolutePath(), nombre_archivo[i]);
			if (f.isDirectory()) {
				String nombre_subcarpeta[] = f.list();
				for (int j = 0; j < nombre_subcarpeta.length; j++) {
					System.out.println("--" + nombre_subcarpeta[j]);
				}
			}
		}

	}

}
