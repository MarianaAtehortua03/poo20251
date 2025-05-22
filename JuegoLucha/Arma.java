// Clase que representa un arma con un nombre y un daño adicional.
public class Arma {
    // Nombre del arma (ej. "Arco", "Bastón")
    private String nombre;
    
    // Daño adicional que el arma aporta al ataque del personaje
    private int danoExtra;

    // Constructor para inicializar el nombre y el daño extra del arma
    public Arma(String nombre, int danoExtra) {
        this.nombre = nombre;
        this.danoExtra = danoExtra;
    }

    // Retorna el daño extra del arma
    public int getDanoExtra() {
        return danoExtra;
    }

    // Retorna el nombre del arma
    public String getNombre() {
        return nombre;
    }
}



