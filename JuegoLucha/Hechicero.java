import java.util.Random;

// Clase que representa un personaje tipo Hechicero
public class Hechicero extends Personaje {

    // Constructor que inicializa el nombre y el arma, y asigna 100 puntos de vida
    public Hechicero(String nombre, Arma arma) {
        super(nombre, 100, arma); // Llama al constructor de la superclase Personaje
    }

    // Implementación del ataque para el Hechicero
    @Override
    public void atacar(Personaje oponente) {
        Random rand = new Random();

        // Genera un número aleatorio entre 10 y 20 como ataque base
        int ataqueBase = rand.nextInt(11) + 10;

        // Suma el daño extra del arma al ataque base
        int totalAtaque = ataqueBase + arma.getDanoExtra();

        // Imprime el ataque realizado
        System.out.println(nombre + " lanza un hechizo y causa " + totalAtaque + " puntos.");

        // Aplica el daño al oponente
        oponente.recibirDano(totalAtaque);
    }
}



