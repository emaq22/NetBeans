/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg11.pkg12;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ejercicio11 {

      public static String cambio(String frase) {
                  String retorno = "";
            for (int i = 0; i < frase.length(); i++) {
                  char c = frase.charAt(i);
                  if (Character.toLowerCase(c) == 'a' || Character.toLowerCase(c) == 'e' || 
                      Character.toLowerCase(c) == 'i' || Character.toLowerCase(c) == 'o' ||
                      Character.toLowerCase(c) == 'u') {
                        switch(Character.toLowerCase(c)) {
                              case 'a':
                                  retorno += "@";
                                  break;
                              case 'e':
                                  retorno += "#";
                                  break;
                              case 'i':
                                  retorno += "$";
                                  break;
                              case 'o':
                                  retorno += "%";
                                  break;
                              case 'u':
                                  retorno += "^";
                                  break;
                        }
                  } else {
                      retorno += c;
                  }
            }
            return retorno;
      }
      
      
      public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese una palabra o frase");
            String frase = leer.nextLine(),r;
            r = cambio(frase);
            System.out.println("Su frase modificada quedó:"+"\n" + r);
      }
      
}
