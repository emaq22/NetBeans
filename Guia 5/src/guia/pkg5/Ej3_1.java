
package guia.pkg5;

import java.util.Random;
import java.util.Scanner;


public class Ej3_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Pedir al usuario la dimensión del vector
        System.out.print("Ingrese la dimensión del vector: ");
        int dim = leer.nextInt();

        // Crear el vector aleatorio de n elementos
        int[] vector = new int[dim];
        Random rand = new Random();
        for (int i = 0; i < dim; i++) {
            vector[i] = rand.nextInt(99999) + 1; // Número aleatorio de hasta 5 dígitos
        }

        // Contar la cantidad de números de cada longitud de dígitos
        int[] contador = new int[6];
        for (int i = 0; i < dim; i++) {
            int numero = vector[i];
            int digitos = String.valueOf(numero).length();

            if (digitos >= 1 && digitos <= 5) {
                contador[digitos]++;
            }
        }

        // Imprimir los resultados
        for (int i = 1; i <= 5; i++) {
            System.out.println("Cantidad de números de " + i + " dígitos: " + contador[i]);
        }

        leer.close();
    }

}
