
package Extra4;

import java.util.Scanner;


public class Extra4_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        //Verifica que el número ingresado esté dentro del rango permitido (1 a 10). Si no lo está, volverá al paso 1.
        do {
            System.out.print("Ingresa un número entre 1 y 10: ");
            numero = scanner.nextInt();
        } while (numero < 1 || numero > 10);
        
        //Crea un array con los valores correspondientes a cada número romano (I, II, III, IV, V, VI, VII, VIII, IX, X).
        String[] numerosRomanos = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        
        /*Mostrar en pantalla el valor correspondiente al número ingresado por el usuario, 
        utilizando el array creado en el paso anterior.*/
        System.out.println("El número " + numero + " en números romanos es: " + numerosRomanos[numero-1]);
      }
}