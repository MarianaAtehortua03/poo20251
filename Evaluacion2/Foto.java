package Evaluacion2;

public class Foto {

    private String fichero;

    public Foto(String fichero) {
        this.fichero = fichero;
    }

    public void print() {
        System.out.println("Mostrando foto: " + fichero);
    }

    // método 
    public String getDescripcion() {
        return "Archivo de foto: " + fichero;
    }

    public String toString() {
        return "Foto { Fichero: " + fichero + " }";
    }
}
