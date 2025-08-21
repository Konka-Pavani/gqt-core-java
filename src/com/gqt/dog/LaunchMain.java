package com.gqt.dog;
class Kukka {
	String name;
	String color;
	String breed;
	int cost;
	void run() {
		System.out.println("kukka runs");
	}
	void eat() {
		System.out.println("kukka eats");
	}
	void walk() {
		System.out.println("kukka walks");
	
	}
	void sleep() {
		System.out.println("kukka sleeps");
	}
}
public class LaunchMain {

	public static void main(String[] args) {
		Kukka d1=new Kukka();
		System.out.println("NAME: "+d1.name);
		System.out.println("COLOR: "+d1.color);
		System.out.println("BREED: "+d1.breed);
		System.out.println("COST: "+d1.cost);
		d1.name="munna";
		d1.color="dark biscuit";
		d1.breed="labdor";
		d1.cost=7000;
		System.out.println("NAME: "+d1.name);
		System.out.println("COLOR: "+d1.color);
		System.out.println("BREED: "+d1.breed);
		System.out.println("COST: "+d1.cost);
		
	}

}
