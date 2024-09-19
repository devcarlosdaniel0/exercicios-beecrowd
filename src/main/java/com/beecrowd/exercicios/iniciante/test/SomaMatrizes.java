package com.beecrowd.exercicios.iniciante.test;

public class SomaMatrizes {
    public static void main(String[] args) {
        int[][] matrizA = new int[][]{
                {1, 4, 6},
                {3, 4, 0},
        };
        int[][] matrizB = new int[][]{
                {5, 6, 1},
                {7, 8, 2},
        };

        System.out.println("Matriz A");
        mostrarMatriz(matrizA);

        System.out.println("Matriz B");
        mostrarMatriz(matrizB);

        System.out.println("Ordem das matrizes:");
        System.out.println(calcularOrdemMatriz(matrizA));
        System.out.println(calcularOrdemMatriz(matrizB));

        try {
            int[][] matrizResultado = somarMatrizes(matrizA, matrizB);
            System.out.println("Resultado da soma:");
            mostrarMatriz(matrizResultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static String calcularOrdemMatriz(int[][] matriz) {
        int linha = matriz.length;
        int coluna = matriz[0].length;

        return (linha + "x" + coluna);
    }

    private static int[][] somarMatrizes(int[][] matrizA, int[][] matrizB) {
        int[][] matrizResultado = new int[matrizA.length][matrizA[0].length];

        if (matrizA == null || matrizB == null) {
            throw new IllegalArgumentException("As matrizes não podem ser nulas!");
        }
        if (matrizA.length != matrizB.length || matrizA[0].length != matrizB[0].length) {
            throw new IllegalArgumentException("As matrizes devem ser da mesma ordem para fazer a adição!");
        }

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                matrizResultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return matrizResultado;
    }

    private static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}