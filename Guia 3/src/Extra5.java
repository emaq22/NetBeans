
import java.util.Scanner;



public class Extra5 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la clase del socio (A, B o C): ");
        char clase = scanner.nextLine().charAt(0);

        System.out.print("Ingrese el costo del tratamiento: ");
        double costoTratamiento = scanner.nextDouble();

        double importeAPagar = costoTratamiento;

        if (clase == 'A') {
            importeAPagar = costoTratamiento / 2.0;
        } else if (clase == 'B') {
            importeAPagar = costoTratamiento * 0.65;
        }

        System.out.println("El importe a pagar es: $" + importeAPagar);
    }

}
