package Curso;
import java.util.Scanner;
public class Dia1 {

      public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese los ingresos mensuales totales del hogar:");
            float ingresos = leer.nextFloat();
            System.out.println("Ingrese el número de vehículos con antigüedad menor a 5 años:");
            int vehiculos = leer.nextInt();
            System.out.println("Ingrese el número de inmuebles:");
            int inmuebles = leer.nextInt();
            System.out.println("¿Posee una embarcación, una aeronave de lujo o es titular de activos societarios? (s/n):");
            String respuesta = leer.next();
            boolean activos = (respuesta.equalsIgnoreCase("s") ? true : false);
        
            if (ingresos >= 489083 || vehiculos >= 3 || inmuebles >= 3 || activos) {
                  System.out.println("La persona pertenece al segmento de ingresos altos.");
            } else {
                  System.out.println("La persona no pertenece al segmento de ingresos altos.");
            }
      }
}
