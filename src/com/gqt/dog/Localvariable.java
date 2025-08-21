package com.gqt.dog;

class Calculator {
	void add() {
		int a=10;
		int b=20;
		int res=a+b;
		System.out.println(res);
	}
	void sub(int a,int b) {
		int res=a-b;
		System.out.println(res);
	}
}
public class Localvariable {

	public static void main(String[] args) {
		Calculator c1=new Calculator();
		c1.add();
		c1.sub(20,10);

	}

}
