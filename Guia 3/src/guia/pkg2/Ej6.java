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
public class Ej6 {

      /**
       * @param args the command line arguments
       */
      public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            String resp;
            System.out.println("Ingreso al programa");
             System.out.println("Ingrese dos numeros enteros positivos");
                  int num1 = leer.nextInt();
                  int num2 = leer.nextInt();
            int opc;
            do {     
                  System.out.println("Ingrese una opción del menu");
                  System.out.println("MENU");
                  System.out.println("1.  Sumar");
                  System.out.println("2.  Restar");
                  System.out.println("3.  Multiplicar");
                  System.out.println("4.  Dividir");
                  System.out.println("5.  Salir");
                  System.out.println("Elija opción:");
                  
                  opc = leer.nextInt();
                  
                  switch (opc) {
                        case 1:
                              System.out.println("La suma de los números ingresados es; "+ (num1+num2));
                              continue;
                        case 2:
                              System.out.println("La resta de los números ingresados es: "+ (num1-num2));
                              continue;
                        case 3:
                              System.out.println("La multiplicación de los números ingresados es: "+ (num1*num2));
                              continue;
                        case 4: 
                              System.out.println("La división de los números ingresados es: "+ (num1/num2));
                              continue;
                        case 5:
                              System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                              break;
                        default:
                              System.out.println("Ingrese una opción correcta");
                        }
                   resp = leer.next();
                   
                  if (!resp.equalsIgnoreCase("S") && !resp.equalsIgnoreCase("N")) {
                        do {
                              System.out.println("Ingrese una opción correcta");
                              resp = leer.next();
                        } while (!resp.equalsIgnoreCase("S") && !resp.equalsIgnoreCase("N"));
                  }
                 
                  if ("S".equalsIgnoreCase(resp)) {
                        break;
                        } 
                        
            } while (true);
      }
}
