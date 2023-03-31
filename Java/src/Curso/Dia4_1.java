
package Curso;

import java.util.Arrays;
import java.util.Scanner;


public class Dia4_1 {

      public static void main(String[] args) {
            int num1, num2, num3;
            String orden;

            if (args.length == 4) {
                  num1 = Integer.parseInt(args[0]);
                  num2 = Integer.parseInt(args[1]);
                  num3 = Integer.parseInt(args[2]);
                  orden = args[3];

                  int[] nums = {num1, num2, num3};
                  ordenar(nums, orden);

                  System.out.println(Arrays.toString(nums));
            } else {
                  Scanner leer = new Scanner(System.in);

                  System.out.print("Ingrese el primer número: ");
                  num1 = leer.nextInt();
                  System.out.print("Ingrese el segundo número: ");
                  num2 = leer.nextInt();
                  System.out.print("Ingrese el tercer número: ");
                  num3 = leer.nextInt();
                  leer.nextLine();
                  System.out.print("Ingrese el orden (ascendente/descendente): ");
                  orden = leer.nextLine();

                  int[] nums = {num1, num2, num3};
                  ordenar(nums, orden);

                  System.out.println(Arrays.toString(nums));
            }
      }

      public static void ordenar(int[] nums, String orden) {
            if (orden.equalsIgnoreCase("ascendente")) {
                  Arrays.sort(nums);
            } else if (orden.equalsIgnoreCase("descendente")) {
                  Arrays.sort(nums);
                  int i = 0;
                  int j = nums.length - 1;

                  while (i < j) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        i++;
                        j--;
                  }
            } else {
                  System.out.println("Orden inválido. Debe ser 'ascendente' o 'descendente'.");
            }
      }
}
