package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        File archivo1 = new File("src/main/resources/entrada1.txt");
        File archivo2 = new File("src/main/resources/entrada2.txt");
        File archivoSalida = new File("src/main/resources/resultado.txt");

        combinarArchivos(archivo1, archivo2, archivoSalida);
    }

    public static void combinarArchivos(File archivo1, File archivo2, File archivoSalida) {
        try {
            Scanner lector1 = new Scanner(archivo1);
            Scanner lector2 = new Scanner(archivo2);
            PrintWriter escritor = new PrintWriter(new FileWriter(archivoSalida));

            while (lector1.hasNext() || lector2.hasNext()) {
                if (lector1.hasNext()) {
                    escritor.print(lector1.next() + " ");
                }
                if (lector2.hasNext()) {
                    escritor.print(lector2.next() + " ");
                }
            }
            lector1.close();
            lector2.close();
            escritor.close();
            System.out.println("Archivos combinados correctamente en: " + archivoSalida.getName());

        } catch (IOException e) {
            System.out.println("Ha ocurrido un error durante la combinación.");
            e.printStackTrace();
        }
    }
}
