/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ejercicio9 {

      /**
       * @param args the command line arguments
       */
      public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Deberá ingresar 20 números o ingrese el número 0 para salir.");
            int suma=0;
            int i=20;
            int num;
            do {
                  System.out.println("Ingrese un número"); 
                  num=leer.nextInt();
                  suma=suma+num;
                  i--;
                  if (num==0) {
                        System.out.println("Se capturó el numero cero");
                        break;
                  }
            } while (i!=0);
                  System.out.println("La suma de los números ingresados es de:"+suma);
                  
                  
      }
      
}
