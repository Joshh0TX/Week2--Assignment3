package org.example.fx;

import java.util.Scanner;

public class NonDivisible {
    public static void main(String[] args) {

        System.out.println("Checking if inputted number is not divisible by 3 and 7");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the amount of numbers you want to print out:");
        int n = scanner.nextInt();

        for(int i = 7 ; i <= n ; i++) {
            if (i % 3 == 0 || i % 7 == 0) {
                System.out.println(i + " does not fit the case");
            } else {
                System.out.println(i);
            }
        }
    }
}
