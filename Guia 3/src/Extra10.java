
import java.util.Scanner;

/*
Realice un programa para que el usuario adivine el resultado de una multiplicación 
entre dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al
usuario si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se 
debe permitir al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio 
investigue como utilizar la función Math.random() de Java.
*/

public class Extra10 {

      public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            int num1 = (int) (Math.random() * 11); // Genera el primer número aleatorio
            int num2 = (int) (Math.random() * 11); // Genera el segundo número aleatorio
            int resultado = num1 * num2; // Calcula el resultado de la multiplicación
            
            System.out.print("Adivina el resultado de la multiplicación: ");

            int respuesta = leer.nextInt(); // Lee la respuesta del usuario

            while (respuesta != resultado) { // Mientras la respuesta sea incorrecta
                  if (respuesta < resultado) {
                        System.out.print("La respuesta es menor, intenta nuevamente: ");
                  } else {
                        System.out.print("La respuesta es mayor, intenta nuevamente: ");
                  }
                  respuesta = leer.nextInt(); // Lee la respuesta del usuario nuevamente
            }

            System.out.println("¡Correcto!"); // Si la respuesta es correcta
      }
}

/*
La función Math.random() es una función de Java que devuelve un número aleatorio entre 
0.0 y 1.0 (exclusivo). Esto significa que el número generado puede ser cualquier valor 
en el rango [0, 1), es decir, cualquier número mayor o igual a 0, pero menor que 1.

La función Math.random() es muy útil para generar números aleatorios en programas que 
requieren una cierta dosis de aleatoriedad, como juegos, simulaciones, algoritmos genéticos, 
entre otros. Para generar números aleatorios en un rango específico, se puede multiplicar 
el resultado de Math.random() por el tamaño del rango deseado y luego sumar el valor 
mínimo del rango. Por ejemplo, para generar un número aleatorio entre 0 y 10, se puede 
utilizar la siguiente fórmula:

int num = (int) (Math.random() * 11); // Genera un número entre 0 y 10 (exclusivo)

En este caso, se multiplica el resultado de Math.random() por 11 para obtener un número 
aleatorio entre 0 y 11 (exclusivo), y luego se convierte a un número entero utilizando 
el operador de casting (int). Como el resultado puede ser cualquier valor entre 0 y 10 
(exclusivo), se puede considerar que se ha generado un número aleatorio en el rango deseado.

Espero que esto te haya ayudado a entender mejor la función Math.random() de Java. 
*/
