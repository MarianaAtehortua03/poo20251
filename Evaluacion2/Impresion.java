package Evaluacion2;

// Impresion también hereda de Producto
public class Impresion extends Producto {

    private String color;
    private Foto[] fotos; // Composición: Impresion contiene fotos

    public Impresion(int numero, String color, Foto[] fotos) {
        super(numero);
        this.color = color;
        this.fotos = fotos;
    }

    public String getColor() {
        return color;
    }

    public Foto[] getFotos() {
        return fotos;
    }

    // También redefine el comportamiento del método en Producto (Polimorfismo)
    public String getDescripcion() {
        return "Impresión a " + color + " con " + (fotos != null ? fotos.length : 0) + " foto(s) (N° " + getNumero() + ")";
    }

    // método para recorrer internamente las fotos
    public void mostrarFotos() {
        if (fotos != null && fotos.length > 0) {
            System.out.println("Fotos asociadas a esta impresión:");
            for (Foto f : fotos) {
                f.print();
            }
        } else {
            System.out.println("No hay fotos asociadas a esta impresión.");
        }
    }
}
