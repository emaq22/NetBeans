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
public class Ej2 {

      /*
       Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
       pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
       **Nota: investigar la función equals() en Java**
      */
      public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            String frase;
            do {                  
                System.out.println("Ingresa una frase");
                frase=leer.nextLine();
                  if (frase.equalsIgnoreCase("eureka"))  {
                        System.out.println("Correcto!");
                  } else {
                        System.out.println("Incorrecto! Pruebe de nuevo.");
                  }
            } while (!frase.equalsIgnoreCase("eureka"));
      }
      
}
