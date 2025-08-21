package com.gqt.corejava.challenges;

import java.util.Scanner;

public class P54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the values: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("After swapping the values are : "+a+" and "+b);
		sc.close();
	}

}