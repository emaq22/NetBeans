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
public class Ej5 {

      /**
       * @param args the command line arguments
       */
      public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Deberá ingresar números a sumar");
            int suma=0;
            do  {
                  System.out.println("Ingrese un número");
                  int num=leer.nextInt();
                  suma=suma+num;
            } while (suma<=1000);
            System.out.println("Usted supero el límite de 1000.");
      }
      
}
