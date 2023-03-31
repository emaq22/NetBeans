/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ejercicio8 {

      /**
       * @param args the command line arguments
       */
      public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingree una nota entre el 0 y el 10.");
            int resp = leer.nextInt();
            while (resp<0 || resp>10)  {
                  System.out.println("Ingrese una nota válida.");
                  resp = leer.nextInt();
            }        
               
      }
      
}
