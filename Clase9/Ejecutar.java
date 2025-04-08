package Clase9;

import java.util.Date;

public class Ejecutar {
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente = new Cliente("123456789", "Laura Gómez");

        // Crear fotos
        Foto foto1 = new Foto("vacaciones1.jpg");
        Foto foto2 = new Foto("cumpleaños2.jpg");
        Foto[] fotos = { foto1, foto2 };

        // Crear productos
        Camara camara = new Camara(1, "Canon", "EOS 2000D");
        Impresion impresion = new Impresion(2, "Color", fotos);
        Producto[] productos = { camara, impresion };

        // Crear pedido
        Pedido pedido = new Pedido(cliente, productos, new Date(), 12345678);

        // Imprimir todo
        System.out.println(cliente);
        System.out.println(camara);
        System.out.println(impresion);
        System.out.println(pedido);

        // Mostrar fotos con método print()
        for (Foto f : fotos) {
            f.print();
        }
    }
}
