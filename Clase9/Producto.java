package Clase9;

public class Producto {

    //Atributos
    private int numero;

    // Constructor
    public Producto(int numero) {
        this.numero = numero;
    }

    // Métodos getter y setter
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Método toString
    public String toString() {
        return "Producto { Número: " + numero + " }";
    }
    
}
