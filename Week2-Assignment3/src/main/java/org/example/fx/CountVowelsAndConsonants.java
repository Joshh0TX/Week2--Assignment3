package org.example.fx;

import java.util.Arrays;
import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string");
        String sentenceInput = scanner.nextLine();

        String vowels = "AEIOUaeiou";
        String consonants = "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";

        String[] splitSentence = sentenceInput.split(" ");

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < sentenceInput.length(); i++) {
            char ch = sentenceInput.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                vowelCount++;
                }
            else if(Character.isLetter(ch)) {
                consonantCount++;
            }
        }
        System.out.println("The number of vowels are: " + vowelCount);
        System.out.println("The number of consonants are: " + consonantCount);
    }
}
