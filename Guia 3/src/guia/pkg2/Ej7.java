
package guia.pkg2;

import java.util.Scanner;

public class Ej7 {


      public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;

        while (true) {
            System.out.print("Ingrese una cadena (&&&&& para terminar): ");
            String cadena = leer.nextLine();

            if (cadena.equals("&&&&&")) {
                break;
            }

            if (cadena.length() == 5 && cadena.charAt(0) == 'X' && cadena.charAt(4) == 'O') {
                correctas++;
            } else {
                incorrectas++;
            }
        }

        System.out.println("Informe de lecturas:");
        System.out.println("Lecturas correctas: " + correctas);
        System.out.println("Lecturas incorrectas: " + incorrectas);
      }
      
}
