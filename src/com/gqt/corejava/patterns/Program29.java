package com.gqt.corejava.patterns;

public class Program29 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pattern

        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < rows - 1 - i; j++) {
                System.out.print(" ");
            }

            // Print characters in ascending order (left side of the pyramid)
            for (int k = 0; k <= i; k++) {
                System.out.print((char) ('A' + k));
            }

            // Print characters in descending order (right side of the pyramid)
            for (int l = i - 1; l >= 0; l--) {
                System.out.print((char) ('A' + l));
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}