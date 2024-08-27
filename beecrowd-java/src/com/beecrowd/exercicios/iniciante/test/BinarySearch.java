package com.beecrowd.exercicios.iniciante.test;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 3, 5, 10, 43, 4, 12, 9));
        list.sort(Integer::compareTo);
        System.out.println(list);

        int primeiro = 0;
        int ultimo = list.size() - 1;

        System.out.println(primeiro);
        System.out.println(ultimo);
    }
}
