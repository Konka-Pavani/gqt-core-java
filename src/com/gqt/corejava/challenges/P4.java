package com.gqt.corejava.challenges;
import java.util.Scanner;
public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int c=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				c=1;
			}
		}
		if(c==1) {
			System.out.println("Not a Prime");
		}
		else {
			System.out.println("Prime");
		}

	}

}
