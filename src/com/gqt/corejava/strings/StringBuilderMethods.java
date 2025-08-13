package com.gqt.corejava.strings;

public class StringBuilderMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s=new StringBuilder("SachinRameshTendulkar");
		System.out.println("1.length");
		int len=s.length();
		System.out.println(len);
		
		System.out.println("2.charAt()");
		char c=s.charAt(0);
		System.out.println(c);
//		c=s.charAt(100);
//		System.out.println(c);
		
		System.out.println("3.append");
		s.append(" is the best batsman in the world");
		System.out.println(s);
		
		System.out.println("4.delete");
		s.delete(0, 6);
		System.out.println(s);
		
		System.out.println("5.deleteCharAt");
		s.deleteCharAt(0);
		System.out.println(s);
		
		System.out.println("6.insert");
		s.insert(4, "Neelu");
		System.out.println(s);
		
		//7.capacity()
//		s.capacity();
//		System.out.println(s);
		
		System.out.println("8.substring(int start)");
		String s1=s.substring(6);
     	System.out.println(s1);
     	
     	System.out.println("9.substring(int start,int end)");
     	s1=s.substring(0,6);
     	System.out.println(s1);
     	
     	System.out.println("10.replace()");
		s.replace(0,6,"Pavani");
		System.out.println(s);
		
		System.out.println("11.setCharAt()");
		s.setCharAt(5, 'Z');
		System.out.println(s);
		
		System.out.println("12.reverse()");
		s.reverse();
		System.out.println(s);
		
		System.out.println("13.setLength()");
		s.setLength(8);
		System.out.println(s);
		
	}
}
