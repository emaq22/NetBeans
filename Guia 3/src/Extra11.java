
import java.util.Scanner;

/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que componen 
ese número. Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. 
Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. Nota: 
recordar que las variables de tipo entero truncan los números o resultados.
*/

public class Extra11 {

      public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            //se obtiene el número
            System.out.print("Introduce un número entero: ");
            int numero = leer.nextInt();
            //se inicia una variable destinada a contador en 0
            int cantidad_digitos = 0;
            //con un bucle while sehace la division del numero por 10 y se incrementa el contador para 
            //contabilizar los digitos, una vez que el numero llega a 0 se cierra el bucle
            while (numero != 0) {
                  numero = numero / 10;
                  cantidad_digitos++;
            }
            //se imprime el resultado
            System.out.println("El número de dígitos es: " + cantidad_digitos);
      }
}
