package Clase9;

public class Foto {

    private String fichero;

    public Foto(String fichero) {
        this.fichero = fichero;
    }

    public void print() {
        System.out.println("Mostrando foto: " + fichero);
    }

    public String toString() {
        return "Foto { Fichero: " + fichero + " }";
    }
}
