package org.example.fx;

import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String inputSentence = scanner.next();

        int upperCaseCount = 0;
        for (int i = 0; i < inputSentence.length(); i++) {
            char upperCaseLetter = inputSentence.charAt(i);
            if (Character.isUpperCase(upperCaseLetter)) {
                upperCaseCount++;
            }
        }

        System.out.println("The number of uppercase letters is: " + upperCaseCount);


    }
}
