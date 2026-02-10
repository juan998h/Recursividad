package org.example;

public class DiagonalMatriz {


        public static void main(String[] args) {

            int[][] matriz = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 0}
            };

            System.out.println("Diagonal principal:");
            mostrarDiagonalRecursivo(matriz, 0);
        }

        // Método recursivo que muestra la diagonal principal
        public static void mostrarDiagonalRecursivo(int[][] m, int i) {

            // CASO BASE: cuando el índice llega al tamaño de la matriz
            if (i == m.length) {
                return;
            }

            // ACCIÓN: mostrar el elemento de la diagonal
            System.out.print(m[i][i] + " ");

            // CASO RECURSIVO: avanzar al siguiente índice
            mostrarDiagonalRecursivo(m, i + 1);
        }
    }


