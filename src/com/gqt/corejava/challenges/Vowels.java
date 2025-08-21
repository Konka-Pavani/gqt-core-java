package com.gqt.corejava.challenges;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		int vowel_count=0;
		int con_count=0;
		s=s.toUpperCase();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U') {
					vowel_count=vowel_count+1;
				}
				else {
					con_count=con_count+1;
				}
						
			}
		}
		System.out.println("vowels= "+vowel_count);
		System.out.println("consonants= "+con_count);

	}

}
