package com.gqt.corejava.arrays;

import java.util.Scanner;

public class SpiralOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Spiral order:");
        printSpiral(matrix, rows, cols);
    }

    public static void printSpiral(int[][] arr, int rows, int cols) {
        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        while(top <= bottom && left <= right) {
            for(int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;
            for(int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }

           
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }
}

