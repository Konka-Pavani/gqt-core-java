package com.gqt.corejava.arrays;

import java.util.Scanner;

public class CopyofArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		System.out.println("enter array elements");
		int[] a=new int[n];
		int[] b=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			b[i]=a[i];
		}
		System.out.println("Copied  array elements");
		for(int i=0;i<n;i++) {
			System.out.println(b[i]);
		}

	}

}
