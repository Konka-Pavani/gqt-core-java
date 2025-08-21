package com.gqt.corejava.challenges;
import java.util.Scanner;
public class CompareToExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string-1");
		String s1=sc.next();
		System.out.println("Enter the string-2");
		String s2=sc.next();
		if(s1.compareTo(s2)==0) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
		System.out.println("-------------------------------");
		System.out.println("Enter the string-1");
		s1=sc.next();
		System.out.println("Enter the string-2");
		s2=sc.next();
		if(s1.compareToIgnoreCase(s2)==0) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
	}

}
