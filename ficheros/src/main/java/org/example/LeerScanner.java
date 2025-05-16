package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerScanner {
    public static void main(String[] args) {
        try {
            File archivo = new File("src/main/resources/datos_personas.txt");
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println("Línea: " + linea);
            }

            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
            e.printStackTrace();
        }
    }
}