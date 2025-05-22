import java.util.Scanner;

// Clase principal que controla el flujo del juego de lucha
public class JuegoLucha {

    // Método principal que inicia el juego
    public static void main(String[] args) {
        iniciarPelea(); // Llama al método que contiene la lógica del combate
    }

    // Método que orquesta la pelea entre el Cazador y el Hechicero
    public static void iniciarPelea() {
        Scanner scanner = new Scanner(System.in);

        // Solicita y guarda el nombre del Cazador
        System.out.print("Nombre del Cazador: ");
        String nombreCazador = scanner.nextLine();

        // Crea un arma y un objeto Cazador con nombre y arma
        Arma arco = new Arma("Arco", 5);
        Cazador cazador = new Cazador(nombreCazador, arco);

        // Solicita y guarda el nombre del Hechicero
        System.out.print("Nombre del Hechicero: ");
        String nombreHechicero = scanner.nextLine();

        // Crea un arma y un objeto Hechicero con nombre y arma
        Arma baston = new Arma("Bastón", 8);
        Hechicero hechicero = new Hechicero(nombreHechicero, baston);

        // Inicia la pelea e imprime mensaje inicial
        System.out.println("\n¡Comienza la batalla!");

        // Ciclo que se repite mientras ambos personajes estén vivos
        while (cazador.estaVivo() && hechicero.estaVivo()) {
            // Turno del Cazador
            cazador.atacar(hechicero);

            // Si el Hechicero aún vive, contraataca
            if (hechicero.estaVivo()) {
                hechicero.atacar(cazador);
            }

            // Muestra los puntos de vida actuales de ambos personajes
            System.out.println("→ " + cazador.getNombre() + ": " + cazador.getPuntosDeVida() + " PV");
            System.out.println("→ " + hechicero.getNombre() + ": " + hechicero.getPuntosDeVida() + " PV");
            System.out.println("---------------------------------");

            // Pausa entre turnos para mejor visualización
            try {
                Thread.sleep(1000); // 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Imprime el resultado final de la pelea
        if (cazador.estaVivo()) {
            System.out.println(cazador.getNombre() + " ha ganado la batalla!");
        } else {
            System.out.println(hechicero.getNombre() + " ha ganado la batalla!");
        }

        scanner.close(); // Cierra el escáner al final del juego
    }
}
