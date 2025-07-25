package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=25;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(c+" ");
				c--;
			}
			System.out.println();
		}

	}

}
