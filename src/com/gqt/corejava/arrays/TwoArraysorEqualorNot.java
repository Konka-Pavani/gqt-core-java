package com.gqt.corejava.arrays;

import java.util.Scanner;

public class TwoArraysorEqualorNot {

	public static void main(String[] args) {
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
		int c=0;
		for(int i=0;i<n;i++) {
			if(a[i]!=b[i]) {
				c=0;
				break;
			}
			else {
				c=1;
			}
		}
       if(c==0) {
    	   System.out.println("Two arrays are not equal");
       }
       else {
    	   System.out.println("Two arrays are  equal");
       }
	}

}
