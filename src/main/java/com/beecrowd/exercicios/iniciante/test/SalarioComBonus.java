package com.beecrowd.exercicios.iniciante.test;

import java.util.Scanner;

public class SalarioComBonus {
    public static void main(String[] args) {
        // Faça um programa que leia o nome de um vendedor, o seu salário fixo e
        // o total de vendas efetuadas por ele no mês (em dinheiro).
        // Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
        // informar o total a receber no final do mês, com duas casas decimais.

        // Entrada
        // O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double)
        // com duas casas decimais, representando o salário fixo do vendedor e montante total das vendas efetuadas por
        // este vendedor, respectivamente.

        Scanner scanner = new Scanner(System.in);
        String nome = scanner.next();
        double salarioFixo = scanner.nextDouble();
        double vendasEfetuadas = scanner.nextDouble();

        double comissao = 0.15 * vendasEfetuadas;
        double totalReceber = salarioFixo + comissao;

        System.out.printf("TOTAL = R$ %.2f%n", totalReceber);
    }
}
