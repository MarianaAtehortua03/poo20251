package Clase9;

import java.util.Date;

// Clase que relaciona Cliente con Productos: Ejemplo de Agregacion
public class Pedido {

    private Cliente cliente;
    private Producto[] productos;
    private Date fecha;
    private int numeroTarjetaCredito;

    public Pedido(Cliente cliente, Producto[] productos, Date fecha, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getNumeroTarjetaCredito() {
        return numeroTarjetaCredito;
    }

    public String toString() {
        String resumen = "Pedido de: " + cliente + "\nFecha: " + fecha + "\nProductos:\n";
        for (Producto p : productos) {
            resumen += "- " + p.getDescripcion() + "\n";
        }
        return resumen;
    }
}



