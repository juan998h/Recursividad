package org.example;

public class RecorrerArreglo {


    public static void main(String[] args) {

        int[] arreglo = {10, 20, 30, 40, 50};

        System.out.println("Recorrido del arreglo:");
        recorrerArregloRecursivo(arreglo, 0);
    }

    // Método recursivo para recorrer el arreglo
    public static void recorrerArregloRecursivo(int[] arr, int i) {

        // CASO BASE: cuando se llega al final del arreglo
        if (i == arr.length) {
            return;
        }

        // ACCIÓN: procesar el elemento actual
        System.out.print(arr[i] + " ");

        // CASO RECURSIVO: avanzar al siguiente índice
        recorrerArregloRecursivo(arr, i + 1);
    }
}
