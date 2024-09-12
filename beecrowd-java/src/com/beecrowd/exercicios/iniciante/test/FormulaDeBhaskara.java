package com.beecrowd.exercicios.iniciante.test;

import java.util.Scanner;

public class FormulaDeBhaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - (4 * a * c);
        if (a == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
            return;
        }

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.printf("R1 = %.5f%n", x1);
        System.out.printf("R2 = %.5f%n", x2);

        scanner.close();
    }
}
