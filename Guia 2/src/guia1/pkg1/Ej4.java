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
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float centigrados;
        System.out.println("Ingrese la temperatura en C°");
        centigrados=leer.nextFloat();
        System.out.println("La temperatura ingresada en Fahrenheit es de: F°" + (32+(9*centigrados/5)));
        
    }
    
}
