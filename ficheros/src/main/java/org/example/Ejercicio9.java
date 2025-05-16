package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Ejercicio9 {

    public static void main(String[] args) {

        File archivo = new File("src/main/resources/prueba_escribir.txt");
        modificarArchivo(archivo);
    }

    public static void modificarArchivo(File archivo) {
        try {

            List<String> lineas = Files.readAllLines(archivo.toPath());

            StringBuilder contenidoModificado = new StringBuilder();

            for (String linea : lineas) {
                String[] palabras = linea.split(" ");

                for (int i = 0; i < palabras.length; i++) {
                    String palabra = palabras[i];

                    if (!palabra.isEmpty()) {
                        String primeraMayus = palabra.substring(0, 1).toUpperCase();
                        String resto = palabra.length() > 1 ? palabra.substring(1).toLowerCase() : "";
                        contenidoModificado.append(primeraMayus).append(resto);
                    }

                    if (i < palabras.length - 1) {
                        contenidoModificado.append(" ");
                    }
                }
                contenidoModificado.append("\n");
            }


            FileWriter escritor = new FileWriter(archivo);
            escritor.write(contenidoModificado.toString());
            escritor.close();

            System.out.println("El contenido del archivo ha sido capitalizado correctamente.");

        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al procesar el archivo.");
            e.printStackTrace();
        }
    }
}
