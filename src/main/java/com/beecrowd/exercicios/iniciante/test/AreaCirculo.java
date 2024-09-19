package com.beecrowd.exercicios.iniciante.test;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        sc.close();

        double pi = 3.14159;

        double area = pi * raio * raio;

        System.out.printf("A=%.4f%n", area);
        // Area = pi r²
    }
}
