package org.example;

public class RecorrerArrayDivideV {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};

        recorrerDivideV(0, array.length - 1, array);
    }

    public static void recorrerDivideV(int inicio, int fin, int[] array) {

        // CASO BASE
        if (inicio == fin) {
            System.out.print(array[inicio] + " ");
            return;
        }

        // DIVISIÓN
        int mitad = (inicio + fin) / 2;

        // CONQUISTAR
        recorrerDivideV(inicio, mitad, array);      // izquierda
        recorrerDivideV(mitad + 1, fin, array);     // derecha
    }
}
