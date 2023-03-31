
package guia.pkg4;

import java.util.Scanner;


public class Ej2 {


      public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            String nombre,resp;
            int edad;
            do {                  
                  System.out.println("Ingrese el nombre de la persona.");
                  nombre = leer.next();
                  System.out.println("Ingrese la edad de la persona.");
                  edad=leer.nextInt();
                  mayores(nombre,edad);
                  System.out.println("¿Desea seguir?"+"\n [S/N]");
                  resp=leer.next();
            } while (!resp.equalsIgnoreCase("n"));
      }
      
      public static void mayores(String nombre, int edad){
         
            if (edad>18){
                  System.out.println(nombre + " es mayor de edad.");
            } else {
                  System.out.println(nombre + " es menor de edad.");
            }               
      }
}
