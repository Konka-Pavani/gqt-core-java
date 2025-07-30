package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Program32 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        int n = sc.nextInt(); 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println(); 
        }

        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print increasing numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            // Print decreasing numbers (excluding the first number of the row)
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println(); // Move to the next line
        }
    }
}