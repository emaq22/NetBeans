/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg4;

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
            double num1,num2,res;
            int opc;
            System.out.println("Ingrese primer número.");
            num1=leer.nextDouble();
            System.out.println("Ingrese segundo número.");
            num2=leer.nextDouble();
            do {                  
                  System.out.println("Ingrese una opción del MENU.");
                  System.out.println("MENU");
                  System.out.println("1)  Sumar.");
                  System.out.println("2)  Restar.");
                  System.out.println("3)  Multiplicar.");
                  System.out.println("4)  Dividir");
                  System.out.println("5)  Salir");
                  System.out.print("Elija opción: ");
                  opc = leer.nextInt();
                  switch (opc){
                        case 1:
                              res=sumar(num1,num2);
                              System.out.println("La suma de los números es: " + res + "\n");
                              continue;
                        case 2:
                              res=restar(num1,num2);
                              System.out.println("La suma de los números es: " + res + "\n");
                              continue;
                        case 3:
                              res=multiplicar(num1,num2);
                              System.out.println("La suma de los números es: " + res + "\n");
                              continue;      
                        case 4:
                              if (num2==0){
                                    System.out.println("No se puede dividir entre 0");
                              }else {
                              double reso=dividir(num1,num2);
                              System.out.println("La división de los números es: " + reso + "\n");}
                              continue;
                        case 5:
                              System.out.println("Seguro desea salir?");
                              System.out.println("[S/N]");
                              String resp = leer.next();
                              if (resp.equalsIgnoreCase("s")) {
                                    break;
                              } else if (resp.equalsIgnoreCase("n")) {
                                    continue;
                              } else {
                                    System.out.println("Ingrese una opción válida.");
                                    continue;
                              }
                        default:
                              System.out.println("Ingrese una opción correcta.");
                  }
                  break;
            } while (true);      
      }      
      public static double sumar(double num1, double num2){
            return num1 + num2;
      }
      public static double restar(double num1, double num2){
            return num1 - num2;
      }
      public static double multiplicar(double num1, double num2){
            return num1 * num2;
      }
      public static double dividir(double num1, double num2){
            return num1 / num2;
    }
}
