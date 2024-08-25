package com.beecrowd.exercicios.iniciante.test;

import java.util.Random;

public class Roleta {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(5);
        switch (i) {
            case 1:
                System.out.println("jogar tshushima");
                break;
            case 2:
                System.out.println("assistir");
                break;
            case 3:
                System.out.println("jogar GTA");
                break;
            case 4:
                System.out.println("jogar watch dogs");
                break;
            default:
                break;
        }
    }
}
