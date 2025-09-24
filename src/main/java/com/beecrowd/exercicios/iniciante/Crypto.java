package com.beecrowd.exercicios.iniciante;

public class Crypto {
    public static void main(String[] args) {
        String textCrypt = crypt("MACACO");
        String textCrypt2 = crypt("macaco");

        System.out.println(textCrypt);
        System.out.println(textCrypt2);
    }

    private static String crypt(String word) {
        String wordFormatted = word.trim().toLowerCase();

        String wordCrypto = "";

        for (int i = 0; i < wordFormatted.length(); i++) {
            char letter = wordFormatted.charAt(i);

            int alphabeticalNumber = letter - 96;

            wordCrypto += alphabeticalNumber + " ";
        }

        return wordCrypto;
    }
}
