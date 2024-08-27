package com.beecrowd.exercicios.iniciante.test;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(5,3,2,5,6,7,8,9,9,11));
        list.sort(Integer::compareTo);
        System.out.println(list);

        int index = binarySearch(list, 11);
        System.out.println(index);
    }

    public static int binarySearch(List<Integer> list, int num) {
        int baixo = 0;
        int alto = list.size() - 1;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            int chute = list.get(meio);

            if (chute == num) return meio;
            if (chute > num) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }

        return -1;
    }
}
