/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg2;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ej1 {

      /**
       * @param args the command line arguments
       */
      public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese un número para saber si es par o impar, ingrese 0 para salir.");
             int num=leer.nextInt();
            do {
                  if (num%2==0) {
                        System.out.println("El número ingresado es par.");
                  }
                        else{
                        System.out.println("El número ingresado es impar.");
                        }
                  System.out.println("Ingrese un número para saber si es par o impar, ingrese 0 para salir.");
                  num=leer.nextInt();
            } while (num!=0);
      }
      
}
