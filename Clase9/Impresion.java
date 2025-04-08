package Clase9;

public class Impresion extends Producto {

    // Atributos
    private String color;
    private Foto[] fotos; // Arreglo de fotos

    // Constructor
    public Impresion(int numero, String color, Foto[] fotos) {
        super(numero);
        this.color = color;
        this.fotos = fotos;
    }

    // Métodos
    public String getColor() {
        return color;
    }

    public Foto[] getFotos() {
        return fotos;
    }

    public String toString() {
        return "Impresion { Color: " + color + ", Número Producto: " + super.getNumero() + " }";
    }
}

