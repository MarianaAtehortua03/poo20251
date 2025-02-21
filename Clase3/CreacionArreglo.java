package Clase3;

public class CreacionArreglo {
    public static void main(String[] args) {

        // Creacion del arreglo
        int[] a = { 3, 6, 5, 10, 20, 1, 4, 9 };

        // Recorrer y mostrar los elementos del arreglo
        // a.length -> obtiene la longitud del arreglo
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        }
    }

}
