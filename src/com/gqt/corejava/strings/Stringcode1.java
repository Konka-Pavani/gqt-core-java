package com.gqt.corejava.strings;

public class Stringcode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="RAMA";
		String s2="RAMA";
		String s3="rama";
		String s4="SITA";
		System.out.println("Case 1: Strings are same ");
		if(s1.equals(s2)) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
		System.out.println("------------------");
		if(s1==s2) {
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are not equal");
		}
		System.out.println("Case 2: Strings are different ");
		if(s3.equals(s4)) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
		System.out.println("------------------");
		if(s3==s4) {
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are not equal");
		}
		System.out.println("Case 3: Strings are same but different case");
		if(s1.equals(s3)) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
		System.out.println("------------------");
		if(s1==s3) {
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are not equal");
		}

	}

}
