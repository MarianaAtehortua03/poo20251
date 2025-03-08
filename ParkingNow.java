public class ParkingNow {
    // 0 = vacío, 1 = ocupado
    static int[] parqueaderoBajo = new int[20];
    static int[] parqueaderoAlto = new int[10];
    public static void main(String[] args) {
        System.out.println("Estado inicial del parqueadero:");
        mostrarDisponibilidad();

        // simulacin de registro de una moto en bajo cilindraje (puesto 0)
        parqueaderoBajo[0] = 1;

        // simulacion de registro de una moto en alto cilindraje (puesto 0)
        parqueaderoAlto[0] = 1;

        System.out.println("\nDespués de registrar 2 motos:");
        mostrarDisponibilidad();
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
