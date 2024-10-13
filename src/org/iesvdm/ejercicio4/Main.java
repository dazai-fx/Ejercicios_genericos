package org.iesvdm.ejercicio4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        Integer[][] matriz = new Integer[4][2];

        System.out.println("Creando matriz de 4 filas y 4 columnas...");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j]= random.nextInt(100);
            }
        }

        String resultado = "Matriz[\n";
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                resultado += matriz[i][j];
                if (j != 2 - 1) {
                    resultado += ", ";
                }
            }

            resultado += "\n";
        }
        resultado += "]";

        System.out.println(resultado);

        // los indices empiezan desde 0 por eso a las filas y columnas se le resta 1
        System.out.println("El contenido de la celda en la fila 1 y columna 2 es: "+matriz[0][1]);

    }

}
