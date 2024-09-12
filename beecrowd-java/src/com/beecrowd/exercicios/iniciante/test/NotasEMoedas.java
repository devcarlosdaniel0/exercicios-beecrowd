package com.beecrowd.exercicios.iniciante.test;

import java.util.Scanner;

public class NotasEMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorInformado = scanner.nextDouble();
        int valor = 0;

        int[] notas = {100, 50, 20, 10, 5, 2};
        double[] moedas = {1, 0.50, 0.25, 0.10, 0.05, 0.01};

        System.out.println("NOTAS:");
        for (int nota : notas) {
            valor = (int) valorInformado / nota;
            valorInformado %= nota;
            System.out.println(valor + " nota(s) de R$ " + nota + ".00");
        }

        System.out.println("MOEDAS:");
        for (double moeda : moedas) {
            valor = (int) (valorInformado / moeda);
            valorInformado %= moeda;
            System.out.printf("%d moeda(s) de R$ %.2f%n", valor, moeda);
        }

        scanner.close();
    }
}
