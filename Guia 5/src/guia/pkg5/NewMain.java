
package guia.pkg5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class NewMain {

    public static void main(String[] args) {
         
    Scanner read = new Scanner(System.in);
    Random rand = new Random();

    // Creamos y rellenamos sopa de letras
    String[][] sopaLetras = new String[20][20];
    // Creamos un vector conteniendo 5 palabras de entre 3 y 5 caracteres
    String[] palabras = new String[5];
    for (int i = 0; i < palabras.length; i++) {
        System.out.print("Ingresa una palabra de 3 a 5 letras: ");
        String palabra = read.nextLine();
        while (palabra.length() < 3 || palabra.length() > 5) {
            System.out.print("La palabra debe tener de 3 a 5 letras. Ingresa otra vez: ");
            palabra = read.nextLine();
        }
        palabras[i] = palabra.toUpperCase();
    }
    System.out.println(Arrays.toString(palabras));

    // Selecciono las filas aleatoriamente y sin repetir dentro de un vector 
    // y los ordeno de menor a mayor
    int[] filas = new int[5];
    for (int i = 0; i < 5; i++) {
        int numAleatorio;
        boolean repetido;
        do {
            numAleatorio = rand.nextInt(20);
            repetido = false;

            for (int j = 0; j < i; j++) {
                if (filas[j] == numAleatorio) {
                    repetido = true;
                    break;
                }
            }
        } while (repetido);
        filas[i] = numAleatorio;
    }
    Arrays.sort(filas);
    for (int i = 0; i < filas.length; i++) {
        System.out.print("[" + filas[i] + "]");
    }
    System.out.println("");

    // Selecciono las columnas aleatoriamente dentro de un vector  
    int cont = 0;
    for (int i = 0; i < 20; i++) {
        int contCol = 0;
        for (int j = 0; j < 20; j++) {
            if (filas[cont] == i) {
                if (contCol < palabras[cont].length()) {
                    sopaLetras[i][j] = palabras[cont].substring(contCol, contCol + 1);
                    contCol++;
                } else {
                    sopaLetras[i][j] = String.valueOf(rand.nextInt(9) + 1);
                }
            } else {
                sopaLetras[i][j] = String.valueOf(rand.nextInt(9) + 1);
            }
            System.out.print("[" + sopaLetras[i][j] + "]");
        }
        if (filas[cont] == i) {
            cont++;
        }
        System.out.println();
    }
}

    }


