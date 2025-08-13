package com.gqt.corejava.strings;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
        if(rev.equals(s)==true) {
        	System.out.println("Plaindrome");
        }
        else {
        	System.out.println("not palindrome");
        }
	}

}
