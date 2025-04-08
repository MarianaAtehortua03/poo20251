package Clase9;
import java.util.Date;

public class Pedido {

    // Atributos
    private Cliente cliente;
    private Producto[] productos;
    private Date fecha;
    private int numeroTarjetaCredito;

    // Constructor
    public Pedido(Cliente cliente, Producto[] productos, Date fecha, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    // Métodos
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
        return "Pedido { Cliente: " + cliente +
                ", Fecha: " + fecha +
                ", Número Tarjeta: " + numeroTarjetaCredito + " }";
    }
}


