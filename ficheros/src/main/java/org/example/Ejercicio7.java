package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la palabra a buscar: ");
        String palabra = teclado.nextLine();

        int contador = contarPalabras("src/main/resources/datos.txt", palabra);

        System.out.println("La palabra " + palabra + " aparece " + contador + " veces en el fichero.");
    }

    public static int contarPalabras(String rutaFichero, String palabraBuscada) {
        int contador = 0;

        try {
            File archivo = new File(rutaFichero);
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                String[] partes = linea.split(" ");
                for (String palabra : partes) {
                    if (palabra.equalsIgnoreCase(palabraBuscada)) {
                        contador++;
                    }
                }
            }

            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
            e.printStackTrace();
        }

        return contador;
    }
}
