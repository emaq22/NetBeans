package Curso;

import java.util.Scanner;

public class Dia3_2 {

      private static final String ABECEDARIO = "abcdefghijklmnñopqrstuvwxyz ";

      public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            System.out.print("Ingrese el mensaje: ");
            String mensaje = leer.nextLine();
            System.out.print("Ingrese el número de desplazamiento: ");
            int desplazamiento = leer.nextInt();
            leer.nextLine();
            System.out.print("¿Desea codificar o decodificar el mensaje? (c/d): ");
            String opcion = leer.nextLine();
            String mensajeProcesado;
            switch (opcion)
            {
                  case "c":
                        mensajeProcesado = codificar(mensaje, desplazamiento);
                        System.out.println("Mensaje codificado: " + mensajeProcesado);
                        break;
                  case "d":
                        mensajeProcesado = decodificar(mensaje, desplazamiento);
                        System.out.println("Mensaje decodificado: " + mensajeProcesado);
                        break;
                  default:
                        System.out.println("Opción inválida");
                        break;
            }
      }

      public static String codificar(String mensaje, int desplazamiento) {
            StringBuilder mensajeCodificado = new StringBuilder();
            for (int i = 0; i < mensaje.length(); i++) {
                  char caracter = mensaje.charAt(i);
                  int indice = ABECEDARIO.indexOf(caracter);
                  if (indice != -1) {
                        indice = (indice + desplazamiento) % ABECEDARIO.length();
                        caracter = ABECEDARIO.charAt(indice);
                  }
                  mensajeCodificado.append(caracter);
            }
            return mensajeCodificado.toString();
      }

      public static String decodificar(String mensaje, int desplazamiento) {
            StringBuilder mensajeDecodificado = new StringBuilder();
            for (int i = 0; i < mensaje.length(); i++) {
                  char caracter = mensaje.charAt(i);
                  int indice = ABECEDARIO.indexOf(caracter);
                  if (indice != -1) {
                        indice = (indice - desplazamiento + ABECEDARIO.length()) % ABECEDARIO.length();
                        caracter = ABECEDARIO.charAt(indice);
                  }
                  mensajeDecodificado.append(caracter);
            }
            return mensajeDecodificado.toString();
      }
}