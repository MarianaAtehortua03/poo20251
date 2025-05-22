// Clase abstracta que define las características comunes de todos los personajes del juego
public abstract class Personaje {
    // Nombre del personaje
    protected String nombre;

    // Puntos de vida actuales del personaje
    protected int puntosDeVida;

    // Arma asociada al personaje (composición)
    protected Arma arma;

    // Constructor que inicializa nombre, puntos de vida y arma
    public Personaje(String nombre, int puntosDeVida, Arma arma) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.arma = arma;
    }

    // Método abstracto que será implementado por las subclases (ataque personalizado)
    public abstract void atacar(Personaje oponente);

    // Método para recibir daño, restando puntos de vida
    public void recibirDano(int cantidad) {
        puntosDeVida -= cantidad;
        if (puntosDeVida < 0) {
            puntosDeVida = 0; // Evita que los puntos de vida sean negativos
        }
    }

    // Verifica si el personaje sigue con vida
    public boolean estaVivo() {
        return puntosDeVida > 0;
    }

    // Devuelve el nombre del personaje
    public String getNombre() {
        return nombre;
    }

    // Devuelve los puntos de vida actuales del personaje
    public int getPuntosDeVida() {
        return puntosDeVida;
    }
}
