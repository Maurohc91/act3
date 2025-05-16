package org.example;

import java.io.File;
import java.util.Scanner;

public class Listar {

    public static void main(String[] args) {



        File carpeta = new File("src/main/resources");


        //1 OPCION listar solo nombres
        String ficheros[] = carpeta.list();

        if (ficheros != null && ficheros.length>0){

            for(String fichero : ficheros){
                System.out.println(fichero);
            }
        }else{
            System.out.println("El directorio esta vacío.");
        }

        //2 OPCION listar objectos de tipo File

        File listaFicheros[] = carpeta.listFiles();

        if(listaFicheros != null && listaFicheros.length>0){

            for (File fichero :listaFicheros) {
                if (fichero.isFile()) {
                    System.out.println("Fichero con nombre " + fichero.getName() + " con tamaño " + fichero.length() + " bytes.");
                }
            }

        }else{
            System.out.println("No hay nada que listar! DIRECTORIO VACÍO.");
        }


    }
}

