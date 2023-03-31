package tecnicaturadw;


import java.util.Scanner;


public class TecDW {

      
      public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            //Se inicializa una varaible para el numero que se va a ingresar
            int num;
            //Dentro del bucle se evalua si el número es o no primo
            do {
                  System.out.println("Ingrese un numero para saber si es primo.");
                  num = leer.nextInt();
                  //Si el numero ingresado es 0 o 1 envia mensaje y vuelve al inicio
                  if (num<=1){
                        System.out.println("El número ingresado no es primo");
                        continue;
                  }
                  int primo = 0;
                  for (int i = 1; i <= num; i++) {
                        if (num % i == 0) 
                              primo++;     
                  }
                  if (primo==2)
                        System.out.println("El número ingresado es primo" + "\n");
                   else 
                        System.out.println("El número ingresado no es primo" + "\n");
            } while (true);
      }
}
