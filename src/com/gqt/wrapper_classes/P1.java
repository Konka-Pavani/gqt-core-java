package com.gqt.wrapper_classes;
import java.util.Scanner;
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=1;
		System.out.print(c+" ");
		for(int i=n;i<=1;i++) {
			System.out.print(c+" ");
			for(int j=1;j<=i;j++) {
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}

	}

}
