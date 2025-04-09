package Clase9;

public class Cliente {

    private String cedula;
    private String nombre;

    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public String toString() {
        return "Cliente { Cédula: " + cedula + ", Nombre: " + nombre + " }";
    }
}

