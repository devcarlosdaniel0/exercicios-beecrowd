package com.beecrowd.exercicios.iniciante.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class TimeTest {
    public static void main(String[] args) {
        String format = LocalTime.now().format(DateTimeFormatter.ofPattern("SSS"));
        System.out.println(format);
    }
}
