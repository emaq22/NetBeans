
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pc
 */
public class Extra4 {

      /**
       * @param args the command line arguments
       */
      public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            int num;
            
            do {
                  System.out.println("Ingrese un número");
                  num = leer.nextInt();
                  switch (num)
                  {
                        case 1:
                              System.out.println("I"+"\n");
                              continue;
                        case 2:
                              System.out.println("II"+"\n");
                              continue;
                        case 3:
                              System.out.println("III"+"\n");
                              continue;
                        case 4:
                              System.out.println("IV"+"\n");
                              continue;
                        case 5:
                              System.out.println("V"+"\n");
                              continue;      
                        case 6:
                              System.out.println("VI"+"\n");
                              continue;      
                        case 7:
                              System.out.println("VII"+"\n");
                              continue;      
                        case 8:
                              System.out.println("VIII"+"\n");
                              continue;
                        case 9:
                              System.out.println("IX"+"\n");
                              continue;
                        case 10:
                              System.out.println("X"+"\n");
                              continue;
                        case 0:
                              System.out.println("Saliendo");
                              break;      
                        default:
                              System.out.println("Ingrese otra opción");
                  }
    
            } while (num!=0);
      }
      
}
