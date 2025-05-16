package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leer{

    public static void main(String[] args) {

        try {

            BufferedReader lector = new BufferedReader(new FileReader("src/main/resources/datos.txt"));
            String linea;

            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }

            lector.close();

        } catch (IOException e) {
            System.out.println(e.getStackTrace());
            throw new RuntimeException(e);
        }

    }

}