package com.gqt.corejava.arrays;
import java.util.Scanner;

public class Uppertriangler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix size (square matrix)
        System.out.print("Enter the size of the square matrix (n x n): ");
        int n = sc.nextInt();

        int[][] a = new int[n][n];
        int sum = 0;

        // Input elements
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum += a[i][j];
            }
        }
        System.out.println("Sum of upper triangle elements = " + sum);
    }
}
