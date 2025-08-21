package com.gqt.corejava.encapsulation;

import java.util.Scanner;

class Operation1{
	void function1() throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Inside function 1");
		System.out.println("Enter first number");
		int n1=sc.nextInt();
		System.out.println("Enter second number");
		int n2=sc.nextInt();
		int res=n1/n2;
		System.out.println(res);
		System.out.println("Outoff function 1");
	}
}
class Operation2{
	void function2() throws Exception{
		System.out.println("Inside function 2");
		Operation1 op1=new Operation1();
		op1.function1();
		System.out.println("Outoff function 2");
	}
}
class Operation3{
	void function3() {
		System.out.println("Inside function3");
		Operation2 op2=new Operation2();
		try {
			op2.function2();
		}
		catch(Exception e) {
	          System.out.println("Exception occured in function 3");
		}
		System.out.println("Outoff function 3");
	}
}
public class Launch6 {
	public static void main(String[] args) {
		Operation3 op3=new Operation3();
		op3.function3();
	}
}
