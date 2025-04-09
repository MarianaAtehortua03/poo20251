package Clase9;

// Clase base que representa un producto general
public class Producto {

    private int numero; 

    public Producto(int numero) {
        this.numero = numero;
    }

    // Metodo que puede ser sobrescrito por las subclases
    public String getDescripcion() {
        return "Producto genérico con número " + numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String toString() {
        return getDescripcion();
    }
}

