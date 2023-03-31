/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg2;

import java.util.Scanner;

public class Ej1 {


      public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese un número para saber si es par o impar, ingrese 0 para salir.");
             int num;
            do {
                  System.out.println("Ingrese un número para saber si es par o impar, ingrese 0 para salir.");
                  num=leer.nextInt(); 
                  if (num%2==0) {
                        System.out.println("El número ingresado es par.");
                  }
                        else{
                        System.out.println("El número ingresado es impar.");
                        }
            } while (num!=0);
      }  
}
