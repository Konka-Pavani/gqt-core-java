package com.gqt.corejava.encapsulation;

class Lion{
	private String name;
	private String colour;
	private String country;
	private int age;
	void setData1() {
		name="Pavani";
		colour="White";
		country="India";
		age=22;
	}
	void setData2(String a,String b,String c,int d) {
		name=a;
		colour=b;
		country=c;
		age=d;
	}
	void getData() {
		System.out.println("Name= "+name);
		System.out.println("Country= "+country);
		System.out.println("Colour= "+colour);
		System.out.println("age= "+age);


	}
	
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion l=new Lion();
//		l.name="Ramu";//private members cannot be accessed outside the class
//		l.colour="Black";//private members cannot be accessed outside the class
//		l.country="India";//private members cannot be accessed outside the class
//		l.age=23;//private members cannot be accessed outside the class
		l.setData1();
		l.getData();
		l.setData2("Neelu","White","Inida",24);
		l.getData();
	}

}
