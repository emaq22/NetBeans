
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pc
 */
public class Extra1 {

      /**
       * @param args the command line arguments
       */
     
           public static void main(String[] args) {

        int minutos = 0;
        int cantDias = 0;
        int horas = 0;
        int dia = 1440;
        
        System.out.print("Ingrese candidad de minutos : ");

        Scanner read = new Scanner(System.in);
        minutos = read.nextInt();

        if (minutos >= dia) {
            cantDias = (minutos / 1440);
            horas = ((minutos % 1440)/60);
            
            System.out.println(cantDias + " dias" + " y " + horas + " horas");
        }

    }
      }
      
