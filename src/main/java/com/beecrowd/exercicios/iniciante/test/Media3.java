package com.beecrowd.exercicios.iniciante.test;

import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double n4 = scanner.nextDouble();

        double media = (float) ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
        System.out.printf("Media: %.1f%n", media);

        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            double notaExame = scanner.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", notaExame);
            media = (notaExame + media) / 2;
            if (media >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", media);
        } else {
            System.out.println("Aluno reprovado.");
        }

        scanner.close();
    }
}
