import java.util.Scanner;

public class ParkingNow {
    //arreglos que representan los puestos del parqueadero
    // 0 = vacío, 1 = ocupado
    static int[] parqueaderoBajo = new int[20];
    static int[] parqueaderoAlto = new int[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ejecutando = true;

        while (ejecutando) {
            System.out.println("\n---Menu Principal---");
            System.out.println("1. Registrar moto");
            System.out.println("2. Cobrar y retirar moto");
            System.out.println("3. Mostrar disponibilidad");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            
            //validacion de entrada del usuario
            if (!scanner.hasNextInt()) {  
                System.out.println("Error debe ingresar un numero valido.");
                scanner.next();  
                continue;
            }

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    registrarMoto(scanner);
                    break;
                case 2:
                    retirarMoto(scanner);
                    break;
                case 3:
                    mostrarDisponibilidad();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    ejecutando = false;
                    break;
                default:
                    System.out.println("Opcion invalida intente nuevamente.");
            }
        }
        scanner.close();
    }

    // Metodo para registrar una moto en el parqueadero
    public static void registrarMoto(Scanner scanner) {
        System.out.print("Ingrese el cilindraje de la moto: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Error ingrese un numero valido.");
            scanner.next();
            return;
        }
        int cilindraje = scanner.nextInt();

        System.out.print("Ingrese el puesto donde desea estacionar (1-20 para bajo cilindraje, 1-10 para alto cilindraje): ");
        if (!scanner.hasNextInt()) {
            System.out.println("Error ingrese un numero valido.");
            scanner.next();
            return;
        }
        int puesto = scanner.nextInt();

        //verificacion de si es bajo o alto cilindraje y asignar puesto disponible
        if (cilindraje < 400) {  
            if (puesto >= 1 && puesto <= 20 && parqueaderoBajo[puesto - 1] == 0) {
                parqueaderoBajo[puesto - 1] = 1;
                System.out.println("Moto registrada en puesto " + puesto + " (bajo cilindraje).");
            } else {
                System.out.println("Ese puesto no existe o ya esta ocupado");
            }
        } else {  
            if (puesto >= 1 && puesto <= 10 && parqueaderoAlto[puesto - 1] == 0) {
                parqueaderoAlto[puesto - 1] = 1;
                System.out.println("Moto registrada en puesto " + puesto + " (alto cilindraje).");
            } else {
                System.out.println("Ese puesto no existe o ya esta ocupado");
            }
        }
    }

    //Metodo para retirar una moto y calcular la tarifa
    public static void retirarMoto(Scanner scanner) {
        System.out.print("Ingrese el cilindraje de la moto a retirar: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Error ingrese un número valido");
            scanner.next();
            return;
        }
        int cilindraje = scanner.nextInt();

        System.out.print("Ingrese el puesto de la moto a retirar: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Error ingrese un numero valido");
            scanner.next();
            return;
        }
        int puesto = scanner.nextInt();

        if (cilindraje < 400) {  
            if (puesto >= 1 && puesto <= 20 && parqueaderoBajo[puesto - 1] == 1) {
                System.out.print("Ingrese los minutos que estuvo la moto estacionada: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Error ingrese un numero valido");
                    scanner.next();
                    return;
                }
                int minutos = scanner.nextInt();
                if (minutos < 0) {
                    System.out.println("Error el tiempo no puede ser negativo");
                    return;
                }
                int tarifa = calcularTarifa(minutos);
                System.out.println("Total a pagar: $" + tarifa);
                System.out.print("Confirmar pago (1 = Sí, 2 = No): ");
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
        } else {  
            if (puesto >= 1 && puesto <= 10 && parqueaderoAlto[puesto - 1] == 1) {
                System.out.print("Ingrese los minutos que estuvo la moto estacionada: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Error ingrese un numero valido.");
                    scanner.next();
                    return;
                }
                int minutos = scanner.nextInt();
                if (minutos < 0) {
                    System.out.println("Error el tiempo no puede ser negativo.");
                    return;
                }
                int tarifa = calcularTarifa(minutos);
                System.out.println("Total a pagar: $" + tarifa);
                System.out.print("Confirmar pago (1 = Sí, 2 = No): ");
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

    //metodo para calcular la tarifa de estacionamiento según el tiempo transcurrido
    public static int calcularTarifa(int minutos) {
        if (minutos <= 30) return 0;
        if (minutos <= 60) return 800;
        return 2000;
    }

    //metodo para mostrar la disponibilidad de puestos en el parqueadero
    public static void mostrarDisponibilidad() {
        System.out.println("\nBajo Cilindraje:");
        for (int i = 0; i < parqueaderoBajo.length; i++) {
            System.out.print(parqueaderoBajo[i] + " ");
            if ((i + 1) % 5 == 0) System.out.println();
        }
        System.out.println("\nAlto Cilindraje:");
        for (int i = 0; i < parqueaderoAlto.length; i++) {
            System.out.print(parqueaderoAlto[i] + " ");
            if ((i + 1) % 5 == 0) System.out.println();
        }
    }
}

