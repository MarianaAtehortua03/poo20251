import java.util.Random;

public class Hechicero extends Personaje {

    // El Hechicero tiene menos vida que el Cazador
    public Hechicero(String nombre, Arma arma) {
        super(nombre, 80, arma);
    }

    // Ataque mágico con un poco de daño aleatorio
    @Override
    public void atacar(Personaje oponente) {
        Random random = new Random();
        int dano = 8 + random.nextInt(6) + arma.getDanoExtra(); // entre 8 y 13 + daño del arma
        System.out.println(nombre + " lanza un hechizo causando " + dano + " puntos de daño.");
        oponente.recibirDano(dano);
    }
}
