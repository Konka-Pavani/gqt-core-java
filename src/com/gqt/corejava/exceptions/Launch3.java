package com.gqt.corejava.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Launch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc=new Scanner(System.in);
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
		catch(ArithmeticException ae) {
			System.out.println("Arithmetic exception occured and handled");
		}
		catch(InputMismatchException ime) {
			System.out.println("Input mismatch exception occured and handled");
		}
		catch(NegativeArraySizeException nas) {
			System.out.println("Negative Array Size Exceptionoccured and handled");
		}
		catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("Array Index Out Of Bounds Exception occured and handled");
		}
		catch(Exception e) {
			System.out.println("exception occured and handled in catch block");
		}

	}

}
