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

    // metodo para registrar moto en un puesto
    public void registrarMoto() {
        System.out.println("Seleccione tipo de moto:");
        System.out.println("1. Moto de bajo cilindraje (≤ 400cc)");
        System.out.println("2. Moto de alto cilindraje (> 400cc)");
        int tipo = scanner.nextInt();

        Moto nuevaMoto = new Moto(tipo); //se crea la moto con tipo 1 o 2
        boolean registrado = false;

        if (tipo == 1) {
            registrado = asignarPuesto(nuevaMoto, bajoCilindraje);
        } else if (tipo == 2) {
            registrado = asignarPuesto(nuevaMoto, altoCilindraje);
        } else {
            System.out.println("Opcion no valida");
            return;
        }

        if (!registrado) {
            System.out.println("Puesto no disponible o fuera de rango");
        }
    }

    //metodo para asignar un puesto
    private boolean asignarPuesto(Moto moto, Moto[] parqueo) {
        System.out.print("Ingrese el numero de puesto (1-" + parqueo.length + "): ");
        int puesto = scanner.nextInt() - 1;

        if (puesto >= 0 && puesto < parqueo.length && parqueo[puesto] == null) {
            parqueo[puesto] = moto;
            System.out.println("Moto registrada en el puesto " + (puesto + 1));
            return true;
        }
        return false;
    }

    //mostrar disponibilidad de puestos
    public void mostrarDisponibilidad() {
        System.out.println("Bajo Cilindraje:");
        mostrarMatriz(bajoCilindraje);
        System.out.println("\nAlto Cilindraje:");
        mostrarMatriz(altoCilindraje);
    }

    private void mostrarMatriz(Moto[] parqueo) {
        for (int i = 0; i < parqueo.length; i++) {
            System.out.print((parqueo[i] == null ? "0 " : "1 "));
            if ((i + 1) % 5 == 0) System.out.println();
        }
    }

    //metodo para cobrar y retirar moto
    public void cobrarMoto() {
        System.out.println("Seleccione tipo de moto:");
        System.out.println("1. Moto de bajo cilindraje (≤ 400cc)");
        System.out.println("2. Moto de alto cilindraje (> 400cc)");
        int tipo = scanner.nextInt();

        Moto[] parqueo = (tipo == 1) ? bajoCilindraje : altoCilindraje;

        System.out.print("Ingrese el numero de puesto: ");
        int puesto = scanner.nextInt() - 1;

        if (puesto >= 0 && puesto < parqueo.length && parqueo[puesto] != null) {
            System.out.print("Ingrese tiempo en minutos: ");
            int tiempo = scanner.nextInt();

            int cobro = calcularCobro(tiempo);
            System.out.println("El cobro es: $" + cobro);
            System.out.print("Desea pagar? (1: Sí, 2: No): ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                parqueo[puesto] = null;
                System.out.println("Pago realizado. Moto retirada");
            } else {
                System.out.println("Operacion cancelada, la moto sigue en su puesto");
            }
        } else {
            System.out.println("Puesto invalido o vacio");
        }
    }
    private int calcularCobro(int tiempo) {
        if (tiempo <= 30) return 0;
        if (tiempo <= 60) return 800;
        return 2000;
    }
}
