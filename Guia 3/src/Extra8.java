
import java.util.Scanner;



public class Extra8 {

    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
          System.out.println("Ingrese valores enteros positivos" + "\nNOTA: El programa se detendra si ingresa un múltiplo de 5");
          int num, i=0 , k=0, l=0;
          do {
                  System.out.println("Ingrese el " + (i+1) + "° número.");
                  num = leer.nextInt();
                  
                  /*
                  Esta es otra forma de evaluar si el número es mayor a 0
                  
                  if (numero < 0) {
                        continue; // Ignoramos los números negativos
                  }
                  */
                  
                  //se evalua si el valor es mayor a 0, en caso de ser se  ingresa
                  if (num>0) {
                        //si el numero es par se contabiliza, lo mismo si es impar en el "else if"
                        if (num%2==0){
                              k++;
                        } else if(num%2==1){
                              l++;
                        }
                  }
                  
                  //se incrementa el contador
                  i++;
                  
                  //se evalua si el numero es multiplo de 5, en caso de serlo se muestra el mensaje y se ejecuta 
                  //la senctencia "break", el cual hace salir del bucle
                  if(num%5==0){
                        System.out.println("Ingresó un múltiplo de 5.");
                        break;
                  }
                  
            } while (true);
            
            System.out.println("Se ingresaron un total de " + i + " números.");
            System.out.println(k + " números fueron pares.");
            System.out.println(l + " números fueron impares.");
    }

}
