
package guia.pkg4;

import java.util.Scanner;


public class Ej4 {

      public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            int num1;
            do {
                  System.out.println("Ingrese un número mayor a 0.");
                  num1 = leer.nextInt();
            } while (num1 < 0);
            
            boolean primo = primos(num1);
           
            if (primo){
                  System.out.printf("El número %d es primo. \n",num1);
            } else {
                  System.out.printf("El número %d no es primo. \n",num1);
                  }
      }
   
      public static boolean primos(int num1){
            //comprueba si el numero es menor o igual a 1 cuyo caso no es primo
            if (num1 <= 1){
                  return false;
            }
            /*el bucle comprueba si el número es divisible por algún número entre 2 y la raíz cuadrada del número.
            en caso de serlo retorna false*/
            for (int i = 2; i <= Math.sqrt(num1); i++){
                  if (num1 % i == 0){
                        return false;
                  }
            }       
            return true;
      }
}
/*
Este código primero pide al usuario que introduzca un número entero mediante la clase Scanner de 
Java. Luego llama a la función esPrimo con ese número como parámetro.

La función esPrimo comprueba si el número es menor o igual a 1, en cuyo caso no es primo. Luego 
realiza un bucle for para comprobar si el número es divisible por algún número entre 2 y la raíz 
cuadrada del número. Si el número es divisible por algún número en ese rango, entonces no es primo. 
Si no es divisible por ningún número en ese rango, entonces es primo.

La función devuelve true si el número es primo y false si no lo es. En el código principal, se utiliza 
el valor devuelto por la función para mostrar un mensaje apropiado al usuario.
La función Math.sqrt(numero) en Java devuelve la raíz cuadrada de un número. 
*
*
En el caso de Math.sqrt(numero), la función devuelve la raíz cuadrada del número que se le pasa 
como parámetro.

Por ejemplo, si pasamos el número 16 como parámetro a Math.sqrt(numero), la función devolverá 4, 
que es la raíz cuadrada de 16. Si pasamos el número 25 como parámetro a Math.sqrt(numero), la función 
devolverá 5, que es la raíz cuadrada de 25.

En el código que te mostré anteriormente para determinar si un número es primo, se utiliza Math.sqrt(numero) 
para calcular el rango de números a comprobar en el bucle for. Si un número es divisible por algún número 
entre 2 y la raíz cuadrada del número, entonces no es primo, por lo que no es necesario comprobar números 
mayores a la raíz cuadrada. Esto ayuda a hacer el cálculo de manera más eficiente.
*/