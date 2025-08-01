package com.gqt.corejava.arrays;
import java.util.Scanner;
public class MultiplyofMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		int[][] a1=new int[n][n];
		int[][] a2=new int[n][n];
		int[][] a3=new int[n][n];
		System.out.println("enter the array1 elements");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a1[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the array2 elements");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			int c=0;
			for(int j=0;j<n;j++) {
				c=a1[i][j]*a2[j][i];
			}
			for(int j=0;j<n;j++) {
				c=a1[i][j]*a2[j][i];
			}
			for(int k=0;k<n;k++) {
				for(int l=0;l<n;l++){
					a3[k][l]=c;
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.println(a3[i][j]);
			}
		}
        
	}

}
