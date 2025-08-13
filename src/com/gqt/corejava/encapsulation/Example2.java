package com.gqt.corejava.encapsulation;

class Dog1{
	private String name;
	private String  colour;
	private String breed;
	private int age;
	private int cost;
	void setData2(String name,String colour,String breed,int age,int cost) {
		name=name;
		colour=colour;
		breed=breed;
		age=age;
		cost=cost;
	}
	void getData() {
		System.out.println("Name= "+name);
		System.out.println("Colour= "+colour);
		System.out.println("Breed= "+breed);
		System.out.println("age= "+age);
		System.out.println("Cost= "+cost);
		


	}
	
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 d=new Dog1();
		d.setData2("Neelu","White","GR",24,6000);
		d.getData();
	}

}
