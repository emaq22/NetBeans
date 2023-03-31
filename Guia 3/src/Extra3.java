
import java.util.Scanner;

public class Extra3 {

      public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Ingrese una letra: ");
            String letra = leer.nextLine();
            
            if (letra.length() == 1) { // Verificar que se haya ingresado una sola letra
                  if (letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")){
                        System.out.println("La letra ingresada es una vocal");
                  } else {
                        System.out.println("La letra ingresada es una consonante");
                  }
            } else {
                  System.out.println("Debe ingresar solo una letra."); 
            }
      }    
}