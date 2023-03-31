package dia.pkg4;




import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Dia4 {

      public static void main(String[] args) {
            
            
            // Obtener la ruta del archivo y el tipo de operación (suma o multiplicación) por parámetro
            String archivo = args[0];
            String operacion = args[1];

            try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                  String linea;
                  int resultado = 0;
                  int multiplicacion = 1;
                  while ((linea = br.readLine()) != null) {
                        int numero = Integer.parseInt(linea);
                        resultado += numero;
                        multiplicacion *= numero;
                  }

                  switch (operacion)
                  {
                        case "suma":
                              System.out.println("La suma de los números es: " + resultado);
                              break;
                        case "multiplicacion":
                              System.out.println("La multiplicación de los números es: " + multiplicacion);
                              break;
                        default:
                              System.out.println("Operación inválida");
                              break;
                  }
            } catch (IOException e) {
                  System.out.println("Error al leer el archivo");
            } catch (NumberFormatException e) {
                  System.out.println("El archivo contiene un número inválido");
            }
      }
}