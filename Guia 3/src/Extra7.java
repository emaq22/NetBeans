
import java.util.Scanner;



public class Extra7 {

      public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Ingrese cantidad de números a sumar");
            int num = leer.nextInt(), cont = 0, num1;
            
            //al final se explica funcion de Double.MIN_VALUE y de Double.MAX_VALUE
            double suma=0, cant=0,numMax=Double.MIN_VALUE, numMin=Double.MAX_VALUE;
            
            //Se cambia y se comenta según el bucle que desee ejecutar (OJO DEBE SER AL INICIO Y AL FIN DEL MISMO)
            do {
                  
            //while (cont!=num){
                  System.out.println("Ingrese el " + (cont+1) + "° número.");
                  num1 = leer.nextInt();
                  
                  //se evalua si el valor es mayor a 0, en caso de ser se suman y se contabiliza la cantidad de numeros
                  if (num1>0) {
                        suma += num1;
                        cant++;
                  }
                  
                  //comparamos valores maximos y minimos y se actualizan
                  if (num1<numMin) {
                        numMin=num1;
                  } else if (num1>numMax){
                        numMax=num1;
                  }
                  cont++;
            //}
            } while (cont!=num);
            
            //calculamos el promedio de los valores mayores a 0
            double promedio = suma/cant;
            
            //mostramos los resultados
            System.out.println("El valor máximo ingresado es: " + numMax);
            System.out.println("El valor mínimo ingresado es: " + numMin);
            System.out.println("El promedio de los valores mayores a 0 es; " + promedio);
      }
}
/*
En el código de las dos versiones del programa que calculan el valor máximo, el valor mínimo y 
el promedio de n números, se utiliza Double.MIN_VALUE y Double.MAX_VALUE para inicializar las 
variables maximo y minimo, respectivamente.

Double.MIN_VALUE es la constante de menor valor positivo representable por un double. Es decir, 
cualquier número positivo que se pueda representar en un double será mayor o igual a Double.MIN_VALUE. 
Por lo tanto, al inicializar maximo con Double.MIN_VALUE, se asegura de que cualquier número 
ingresado por el usuario será mayor o igual a maximo.

Por otro lado, Double.MAX_VALUE es la constante de mayor valor representable por un double. Es decir, 
cualquier número que se pueda representar en un double será menor o igual a Double.MAX_VALUE. Por 
lo tanto, al inicializar minimo con Double.MAX_VALUE, se asegura de que cualquier número ingresado 
por el usuario será menor o igual a minimo.

De esta manera, al utilizar estos valores como inicializadores, podemos garantizar que maximo y 
minimo tendrán un valor inicial adecuado antes de comenzar a procesar los números ingresados por 
el usuario.
*/