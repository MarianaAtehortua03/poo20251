import java.util.Random;

// Clase que representa un personaje tipo Cazador
public class Cazador extends Personaje {

    // Constructor que inicializa el nombre y el arma, y asigna 120 puntos de vida
    public Cazador(String nombre, Arma arma) {
        super(nombre, 120, arma); // Llama al constructor de la superclase Personaje
    }

    // Implementación del ataque para el Cazador
    @Override
    public void atacar(Personaje oponente) {
        Random rand = new Random();

        // Genera un número aleatorio entre 15 y 25 como ataque base
        int ataqueBase = rand.nextInt(11) + 15;

        // Suma el daño extra del arma al ataque base
        int totalAtaque = ataqueBase + arma.getDanoExtra();

        // Imprime el ataque realizado
        System.out.println(nombre + " ataca con fuerza y causa " + totalAtaque + " puntos.");

        // Aplica el daño al oponente
        oponente.recibirDano(totalAtaque);
    }
}


