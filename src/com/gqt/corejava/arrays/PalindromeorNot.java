package com.gqt.corejava.arrays;

import java.util.Scanner;

public class PalindromeorNot {

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
				int c=0;
				int left=0;
				int right=n-1;
				for(int i=0;i<n/2;i++) {
					if(a[left]!=a[right]) {
						c=0;
					}
					else {
						left++;
						right--;
						c=1;
					}
				}
				if(c==1) {
					System.out.println("Array is a palindrom");
				}
				else {
					System.out.println("Array is not a plaindrome");
				}
	}
}
