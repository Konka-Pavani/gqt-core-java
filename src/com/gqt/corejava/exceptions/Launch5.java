package com.gqt.corejava.exceptions;
import java.util.Scanner;

public class Launch5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter first number");
		int n1=sc.nextInt();
		System.out.println("Enter second number");
		int n2=sc.nextInt();
		int res=n1/n2;
		System.out.println(res);
			System.out.println("Enter array size");
			int size=sc.nextInt();
			int a[]=new int[size];
			System.out.println("Enter  number");
			int value=sc.nextInt();
			System.out.println("Enter position");
			int pos=sc.nextInt();
			a[pos]=value;
			System.out.println(a[pos]);
		}
		//specific class
		catch(ArithmeticException | ArrayIndexOutOfBoundsException ae) {
			System.out.println("Arithmetic exception occured and handled"+" or "+"Array Index Out Of Bounds Exception occured and handled");
		}
		finally {
			sc.close();
			System.out.println("scanner closed");
		}
	}

}
