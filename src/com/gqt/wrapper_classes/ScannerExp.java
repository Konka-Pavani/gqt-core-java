package com.gqt.wrapper_classes;
import java.util.Scanner;
public class ScannerExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the byte data");
		byte b=sc.nextByte();
		System.out.println("Byte data="+b);
		System.out.println("-----------------");
		System.out.println("enter the short data");
		short s=sc.nextShort();
		System.out.println("short data="+s);
		System.out.println("-----------------");
		System.out.println("enter the int data");
		int i=sc.nextInt();
		System.out.println("Int data="+i);
		System.out.println("-----------------");
		System.out.println("enter the long data");
		long l=sc.nextLong();
		System.out.println("long data="+l);
		System.out.println("-----------------");
		System.out.println("enter the float data");
	    float f=sc.nextFloat();
		System.out.println("float data="+f);
		System.out.println("-----------------");
		System.out.println("enter the double data");
		double d=sc.nextDouble();
		System.out.println("Double data="+d);
		System.out.println("-----------------");
		System.out.println("enter the string data");
		sc.nextLine();
		String str=sc.nextLine();
		System.out.println("string data="+str);
		sc.close();
	}

}
