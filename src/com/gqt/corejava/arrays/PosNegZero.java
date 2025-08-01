package com.gqt.corejava.arrays;

import java.util.Scanner;

public class PosNegZero {

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
		int pos=0;
		int neg=0;
		int zero=0;
		for(int i=0;i<n;i++) {
			if(a[i]>0) {
				pos+=1;
			}
			else if(a[i]<0) {
				neg+=1;
			}
			else {
				zero+=1;
			}
		}
		System.out.println("postive values in an array is "+pos);
		System.out.println("negative values in an array is "+neg);
		System.out.println("zero values in an array is "+zero);

	}

}
