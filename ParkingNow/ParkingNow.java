package ParkingNow;

import java.util.Scanner;

public class ParkingNow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parqueadero parqueadero = new Parqueadero();

        int opcion;
        do {
            System.out.println("\n--Menu Principal--");
            System.out.println("1. Registrar moto");
            System.out.println("2. Cobrar y retirar moto");
            System.out.println("3. Mostrar disponibilidad");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

        } while (opcion != 4);
        
        scanner.close();
    }
}
