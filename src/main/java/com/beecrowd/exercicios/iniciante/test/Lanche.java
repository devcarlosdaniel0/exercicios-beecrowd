package com.beecrowd.exercicios.iniciante.test;

import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();
        int quantidade = scanner.nextInt();
        double[] precos = {4, 4.5, 5, 2, 1.5};
        double preco = 0;

        if (escolha > 5 || escolha <= 0) return;

        switch (escolha) {
            case 1: preco = precos[0]; break;
            case 2: preco = precos[1]; break;
            case 3: preco = precos[2]; break;
            case 4: preco = precos[3]; break;
            case 5: preco = precos[4]; break;
            default: return;
        }

        double total = quantidade * preco;
        System.out.printf("Total: R$ %.2f%n", total);
        scanner.close();
    }
}
