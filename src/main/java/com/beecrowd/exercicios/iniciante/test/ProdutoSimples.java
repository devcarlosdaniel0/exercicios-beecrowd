package com.beecrowd.exercicios.iniciante.test;

import java.util.Scanner;

public class ProdutoSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int PROD = a*b;
        System.out.println("PROD = " + PROD);
    }
}
