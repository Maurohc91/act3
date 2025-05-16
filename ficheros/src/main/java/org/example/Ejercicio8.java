package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuántos ficheros quieres?");
        int num = teclado.nextInt();

        System.out.println("En qué directorio lo quieres?");
        teclado.nextLine();
        String carpeta = teclado.nextLine();

        File comprobarCarpeta = new File(carpeta);

        if (comprobarCarpeta.exists()) {
            for (int i = 1; i <= num; i++) {

                File fichero = new File(carpeta + "/nombre(" + i + ").txt");
                try {
                    if (fichero.createNewFile()) {
                        System.out.println("Fichero " + fichero.getName() + " creado.");

                        // Escribir en el fichero
                        FileWriter escritor = new FileWriter(fichero);
                        escritor.write("Este es el fichero " + fichero.getName());
                        escritor.close();

                    } else {
                        System.out.println("El fichero " + fichero.getName() + " ya existe.");
                    }

                } catch (IOException e) {
                    System.out.println("Algo ha ido mal");
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("La ruta no existe!");
        }
    }
}
