
//Debajo está todo explicado a detalle

public class Extra12 {

      public static void main(String[] args) {
            for (int i = 0; i < 1000; i++) {
                  String numero = String.format("%03d", i);
                  String numero_con_E = numero.replace("3", "E");
                  System.out.println(numero_con_E.charAt(0) + "-" + numero_con_E.charAt(1) + "-" + numero_con_E.charAt(2));
            }
      }
}
/*
En este programa, utilizamos un bucle for para recorrer los números del 0 al 999. 
Para cada número, utilizamos el método String.format para formatear el número con 
3 dígitos, agregando ceros a la izquierda si es necesario. Luego, utilizamos el 
método String.replace para reemplazar cualquier ocurrencia del número 3 por la 
letra E.

Finalmente, imprimimos cada número con formato X-X-X en la consola utilizando el 
método charAt de la clase String para obtener cada dígito individualmente.

*******
*******

Es importante aclarar qué hace la línea de código:

String numero = String.format("%03d", i);

Esta línea utiliza el método String.format para formatear el número i con 3 dígitos, 
agregando ceros a la izquierda si es necesario. El símbolo % indica que se va a 
sustituir por un valor, el número 3 indica que se van a utilizar 3 dígitos para el 
número y la letra d indica que se trata de un número entero. El 0 antes del 3 indica 
que, en caso de que el número tenga menos de 3 dígitos, se rellenará con ceros a la 
izquierda.

Por ejemplo, si i es igual a 7, la línea de código anterior devolverá el siguiente String:

007

De esta manera, se asegura que todos los números tengan 3 dígitos, incluso los que tienen 
ceros a la izquierda.

*******
*******

Te explico qué hace la línea de código:

String numero_con_E = numero.replace("3", "E");

Esta línea utiliza el método replace de la clase String para reemplazar cualquier ocurrencia 
del número 3 por la letra E. El método replace busca en la cadena el primer parámetro 
(en este caso, el número 3) y lo reemplaza por el segundo parámetro (la letra E).

Por ejemplo, si numero es igual a "305", la línea de código anterior devolverá el siguiente String:

E05

De esta manera, se cumple con la particularidad de reemplazar cualquier ocurrencia del número 
3 por la letra E.
*/