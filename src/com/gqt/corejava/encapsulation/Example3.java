package com.gqt.corejava.encapsulation;

class Dog2{
	private String name;
	private String  colour;
	private String breed;
	private int age;
	private int cost;
	void setData2(String name,String colour,String breed,int age,int cost) {
		this.name=name;
		this.colour=colour;
		this.breed=breed;
		this.age=age;
		this.cost=cost;
	}
	void getData() {
		System.out.println("Name= "+name);
		System.out.println("Colour= "+colour);
		System.out.println("Breed= "+breed);
		System.out.println("age= "+age);
		System.out.println("Cost= "+cost);
		


	}
	
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog2 d=new Dog2();
		d.setData2("Jacky","White","GR",24,6000);
		d.getData();
	}

}
