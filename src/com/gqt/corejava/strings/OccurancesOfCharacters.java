package com.gqt.corejava.strings;
import java.util.Scanner;
public class OccurancesOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=0;i<s.length();i++) {
			int c=1;
			System.out.println(s.charAt(i)+" is:"+c);
			for(int j=i+1;j<s.length();j++) {
			
				if(s.charAt(i)==s.charAt(j)) {
					c++;
					System.out.println(s.charAt(i)+" is:"+c);
					j=' ';
				}
			}
		}
		

	}

}
