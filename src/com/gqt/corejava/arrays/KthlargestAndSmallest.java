package com.gqt.corejava.arrays;

import java.util.Scanner;

public class KthlargestAndSmallest {

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
		System.out.println("enter kth element");
		int k=sc.nextInt();
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
		System.out.println("Second largest number is "+a[n-k]);
		System.out.println("Second smallest number is "+a[k]);
	}
}