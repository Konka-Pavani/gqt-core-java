package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int a=i;
			for(int j=1;j<=n;j++) {
				System.out.print(a+" ");
				a=a+n;
				
			}
			System.out.println();
		}

	}

}