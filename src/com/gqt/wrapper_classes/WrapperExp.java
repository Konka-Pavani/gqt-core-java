package com.gqt.wrapper_classes;
import java.util.Scanner;
public class WrapperExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the byte data");
		Byte b=new Byte(sc.nextByte());
		System.out.println("Byte data="+b);
		System.out.println("-----------------");
		System.out.println("enter the short data");
		Short s=new Short(sc.nextShort());
		System.out.println("short data="+s);
		System.out.println("-----------------");
		System.out.println("enter the int data");
		Integer i=new Integer(sc.nextInt());
		System.out.println("Int data="+i);
		System.out.println("-----------------");
		System.out.println("enter the long data");
		Long l=new Long(sc.nextLong());
		System.out.println("long data="+l);
		System.out.println("-----------------");
		System.out.println("enter the float data");
	    Float f=new Float(sc.nextFloat());
		System.out.println("float data="+f);
		System.out.println("-----------------");
		System.out.println("enter the double data");
		Double d=new Double(sc.nextDouble());
		System.out.println("Double data="+d);
		System.out.println("-----------------");
		System.out.println("enter the character data");
		Character c=new Character('a');
		System.out.println("String data="+c);
		System.out.println("enter the boolean data");
		Boolean boo=new Boolean(false);
		System.out.println("boolean="+boo);
		System.out.println("-----------------");
		System.out.println("enter the string data");
		sc.nextLine();
		String str=new String(sc.nextLine());
		System.out.println("String data="+str);
		System.out.println("-----------------");
		sc.close();
	}

}