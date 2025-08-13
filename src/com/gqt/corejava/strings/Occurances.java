package com.gqt.corejava.strings;

import java.util.Scanner;

public class Occurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		String r="";
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z')) {
				if(s.charAt(i)=='A' || s.charAt(i)=='a') {
				    String str=s.replace(s.charAt(i), '$');
				    r=r+str.charAt(i);
				   
				}
				else if(s.charAt(i)=='E' || s.charAt(i)=='e') {
				    String str=s.replace(s.charAt(i), '#');
				    r=r+str.charAt(i);
				   
				}
				else if(s.charAt(i)=='I' || s.charAt(i)=='i') {
				    String str=s.replace(s.charAt(i), '*');
				    r=r+str.charAt(i);
				   
				}
				else if(s.charAt(i)=='O' || s.charAt(i)=='o') {
				    String str=s.replace(s.charAt(i), '@');
				    r=r+str.charAt(i);
				   
				}
				else if(s.charAt(i)=='U' || s.charAt(i)=='u') {
				    String str=s.replace(s.charAt(i), '&');
				    r=r+str.charAt(i);
				   
				}
				else if(s.charAt(i)==' ') {
					r=r+' ';
				}
				else {
					r=r+s.charAt(i);
				}
			}
		}
		System.out.println(r);
		

	}

}
