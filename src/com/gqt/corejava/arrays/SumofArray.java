package com.gqt.corejava.arrays;
import java.util.Scanner;
public class SumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		int sum=0;
		System.out.println("enter array elemts");
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			sum=sum+a[i];
		}
        System.out.println("sum of array elements="+ sum);
	}

}
