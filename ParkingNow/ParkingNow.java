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

            switch (opcion) {
                case 1:
                    parqueadero.registrarMoto();
                    break;
                case 2:
                    parqueadero.cobrarMoto();
                    break;
                case 3:
                    parqueadero.mostrarDisponibilidad();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("opcion no valida");
            }

        } while (opcion != 4);
        
        scanner.close();
    }
}
