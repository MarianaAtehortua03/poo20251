import java.util.Scanner;

public class JuegoLucha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Se crean dos armas basicas
        Arma espada = new Arma("Espada", 2);
        Arma baston = new Arma("Bastón Mágico", 1);

        // Se piden los nombres de los jugadores
        System.out.print("Nombre del Cazador: ");
        String nombreCazador = scanner.nextLine();
        Personaje cazador = new Cazador(nombreCazador, espada);

        System.out.print("Nombre del Hechicero: ");
        String nombreHechicero = scanner.nextLine();
        Personaje hechicero = new Hechicero(nombreHechicero, baston);

        // Arreglo para manejar turnos facilmente
        Personaje[] jugadores = {cazador, hechicero};
        int turno = 0;

        // Bucle del combate hasta que uno pierda toda su vida
        while (cazador.estaVivo() && hechicero.estaVivo()) {
            Personaje actual = jugadores[turno % 2];
            Personaje oponente = jugadores[(turno + 1) % 2];

            System.out.println("\nTurno de " + actual.getNombre() + " (Vida: " + actual.getPuntosDeVida() + ")");
            System.out.print("Presiona 1 para atacar: ");
            int opcion = scanner.nextInt();

            // Solo hay una opcion: atacar
            if (opcion == 1) {
                actual.atacar(oponente);
            } else {
                System.out.println("Entrada invalida. Se ataca por defecto");
                actual.atacar(oponente);
            }

            turno++;
        }

        // Se anuncia al ganador
        if (cazador.estaVivo()) {
            System.out.println("\n¡" + cazador.getNombre() + " ha ganado");
        } else {
            System.out.println("\n¡" + hechicero.getNombre() + " ha ganado");
        }

        scanner.close();
    }
}
