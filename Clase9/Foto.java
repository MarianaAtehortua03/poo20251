package Clase9;

public class Foto {

    //Atributos
    private String fichero;

    //Metodos
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
