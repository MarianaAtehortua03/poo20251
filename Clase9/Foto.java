package Clase9;

// Clase simple para representar una foto
public class Foto {

    private String fichero;

    public Foto(String fichero) {
        this.fichero = fichero;
    }

    // Este método muestra el contenido, puede ser usado por Impresion
    public void print() {
        System.out.println("Mostrando foto: " + fichero);
    }

    public String toString() {
        return "Foto { Fichero: " + fichero + " }";
    }
}
