/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg11.pkg12;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ejercicio12 {

      /**
       * @param args the command line arguments
       */
      public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Deberá ingresar dos números para saber si son multiplos"+"\n Ingrese el primero:");
            int num1 = leer.nextInt();
            System.out.println("Ingrese el segundo número:");
            int num2 = leer.nextInt();
            multiplos(num1, num2);
      }
      
      public static void multiplos(int num1, int num2) {
            if (num1 % num2 == 0){
                  System.out.println(num1 + " es multiplo de " + num2);
            } else {
                  System.out.println(num1 + " no es multiplo de " + num2);
            }
      }
      
}
