package Evaluacion2;

import java.util.Date;

public class Ejecutar {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("123456789", "Laura Gómez");

        Foto foto1 = new Foto("vacaciones1.jpg");
        Foto foto2 = new Foto("cumpleaños2.jpg");
        Foto[] fotos = { foto1, foto2 };

        // Crear productos (herencia y polimorfismo)
        Camara camara = new Camara(1, "Canon", "EOS 2000D");
        Impresion impresion = new Impresion(2, "Color", fotos);
        Producto[] productos = { camara, impresion };

        // Crear pedido (agregación)
        Pedido pedido = new Pedido(cliente, productos, new Date(), 12345678);

        System.out.println(pedido);

        // método mostrarFotos() de la clase Impresion
        impresion.mostrarFotos();
    }
}
