package ParkingNow;

import java.util.Scanner;

public class Parqueadero {
    private Moto[] bajoCilindraje;
    private Moto[] altoCilindraje;
    private Scanner scanner;

    public Parqueadero() {
        bajoCilindraje = new Moto[20];
        altoCilindraje = new Moto[10];
        scanner = new Scanner(System.in);
    }

    // Metodo para registrar moto en un puesto
    public void registrarMoto() {
        System.out.print("Ingrese el cilindraje de la moto: ");
        int cilindraje = scanner.nextInt();
        
        Moto nuevaMoto = new Moto(cilindraje);
        boolean registrado = false;
        
        if (cilindraje < 400) {
            registrado = asignarPuesto(nuevaMoto, bajoCilindraje);
        } else {
            registrado = asignarPuesto(nuevaMoto, altoCilindraje);
        }

        if (!registrado) {
            System.out.println("Puesto no disponible o fuera de rango.");
        }
    }

}
