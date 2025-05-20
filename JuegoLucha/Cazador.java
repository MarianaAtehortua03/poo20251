import java.util.Random;

public class Cazador extends Personaje {

    // El Cazador comienza con 100 puntos de vida
    public Cazador(String nombre, Arma arma) {
        super(nombre, 100, arma);
    }

    // El ataque del Cazador es fisico y con un poco de daño aleatorio
    @Override
    public void atacar(Personaje oponente) {
        Random random = new Random();
        int dano = 10 + random.nextInt(6) + arma.getDanoExtra(); // entre 10 y 15 + arma
        System.out.println(nombre + " lanza un ataque físico causando " + dano + " puntos de daño.");
        oponente.recibirDano(dano);
    }
}
