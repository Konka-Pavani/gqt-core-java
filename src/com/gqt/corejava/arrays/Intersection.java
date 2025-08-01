package com.gqt.corejava.arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter size");
	    int n=sc.nextInt();
	    System.out.println("enter array1 elements");
		int[] a=new int[n];
		int[] b=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("enter array2 elements");
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();
		}
		Set<Integer> s=new HashSet<Integer>();
		for(int i=0;i<n;i++) {
			for(int j=i+1;)
			if(a[i]==b[i]) {
				s.add(a[i]);
			}
		}
		for(int num: s) {
			System.out.println(num);
		}

	}

}
