package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Program23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			int c=1;
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(c);
				c++;
			}
			System.out.println();
		}

	}

}
