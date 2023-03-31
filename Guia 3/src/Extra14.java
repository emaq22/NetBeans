import java.util.Scanner;

public class Extra14 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            //Se ingresa la cantidad de familias
            System.out.print("Introduce la cantidad de familias: ");
            int numFamilias = sc.nextInt();
            //Se inicializan variables en 0, una va a sumar las edades y la otra los hijos de todas las familias
            int sumaEdades = 0;
            int totalHijos = 0;
            for (int i = 1; i <= numFamilias; i++) {
                  //Se pide cantidad de hijos de cada familia
                  System.out.print("Introduce la cantidad de hijos de la familia " + i + ": ");
                  int numHijos = sc.nextInt();
                  //Se suman los hijos en la variable totalHijos
                  totalHijos += numHijos;
                  //Se inicializa una variable que va a guardar la sumas de las edades de cada familia
                  //para despues pasarla a una variable que va a sumar todo
                  int sumaEdadesFamilia = 0;
                  //Dentro del bucle se piden las edades de los hijos segun cuantos tenga cada familia
                  for (int j = 1; j <= numHijos; j++) {
                        System.out.print("Edad del hijo " + j + " de la familia " + i + ": ");
                        int edad = sc.nextInt();
                        sumaEdadesFamilia += edad;
                  }
                  sumaEdades += sumaEdadesFamilia;
            }
            double mediaEdadTotal = (double) sumaEdades / totalHijos;
            System.out.println("La media de edad de los hijos de todas las familias es: " + mediaEdadTotal);
      } 
}
/*
Este programa funciona para cualquier cantidad de hijos en cada familia, 
ya que acumula la cantidad total de hijos de todas las familias y la suma 
de las edades de todos los hijos de todas las familias. Luego, utiliza estas v
ariables para calcular la media de edad total de todos los hijos.
*/