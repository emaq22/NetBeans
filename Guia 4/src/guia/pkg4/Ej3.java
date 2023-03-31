
package guia.pkg4;

import java.util.Scanner;


public class Ej3 {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce la cantidad de euros: ");
            double cantidad = sc.nextDouble();
            System.out.print("Introduce la moneda a convertir" + "\n(libras, dólares o yenes): ");
            String moneda = sc.next();
            convertirEuros(cantidad, moneda);
      }

    public static void convertirEuros(double cantidad, String moneda) {
            double cambio = 0;
            switch (moneda) {
                  case "libras":
                        cambio = cantidad * 0.86;
                        System.out.printf("%.2f euros son %.2f libras.", cantidad, cambio);
                        break;
                  case "dolares":
                        cambio = cantidad * 1.28611;
                        System.out.printf("%.2f euros son %.2f dólares.", cantidad, cambio);
                        break;
                  case "yenes":
                        cambio = cantidad * 129.852;
                        System.out.printf("%.2f euros son %.2f yenes.", cantidad, cambio);
                        break;
                  default:
                        System.out.println("Moneda no válida.");
                        break;
        }
    }

}
