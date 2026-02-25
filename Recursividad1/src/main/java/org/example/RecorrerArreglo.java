import java.util.Arrays;

public class RecorrerArreglo {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};

        dividir(array, 0, array.length - 1);

    }

    public static void dividir(int[] array, int inicio, int fin) {

        // caso base
        if (inicio >= fin) {
            return;
        }

        int mitad = (inicio + fin) / 2;

        dividir(array, inicio, mitad);      // izquierda
        dividir(array, mitad + 1, fin);
        System.out.println(array[inicio]);
        System.out.println(array[fin]);
        // derecha
    }
}
