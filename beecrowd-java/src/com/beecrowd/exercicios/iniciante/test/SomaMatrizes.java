package com.beecrowd.exercicios.iniciante.test;

public class SomaMatrizes {
    public static int[][] somaMatrizes(int[][] a, int[][] b) {
        int linhas = a.length;
        int colunas = a[0].length;
        int[][] soma = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                soma[i][j] = a[i][j] + b[i][j];
            }
        }
        return soma;
    }

    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] b = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        int[][] resultado = somaMatrizes(a, b);

        // Imprimir a matriz resultante
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}

