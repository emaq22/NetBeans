/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ejercicio10 {

      /**
       * @param args the command line arguments
       */
      public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            int k=4;
            
            do {
                  System.out.println("Ingrese un número.");
                  int num=leer.nextInt();
                  System.out.print(num+" ");
                  for (int i = 0; i < num; i++) {
                        System.out.print("*");
                  }
                  k--;
                  System.out.println("");
            } while (k!=0);
      }
      
}
