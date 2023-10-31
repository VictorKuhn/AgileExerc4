package com.cryptography;

public class Encryptor {

    public static String encryptThis(String message) {
        String[] words = message.split(" ");

        StringBuilder encryptedMessage = new StringBuilder();
        for (String word : words) {
            encryptedMessage.append(encryptWord(word)).append(" ");
        }

        return encryptedMessage.toString().trim();
    }

    private static String encryptWord(String word) {
        if (word.isEmpty()) {
            return "";
        }

        StringBuilder encryptedWord = new StringBuilder();

        encryptedWord.append((int) word.charAt(0));

        if (word.length() > 2) {
            encryptedWord.append(word.charAt(word.length() - 1));

            encryptedWord.append(word.substring(2, word.length() - 1));

            encryptedWord.append(word.charAt(1));
        } else if (word.length() == 2) {
            encryptedWord.append(word.charAt(1));
        }

        return encryptedWord.toString();
    }

    public static void main(String[] args) {
        System.out.println(encryptThis("Hello"));
        System.out.println(encryptThis("good"));
        System.out.println(encryptThis("hello world"));
    }
}