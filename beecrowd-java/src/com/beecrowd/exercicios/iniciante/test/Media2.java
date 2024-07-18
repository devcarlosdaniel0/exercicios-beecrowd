package com.beecrowd.exercicios.iniciante.test;

import java.util.Scanner;

public class Media2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        int pesoA = 2;
        int pesoB = 3;
        int pesoC = 5;

        double media = (A * pesoA + B * pesoB + C * pesoC) / (pesoA + pesoB + pesoC);

        System.out.printf("MEDIA = %.1f%n", media);
        sc.close();
    }
}
