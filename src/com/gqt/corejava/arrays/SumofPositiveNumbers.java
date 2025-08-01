package com.gqt.corejava.arrays;

import java.util.Scanner;

public class SumofPositiveNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("enter size");
				int n=sc.nextInt();
				System.out.println("enter array elements");
				int[] a=new int[n];
				for(int i=0;i<n;i++) {
					a[i]=sc.nextInt();
				}
				int sum=0;
				for(int i=0;i<n;i++) {
					if(a[i]>=0) {
						sum=sum+a[i];
					}
				}
				System.out.println("Sum of all positive numbers in an array: "+sum);
	}

}
