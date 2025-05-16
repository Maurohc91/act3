package org.example;


import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        File fichero = new File("src/main/resources/prueba.txt"); //crear un objeto tipo fichero para usar metodos

        try {
            fichero.createNewFile(); //si no existe lo crea
        } catch (IOException e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }
        if(fichero.exists()){

            System.out.println(fichero.getName() + " existe");

        }else{
            System.out.println(fichero.getName() + " no existe");
        }

        System.out.println("Tamaño del fichero: "+ fichero.length());
        System.out.println("Ruta del fichero: "+ fichero.getAbsolutePath());


        File carpeta = new File("src/main/resources/mauro");

        carpeta.mkdir(); // crear carpeta


        if(carpeta.exists()){
            System.out.println("La carpeta " + carpeta.getName() + " existe.");
        }else{
            System.out.println("La carpeta " + carpeta.getName() + " no existe.");
        }

        fichero.delete(); //para borrar fichero

        if(fichero.exists()){

            System.out.println(fichero.getName() + " existe");

        }else{
            System.out.println(fichero.getName() + " no existe");
        }
    }
}