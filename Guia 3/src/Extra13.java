
import java.util.Scanner;



public class Extra13 {

      public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese la altura de la escalera.");
            int altura = leer.nextInt();
        
            for (int i = 1; i <= altura; i++) {
                  for (int j = 1; j <= i; j++) {
                        System.out.print(j + " ");
                  }
                  System.out.println();
            }
      }
}
 /*
Esta es otra opcion concatenando los numeros

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce la altura de la escalera: ");
            int altura = sc.nextInt();

            for (int i = 1; i <= altura; i++) {
                  String linea = "";
                  for (int j = 1; j <= i; j++) {
                        linea += j + " ";
                  }
                  System.out.println(linea);
            }

Utilizamos el mismo enfoque que en el ejemplo anterior para obtener la entrada del 
usuario y recorrer las filas de la escalera. Sin embargo, en vez de imprimir cada 
número con un System.out.print, concatenamos los números en una variable de tipo 
String llamada linea.

En el segundo bucle for (línea 10), se recorre desde j = 1 hasta j = i, y se va 
concatenando cada número seguido de un espacio en blanco a la variable linea. Luego, 
se utiliza el método println de la clase System para imprimir la variable linea y
pasar a la siguiente fila.
*/