package Clase9;

public class Camara extends Producto {

    //Atributos
    private String marca;
    private String modelo;

    public Camara(int numero, String marca, String modelo) {
        super(numero);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String toString() {
        return "Cámara { Número: " + getNumero() +
                ", Marca: " + marca +
                ", Modelo: " + modelo + " }";
    }
    
}
