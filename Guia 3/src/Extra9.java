
import java.util.Scanner;

/*
Simular la división usando solamente restas. Dados dos números enteros mayores que uno, 
realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método: 
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este 
resultado es el residuo, y el número de restas realizadas es el cociente.
*/

public class Extra9 {

      public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            //Se ingresan los números
            System.out.println("Ingrese primer número.");
            int num1 = leer.nextInt(), cociente=0;
            
            System.out.println("Ingrese segundo número.");
            int num2 = leer.nextInt();
            
            //se utiliza el bucle para realizar la resta, una vez que num1 (residuo) es menor a num2 sale del mismo
            //se incrementa una variable, la cual será el cociente de la división
            do {                  
                  num1 -= num2;
                  cociente++;
            } while (num1>=num2);
            
            //se imprimen los resultados
            System.out.println("El residuo de la división es: " + num1);
            System.out.println("El cociente de la division es: " + cociente);
      }
}