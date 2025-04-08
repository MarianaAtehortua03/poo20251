package Clase9;

// Clase base que representa un producto general
public class Producto {

    private int numero; // Número identificador del producto

    // Constructor
    public Producto(int numero) {
        this.numero = numero;
    }

    // Método que puede ser sobrescrito por las subclases
    public String getDescripcion() {
        return "Producto genérico con número " + numero;
    }

    // Getters y Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Para mostrar el producto como texto
    public String toString() {
        return getDescripcion();
    }
}

