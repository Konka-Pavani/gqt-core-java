package com.gqt.corejava.arrays;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		System.out.println("enter array elements");
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Ascending order");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		System.out.println("descending order");
		for(int i=n-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}
}