package com.gqt.corejava.exceptions;

import java.util.Scanner;

public class Launch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int n1=sc.nextInt();
		System.out.println("Enter second number");
		int n2=sc.nextInt();
		int res=n1/n2;
		System.out.println(res);

	}

}
