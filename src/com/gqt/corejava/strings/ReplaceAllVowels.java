package com.gqt.corejava.strings;

import java.util.Scanner;

public class ReplaceAllVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		String r="";
		s=s.toUpperCase();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U') {
				    String str=s.replace(s.charAt(i), '@');
				    r=r+str.charAt(i);
				}
				else {
					r=r+s.charAt(i);
				}
			}
		}
		System.out.println(r);
		

	}

}
