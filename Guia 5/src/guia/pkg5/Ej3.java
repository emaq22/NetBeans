
package guia.pkg5;

import java.util.Random;
import java.util.Scanner;

/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
*/

public class Ej3 {

      public static void main(String[] args) {
            Random rand = new Random();
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Ingrese la dimension del vector.");
            int dim = leer.nextInt(), res = 0, cont;
            int[] vector = new int[dim];
            int dig1=0, dig2=0, dig3=0, dig4=0, dig5=0;
            
            for (int i = 0; i < dim; i++){
                  vector[i] = rand.nextInt(9);
            }
            for (int i = 0; i < dim; i++){
                  cont = 0;
                  res = vector[i];
                  do{                        
                        res /= 10; 
                        cont++;
                  } while (res>0);
                  if (cont==1){
                        dig1++;
                  } else if (cont==2){
                        dig2++;
                  } else if (cont==3){
                        dig3++;
                  } else if (cont==4){
                        dig4++;
                  } else if (cont==5){
                        dig5++;
                  }
            }
            System.out.println(dig1);
            System.out.println(dig2);
            System.out.println(dig3);
            System.out.println(dig4);
            System.out.println(dig5);
      }

}
