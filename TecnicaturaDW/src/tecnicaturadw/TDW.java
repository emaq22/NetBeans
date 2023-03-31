package tecnicaturadw;


import java.util.Scanner;

public class TDW {
      
      public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese la base del triángulo");
            int base = leer.nextInt();
            System.out.println("Ingrese la altura del triángulo");
            int altura = leer.nextInt();
            
            System.out.println("La superficie del triángulo es: "+((base*altura)/2));
      }
}
