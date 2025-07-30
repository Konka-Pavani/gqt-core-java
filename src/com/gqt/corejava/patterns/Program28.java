package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Program28 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        int rows = sc.nextInt();
        char ch='A';
        for (int i = 1; i <= rows; i++) {
            for (int k = rows - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }
}