
package guia.pkg2;

import java.util.Scanner;

public class Ej8 {

      public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            int num;
            do {                  
                  System.out.println("Ingrese un número entero positivo"); 
                  num = leer.nextInt();  
            } while (num<2);
            
            for (int i = 0; i <= num-1; i++) {
                  for (int j = 0; j <= num-1; j++) {
                        if (i==0 || i==num-1) {
                              System.out.print("* ");
                        }  else if (j==0 || j==num-1) {
                              System.out.print("* ");
                        } else {
                              System.out.print("  ");
                        }
                  }
                  System.out.println("");
            }
      }    
}
