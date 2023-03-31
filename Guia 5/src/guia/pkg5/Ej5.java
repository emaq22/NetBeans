
package guia.pkg5;

import java.util.Arrays;
import java.util.Random;


public class Ej5 {

      public static void main(String[] args) {

        // Declarar la matriz de 3x3
        int[][] matriz = new int[3][3];

        // Rellenar la matriz con valores aleatorios entre -10 y 10
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = random.nextInt(21) - 10;
            }
        }

        // Mostrar la matriz original
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        // Comprobar si la matriz es antisimétrica
        boolean esAntisimetrica = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    esAntisimetrica = false;
                    break;
                }
            }
            if (!esAntisimetrica) {
                break;
            }
        }

        // Mostrar el resultado
        if (esAntisimetrica) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
        }
    }

    // Función auxiliar para mostrar una matriz en la consola
    private static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
        System.out.println();
    }

}
