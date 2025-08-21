package com.gqt.dog;
class Program {
	int a,b,c;
	static int p,q,r;
	
	{
		a=10;
		b=20;
		c=30;
	}
	
	static {
		p=11;
		q=22;
		r=33;
	}
	void display1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	static void display2() {
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
	}
}
public class StaticSegment {

	public static void main(String[] args) {
		Program.display2();
		Program.p=99;
		Program.display2();
		Program p1=new Program();
		p1.display1();
		p1.display2();

	}

}
