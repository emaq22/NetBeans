
package guia.pkg5;

import java.util.Scanner;


public class NewMain2 {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Pedir al usuario que ingrese 5 palabras de 3 a 5 caracteres
            String[] palabras = new String[5];
            for (int i = 0; i < 5; i++) {
                  System.out.print("Ingrese la palabra #" + (i+1) + " (de 3 a 5 caracteres): ");
                  palabras[i] = sc.next();
                  while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                        System.out.print("La palabra debe tener de 3 a 5 caracteres. Ingrese otra palabra: ");
                        palabras[i] = sc.next();
                  }
            }

            // Crear una matriz de 20x20
            char[][] sopa = new char[20][20];

            // Elegir una fila aleatoria donde se colocarán las palabras
            int filaAleatoria = (int) (Math.random() * 20);

            // Colocar las palabras en la fila aleatoria elegida
            int columna = (int) (Math.random() * (20 - palabras.length));
            for (String palabra : palabras) {
                  for (int i = 0; i < palabra.length(); i++) {
                        if (columna+i < 20) {  // Verificar que el índice está dentro del rango
                              sopa[filaAleatoria][columna+i] = palabra.charAt(i);
                        }
                  }
                  columna += palabra.length() + 1; // Dejar un espacio entre las palabras
            }


            // Rellenar los espacios no utilizados con números aleatorios del 0 al 9
            for (int i = 0; i < 20; i++) {
                  for (int j = 0; j < 20; j++) {
                        if (sopa[i][j] == 0) {
                              sopa[i][j] = (char) ((int) (Math.random() * 10) + '0');
                        }
                  }
            }

            // Imprimir la sopa de letras por pantalla
            for (int i = 0; i < 20; i++) {
                  for (int j = 0; j < 20; j++) {
                        System.out.print(sopa[i][j] + " ");
                  }
                  System.out.println();
            }
      }

}
