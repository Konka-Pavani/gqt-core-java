package com.gqt.corejava.strings;

public class BuiltInMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="SachinRameshTendulkar";
		//1.length()
		int len=s.length();
		System.out.println(len);
		
		//2.charAt()
		char c=s.charAt(0);
		System.out.println(c);
//		c=s.charAt(100);
//		System.out.println(c);
		
		//3.concat
		String s2=s.concat(" is the best batsman in the world");
		System.out.println(s2);
		
		//4.contains()
		boolean contains=s.contains("Ramesh");
		System.out.println(contains);
		contains=s.contains("pamesh");
		System.out.println(contains);
		
		//5.startsWith()
		boolean c2=s.startsWith("Sachin");
		System.out.println(c2);
		boolean c3=s.startsWith("Pachin");
		System.out.println(c3);
		
		//6.endsWith()
		boolean c4=s.endsWith("Tendulkar");
		System.out.println(c4);
		c4=s.startsWith("Pendulkar");
		System.out.println(c4);
		
		//7.getClass()
		Class cla=s.getClass();
		System.out.println(cla);
		
		//8.hashCode()
		int hashcode=s.hashCode();
		System.out.println(hashcode);
		
		//9.indexOf()
		int n=s.indexOf('S');
		System.out.println(n);
		n=s.indexOf('$');
		System.out.println(n);
		
		//10.isBlank()
		boolean blank=s.isBlank();
		System.out.println(blank);
		String s5="         ";
		blank=s5.isBlank();
		System.out.println(blank);
		String s6="";
		blank=s6.isBlank();
		System.out.println(blank);
		
		//11.isEmpty()
		boolean empty=s.isEmpty();
		System.out.println(empty);
		String s7="         ";
		empty=s7.isEmpty();
		System.out.println(empty);
		String s8="";
		empty=s8.isEmpty();
		System.out.println(empty);
		
		//12.lastIndexOf();
		int lastindex=s.lastIndexOf('e');
		System.out.println(lastindex);
		lastindex=s.lastIndexOf('z');
		System.out.println(lastindex);
		
		//13.replace()
		String replace=s.replace('S','$');
		System.out.println(replace);
		
		//14.substring(int start)
		String substring=s.substring(6);
		System.out.println(substring);
		
		//substring(int start,int end)
		String substring2=s.substring(6,12);
		System.out.println(substring2);
		
		//16.toUpperCase()
		String uppercase=s.toUpperCase();
		System.out.println(uppercase);
		
		//17.toLowercase();
		String lowercase=s.toLowerCase();
		System.out.println(lowercase);
	}

}
