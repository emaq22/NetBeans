/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pc
 */
public class Extra2 {

      /**
       * @param args the command line arguments
       */
      public static void main(String[] args) {
            int A = 1;
            int B = 10;
            int C = 50;
            int D = 100;
            int aux = 0;
            System.out.println("A = " +A);
            System.out.println("B = " +B);
            System.out.println("C = " +C);
            System.out.println("D = " +D + "\n" +"\n") ;
            
            aux=B;
            B=C;
            C=A;
            A=D;
            D=aux;
            
            System.out.println("A = " +A);
            System.out.println("B = " +B);
            System.out.println("C = " + C);
            System.out.println("D = " + D);
            
      }
      
}
