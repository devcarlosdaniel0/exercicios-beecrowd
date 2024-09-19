package com.beecrowd.exercicios.iniciante.test;

import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
        int A;
        int B;
        int SOMA;
        Scanner sc = new Scanner(System.in);

        System.out.print("A: ");
        A = sc.nextInt();
        System.out.print("B: ");
        B = sc.nextInt();

        SOMA = A + B;
        System.out.println("SOMA = " + SOMA);
    }
}
