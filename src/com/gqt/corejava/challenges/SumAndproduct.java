package com.gqt.corejava.challenges;
import java.util.Scanner;
public class SumAndproduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		int sum_cap_vowel=0;
		int sum_small_vowel=0;
		long mul_con=1;
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z') ) {
				if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U') {
					sum_cap_vowel=sum_cap_vowel+s.charAt(i);
				}
				else if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
					sum_small_vowel=sum_small_vowel+s.charAt(i);
				}
				else {
					mul_con=mul_con*s.charAt(i);
				}
			}
		}
		System.out.println("Sum of capital vowels= "+sum_cap_vowel);
		System.out.println("Sum of smaller vowels= "+sum_small_vowel);
		System.out.println("Product of consonants= "+mul_con);

	}

}
