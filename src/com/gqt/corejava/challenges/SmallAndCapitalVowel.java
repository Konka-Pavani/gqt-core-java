package com.gqt.corejava.challenges;

import java.util.Scanner;

public class SmallAndCapitalVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		int small_vowel_count=0;
		int cap_count=0;
		int con=0;
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z')) {
				if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U') {
					cap_count=cap_count+1;
				}
				else if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
					small_vowel_count=small_vowel_count+1;
				}
				else {
					con=con+1;
				}
						
			}
		}
		System.out.println("small vowels= "+small_vowel_count);
		System.out.println("capital vowles= "+cap_count);
		System.out.println("consonants= "+con);

	}

}
