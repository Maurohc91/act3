package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio6 {

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
            BufferedReader lector = new BufferedReader(new FileReader(rutaFichero));
            String linea;

            while ((linea = lector.readLine()) != null) {
                String[] palabras = linea.split(" ");
                for (String palabra : palabras) {
                    if (palabra.equalsIgnoreCase(palabraBuscada)) {
                        contador++;
                    }
                }
            }
            lector.close();
        } catch (IOException e) {
            System.out.println("Error al leer el fichero.");
            e.printStackTrace();
        }
        return contador;
    }
}
