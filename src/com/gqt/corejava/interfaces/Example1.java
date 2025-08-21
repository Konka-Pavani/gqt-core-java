package com.gqt.corejava.interfaces;

interface Calculator{
	int a=10;
	void add();
	void add1();
	void add2();
	void add3();
	
	default void sub() {
		System.out.println("Inside sub method");
	}
	default void sub1() {
		System.out.println("Inside sub1 method");
	}
	default void sub2() {
		System.out.println("Inside sub2 method");
	}
	default void sub3() {
		System.out.println("Inside sub3 method");
	}
	
	static void mul() {
		System.out.println("Inside mul method");
	}
	static void mul1() {
		System.out.println("Inside mul1 method");
	}
	static void mul2() {
		System.out.println("Inside mul2 method");
	}
	static void mul3() {
		System.out.println("Inside mul3 method");
	}
	
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
