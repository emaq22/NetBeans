
package Curso;

import java.util.Arrays;

public class Dia3 {

    // Método para contar la cantidad de apariciones de una letra en un String
    public static int contarLetra(String palabra, char letra) {
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                contador++;
            }
        }
        return contador;
    }

    // Método para ordenar tres números en forma ascendente o descendente
    public static int[] ordenarNumeros(int num1, int num2, int num3, String orden) {
        int[] numeros = {num1, num2, num3};
          switch (orden){
                case "ascendente":
                      Arrays.sort(numeros);
                      break;
                case "descendente":
                      Arrays.sort(numeros);
                      int temp = numeros[0];
                      numeros[0] = numeros[2];
                      numeros[2] = temp;
                      break;
                default:
                      System.out.println("Error: orden incorrecto");
                      break;
          }
        return numeros;
    }

    // Método para sumar los números mayores que X en un vector
    public static int sumaMayoresX(int[] numeros, int X) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > X) {
                suma += numeros[i];
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        // Ejemplo de uso de los métodos
        String palabra = "programacion";
        char letra = 'r';
        int cantidad = contarLetra(palabra, letra);
        System.out.println("La letra '" + letra + "' aparece " + cantidad + " veces en la palabra '" + palabra + "'");

        int num1 = 15;
        int num2 = 3;
        int num3 = 9;
        int[] numerosOrdenados = ordenarNumeros(num1, num2, num3, "descendente");
        System.out.println("Los números ordenados son: " + Arrays.toString(numerosOrdenados));

        int[] numeros = {10, 20, 30, 40, 50};
        int X = 25;
        int suma = sumaMayoresX(numeros, X);
        System.out.println("La suma de los números mayores que " + X + " es " + suma);
    }
}