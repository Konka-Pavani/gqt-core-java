package com.gqt.corejava.arrays;

import java.util.Scanner;

public class ProductofAllelements {
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
				int product=1;
				for(int i=0;i<n;i++) {
						product=product*a[i];
				}
				System.out.println("Product of all elements in an array: "+product);
	}

}

