package com.beecrowd.exercicios.iniciante.test;

import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distanciaKm = scanner.nextInt();
        double totalCombuGastoL = scanner.nextDouble();
        double kmPorLitro = distanciaKm/totalCombuGastoL;

        System.out.printf("%.3f km/l%n", kmPorLitro);
    }
}
