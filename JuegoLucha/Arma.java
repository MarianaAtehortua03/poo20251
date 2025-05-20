public class Arma {
    private String nombre;
    private int danoExtra;

    // Crea un arma con un nombre y el daño extra que aporta
    public Arma(String nombre, int danoExtra) {
        this.nombre = nombre;
        this.danoExtra = danoExtra;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDanoExtra() {
        return danoExtra;
    }
}

