
package guia.pkg5;


public class Ej4 {

      public static void main(String[] args) {
            
            int[][] matriz = new int[4][4];
            int[][] transpuesta = new int[4][4];
            
            
            for (int i = 0; i < 4; i++){
                  for (int j = 0; j < 4; j++){
                        matriz[i][j] = (int)(Math.random() * (10 - (-10)) + (-10));
                  }
            }
            System.out.println("Matriz Original; \n");
            for (int i = 0; i < 4; i++){
                  for (int j = 0; j < 4; j++){
                        System.out.print("\t" + "[" + matriz[i][j] + "]");
                  }
                  System.out.println("");
            }
            for (int i = 0; i < 4; i++){
                  for (int j = 0; j < 4; j++){
                        transpuesta[j][i] = matriz [i][j];
                  }
            }
            
            System.out.println("\n Matriz Transpuesta: \n");
            for (int i = 0; i < 4; i++){
                  for (int j = 0; j < 4; j++){
                        System.out.print("\t" + "[" + transpuesta[i][j] + "]");
                  }
                  System.out.println("");
            }
            
      }
}
