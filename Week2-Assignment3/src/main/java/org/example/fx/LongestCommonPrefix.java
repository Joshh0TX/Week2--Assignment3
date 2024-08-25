package org.example.fx;

import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String firstInput = scanner.next();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the second string: ");
        String secondInput = scanner.next();

        int minLength = Math.min(firstInput.length(), secondInput.length());

        String longestCommonPrefix = "";
        for (int i = 0; i < minLength; i++) {
            if (firstInput.charAt(i) == secondInput.charAt(i)) {
                longestCommonPrefix += firstInput.charAt(i);
            } else {
                break; // Stop if characters do not match
            }
        }

        // Output the result
        if (longestCommonPrefix.isEmpty()) {
            System.out.println("There is no common prefix.");
        } else {
            System.out.println("The longest common prefix is: " + longestCommonPrefix);
        }
    }
}
