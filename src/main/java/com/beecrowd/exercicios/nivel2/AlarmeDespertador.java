package com.beecrowd.exercicios.nivel2;

import java.util.Scanner;
import java.util.stream.Stream;

public class AlarmeDespertador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int h1 = scanner.nextInt();
            int m1 = scanner.nextInt();
            int h2 = scanner.nextInt();
            int m2 = scanner.nextInt();

            boolean isPossibleHourAndMinute = Stream.of(h1, h2).allMatch(h -> h >= 0 && h <= 23)
                    && Stream.of(m1, m2).allMatch(m -> m >= 0 && m <= 59);

            if (!isPossibleHourAndMinute) {
                break;
            }

            h1 *= 60;
            h2 *= 60;

            int init = h1 + m1;
            int target = h2 + m2;
            int sleepTime;

            if (init == 0 && target == 0) {
                break;
            }

            if (target > init) {
                sleepTime = target - init;
            } else {
                sleepTime = (24 * 60 - init) + target;
            }

            System.out.println(sleepTime);
        }

        scanner.close();
    }
}
