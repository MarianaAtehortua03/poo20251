package EjerciciosResueltos;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de números: ");
        int N = scanner.nextInt();
        int[] numeros = new int[N];
        int suma = 0;
        
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }
        System.out.println("La suma de los números es: " + suma);
        
        scanner.close();
    }
}
