package com.beecrowd.exercicios.iniciante.test;

import java.util.Scanner;

public class GastoDeCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tempo = scanner.nextInt();
        int velocidade = scanner.nextInt();
        int distancia = velocidade * tempo;
        double litrosParaViagem = (double) distancia/12;

        System.out.printf("%.3f%n",litrosParaViagem);
    }
}
