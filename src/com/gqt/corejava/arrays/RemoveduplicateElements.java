package com.gqt.corejava.arrays;

import java.util.Scanner;

public class RemoveduplicateElements {

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
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					b[j]=true;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}
}