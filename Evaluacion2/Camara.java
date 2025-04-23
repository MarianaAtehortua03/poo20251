package Evaluacion2;

// Camara hereda de Producto (Herencia)
public class Camara extends Producto {

    private String marca;
    private String modelo;

    public Camara(int numero, String marca, String modelo) {
        super(numero); 
        this.marca = marca;
        this.modelo = modelo;
    }

    // Este método redefine el comportamiento del método en Producto (Polimorfismo)
    public String getDescripcion() {
        return "Cámara: " + marca + " " + modelo + " (N° " + getNumero() + ")";
    }
}
