/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1.pkg1;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/**
 *
 * @author Pc
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase.");
        String frase = leer.nextLine();
        System.out.println(frase);
        System.out.println("Su frase en mayúsculas: " + frase.toUpperCase());
        System.out.println("Su frase en minúsculas: " + toLowerCase(frase));
                        
    }
    
}
