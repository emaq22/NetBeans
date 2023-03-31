
import java.util.Scanner;



public class Extra6 {

      public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            double altura, promM=0, promG=0, sumaM=0, suma=0;
            int cont=0, contM=0;
            String resp;
            do {                  
                  System.out.println("Ingrese la altura de la persona.");
                  altura = leer.nextDouble();
                  suma += altura;
                  cont++;
                  if (altura<=1.6){
                        sumaM += altura;
                        contM++;
                  }
                  System.out.println("¿Desea continuar?" + "\n[S/N]");
                  resp = leer.next();
                  } while (!"n".equalsIgnoreCase(resp));
            promM=sumaM/contM;
            promG=suma/cont;
            System.out.println("Se determinó el siguiente promedio:");
            System.out.println("Promedio de las estaturas menores a 1.60: "+ promM);
            System.out.println("Promedio de las estaturas mayores a 1.60: "+ promG);
      }
}
/*
      Scanner sc = new Scanner(System.in);
      int n;
      double sumaTotal = 0, sumaBajo160 = 0;
      int contadorBajo160 = 0;

      System.out.print("Ingrese el número de personas: ");
      n = sc.nextInt();

      // Pedimos la altura de cada persona y hacemos los cálculos correspondientes
      for (int i = 0; i < n; i++) {
         System.out.print("Ingrese la altura de la persona " + (i+1) + " en metros: ");
         double altura = sc.nextDouble();
         sumaTotal += altura;
         if (altura < 1.60) {
            sumaBajo160 += altura;
            contadorBajo160++;
         }
      }

      // Calculamos los promedios
      double promedioTotal = sumaTotal / n;
      double promedioBajo160 = contadorBajo160 == 0 ? 0 : sumaBajo160 / contadorBajo160;

      // Mostramos los resultados
      System.out.println("El promedio de estaturas en general es de: " + promedioTotal + " metros");
      System.out.println("El promedio de estaturas por debajo de 1.60 metros es de: " + promedioBajo160 + " metros");
   }
}

*/