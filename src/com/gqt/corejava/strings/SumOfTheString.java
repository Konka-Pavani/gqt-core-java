package com.gqt.corejava.strings;
import java.util.Scanner;
public class SumOfTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int sum=0;
		for(int i=0;i<s.length();i++) {
			sum=sum+s.charAt(i);
		}
       System.out.println("Sum of the entire string= "+sum);
	}

}
