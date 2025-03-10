public class ParkingNow {
    // 0 = vacío, 1 = ocupado
    static int[] parqueaderoBajo = new int[20];
    static int[] parqueaderoAlto = new int[10];

    public static void main(String[] args) {
        System.out.println("Estado inicial del parqueadero:");
        mostrarDisponibilidad();

        // Simulacion de registro de motos
        registrarMoto(300); // Moto de bajo cilindraje
        registrarMoto(600); // Moto de alto cilindraje

        System.out.println("\nDespués de registrar 2 motos:");
        mostrarDisponibilidad();
    }

    public static void registrarMoto(int cilindraje) {
        if (cilindraje < 400) { // Motos de bajo cilindraje
            for (int i = 0; i < parqueaderoBajo.length; i++) {
                if (parqueaderoBajo[i] == 0) { // Encuentra un puesto vacio
                    parqueaderoBajo[i] = 1; // Lo ocupa
                    System.out.println("Moto registrada en puesto " + (i + 1) + " (bajo cilindraje).");
                    return;
                }
            }
        } else { // Motos de alto cilindraje
            for (int i = 0; i < parqueaderoAlto.length; i++) {
                if (parqueaderoAlto[i] == 0) { // Encuentra un puesto vacio
                    parqueaderoAlto[i] = 1; // Lo ocupa
                    System.out.println("Moto registrada en puesto " + (i + 1) + " (alto cilindraje).");
                    return;
                }
            }
        }
        System.out.println("No hay puestos disponibles para este tipo de moto");
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
