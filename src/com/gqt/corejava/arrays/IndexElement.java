package com.gqt.corejava.arrays;

import java.util.Scanner;

public class IndexElement {

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
		System.out.println("enter element");
		int element=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(a[i]==element) {
				System.out.println("Index of an element is "+i);
			}
		}

	}

}
