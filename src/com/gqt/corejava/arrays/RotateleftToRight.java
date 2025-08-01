package com.gqt.corejava.arrays;

import java.util.Scanner;

public class RotateleftToRight {

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
				int temp;
				int left=0;
				int right=n-1;
				for(int i=0;i<n/2;i++) {
					    temp=a[left];
					    a[left]=a[right];
					    a[right]=temp;
						left++;
						right--;
				}
				System.out.println("rotated array from left to right");
				for(int i=0;i<n;i++) {
					System.out.println(a[i]);
				}
	}
	
}
