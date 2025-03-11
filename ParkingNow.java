import java.util.Scanner;

public class ParkingNow {
    // 0 = vacío, 1 = ocupado
    static int[] parqueaderoBajo = new int[20];
    static int[] parqueaderoAlto = new int[10];
    static int[] tiempoIngresoBajo = new int[20]; // Simulacion del tiempo de ingreso en minutos
    static int[] tiempoIngresoAlto = new int[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ejecutando = true;

        while (ejecutando) {
            System.out.println("\n---Menu Principal---");
            System.out.println("1. Registrar moto");
            System.out.println("2. Cobrar y retirar moto");
            System.out.println("3. Mostrar disponibilidad");
            System.out.println("4. salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el cilindraje de la moto: ");
                    int cilindraje = scanner.nextInt();
                    System.out.print("Ingrese el puesto donde desea estacionar (1-20 para bajo cilindraje, 1-10 para alto cilindraje): ");
                    int puesto = scanner.nextInt();
                    registrarMoto(cilindraje, puesto);
                    break;
                case 2:
                    System.out.print("Ingrese el cilindraje de la moto a retirar: ");
                    int cilindrajeRetiro = scanner.nextInt();
                    System.out.print("Ingrese el puesto de la moto a retirar: ");
                    int puestoRetiro = scanner.nextInt();
                    retirarMoto(cilindrajeRetiro, puestoRetiro);
                    break;
                case 3:
                    mostrarDisponibilidad();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    ejecutando = false;
                    break;
                default:
                    System.out.println("Opcion invalida intente nuevamente");
            }
        }
        scanner.close();
    }

    public static void registrarMoto(int cilindraje, int puesto) {
        if (cilindraje < 400) { // Motos de bajo cilindraje
            if (puesto >= 1 && puesto <= 20 && parqueaderoBajo[puesto - 1] == 0) {
                parqueaderoBajo[puesto - 1] = 1;
                tiempoIngresoBajo[puesto - 1] = (int) (Math.random() * 120); // Simulacion de tiempo entre 0 y 120 min
                System.out.println("Moto registrada en puesto " + puesto + " (bajo cilindraje).");
            } else {
                System.out.println("Ese puesto no existe o ya esta ocupado");
            }
        } else { // Motos de alto cilindraje
            if (puesto >= 1 && puesto <= 10 && parqueaderoAlto[puesto - 1] == 0) {
                parqueaderoAlto[puesto - 1] = 1;
                tiempoIngresoAlto[puesto - 1] = (int) (Math.random() * 120);
                System.out.println("Moto registrada en puesto " + puesto + " (alto cilindraje).");
            } else {
                System.out.println("Ese puesto no existe o ya esta ocupado");
            }
        }
    }

    public static void retirarMoto(int cilindraje, int puesto) {
        Scanner scanner = new Scanner(System.in);
        if (cilindraje < 400) { // Motos de bajo cilindraje
            if (puesto >= 1 && puesto <= 20 && parqueaderoBajo[puesto - 1] == 1) {
                System.out.print("Ingrese los minutos que estuvo la moto estacionada: ");
                int minutos = scanner.nextInt();
                while (minutos < 0) {
                    System.out.println("Error: El tiempo no puede ser negativo. Intente nuevamente.");
                    System.out.print("Ingrese los minutos que estuvo la moto estacionada: ");
                    minutos = scanner.nextInt();
                }
                int tarifa = calcularTarifa(minutos);
                System.out.println("Total a pagar: $" + tarifa);
                System.out.print("Confirmar pago (1 = Si, 2 = No): ");
                int confirmacion = scanner.nextInt();
                if (confirmacion == 1) {
                    parqueaderoBajo[puesto - 1] = 0;
                    System.out.println("Moto retirada del puesto " + puesto + " (bajo cilindraje).");
                } else {
                    System.out.println("Operacion cancelada");
                }
            } else {
                System.out.println("Ese puesto no existe o ya esta vacio");
            }
        } else { // Motos de alto cilindraje
            if (puesto >= 1 && puesto <= 10 && parqueaderoAlto[puesto - 1] == 1) {
                System.out.print("Ingrese los minutos que estuvo la moto estacionada: ");
                int minutos = scanner.nextInt();
                while (minutos < 0) {
                    System.out.println("Error: El tiempo no puede ser negativo. Intente nuevamente.");
                    System.out.print("Ingrese los minutos que estuvo la moto estacionada: ");
                    minutos = scanner.nextInt();
                }
                int tarifa = calcularTarifa(minutos);
                System.out.println("Total a pagar: $" + tarifa);
                System.out.print("Confirmar pago (1 = Si, 2 = No): ");
                int confirmacion = scanner.nextInt();
                if (confirmacion == 1) {
                    parqueaderoAlto[puesto - 1] = 0;
                    System.out.println("Moto retirada del puesto " + puesto + " (alto cilindraje).");
                } else {
                    System.out.println("Operacion cancelada");
                }
            } else {
                System.out.println("Ese puesto no existe o ya esta vacio");
            }
        }
    }

    public static int calcularTarifa(int minutos) {
        if (minutos <= 30) return 0;
        if (minutos <= 60) return 800;
        return 2000;
    }

    public static void mostrarDisponibilidad() {
        System.out.println("\nBajo Cilindraje:");
        for (int i = 0; i < parqueaderoBajo.length; i++) {
            System.out.print(parqueaderoBajo[i] + " ");
        }
        System.out.println("\n\nAlto Cilindraje:");
        for (int i = 0; i < parqueaderoAlto.length; i++) {
            System.out.print(parqueaderoAlto[i] + " ");
        }
        System.out.println("\n");
    }
}

