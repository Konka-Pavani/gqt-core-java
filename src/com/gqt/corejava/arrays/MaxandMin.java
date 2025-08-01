package com.gqt.corejava.arrays;
import java.util.Scanner;
public class MaxandMin {

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
		int max=a[0];
		int min=a[0];
		for(int i=1;i<n;i++) {
			if(max<a[i]) {
				max=a[i];
			}
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("Largest element= "+ max);
		System.out.println("Smallest element= "+ min);
	}

}
