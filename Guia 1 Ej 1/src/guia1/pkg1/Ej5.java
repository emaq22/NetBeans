/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1.pkg1;

import java.util.Scanner;
/**
 *
 * @author Pc
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num ;
        System.out.println("Ingrese un número.");
        num = leer.nextInt();
        System.out.println("La raíz cuadrada de su número es: " + Math.sqrt(num));
        System.out.println("El doble del número ingresado es de: " + num*2);
        System.out.println("El triple del número ingresado es de:" + num*3);
    }
    private String atribut1;
    
    private String atribut2;
    
}
