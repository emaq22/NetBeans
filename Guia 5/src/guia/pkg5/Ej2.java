
package guia.pkg5;

import java.util.Random;
import java.util.Scanner;


public class Ej2 {

      public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Ingrese la dimension del Array");
            int num = leer.nextInt(), cont=0;
            
            System.out.println("Ingrese el margen de los numeros aleatorios");
            int dimension = leer.nextInt();
            
            // Crea una instancia de la clase Random
            Random rand = new Random();
            
            // Crea el vector para guardar los numeros
            int[] numeros = new int[num];
            
            for (int i = 0; i < num; i++){
                  // Genera un número aleatorio entre 0 y 99
                  numeros[i] = rand.nextInt(dimension);
            }

            System.out.println("Ingrese el numero que desea buscar");
            int busqNum = leer.nextInt();
            
            for (int i = 0; i < num; i++){
                  if (busqNum==numeros[i]){
                        System.out.println("Se encontro el numero en la posicion " + (i+1));
                        cont++;
                  } 
            }
            if (cont==0) {
                  System.out.println("No se encontró el número.");
            }
      }

}
