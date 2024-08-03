package com.beecrowd.exercicios.iniciante.test;

import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        // Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
        // o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
        // Após, calcule e mostre o valor a ser pago.

        // Entrada
        // O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros
        // e um valor com 2 casas decimais.

        // Saída
        // A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os
        // dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.

        Scanner scanner = new Scanner(System.in);

        int cod1 = scanner.nextInt();
        int qntd1 = scanner.nextInt();
        double valor1 = scanner.nextDouble();

        int cod2 = scanner.nextInt();
        int qntd2 = scanner.nextInt();
        double valor2 = scanner.nextDouble();

        double total = (valor1*qntd1) + (valor2*qntd2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
    }
}
