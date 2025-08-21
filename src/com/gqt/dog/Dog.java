package com.gqt.dog;
class Pet{
	String name;
	String color;
	String breed;
	int cost;
	void run() {
		System.out.println("dog runs");
	}
	void eat() {
		System.out.println("dog eats");
	}
	void walk() {
		System.out.println("dog walks");
	}
    void sleep() {
    	System.out.println("dog sleeps");
    }
}

public class Dog {

	public static void main(String[] args) {
		Pet d1=new Pet();
		d1.name="Rocky";
	    d1.color="brown";
	    d1.breed="GR";
	    d1.cost=7000;
	    System.out.println(d1.name);
	    System.out.println(d1.color);
	    System.out.println(d1.breed);
	    System.out.println(d1.cost);
	    d1.run();
	    d1.eat();
	    d1.walk();
	    d1.sleep();
	    Pet d2=new Pet();
		d2.name="charlie";
	    d2.color="white";
	    d2.breed="white husky";
	    d2.cost=5000;
	    System.out.println(d2.name);
	    System.out.println(d2.color);
	    System.out.println(d2.breed);
	    System.out.println(d2.cost);
	    d2.run();
	    d2.eat();
	    d2.walk();
	    d2.sleep();
	    Pet d3=new Pet();
		d3.name="munna";
	    d3.color="dark biscuit";
	    d3.breed="labdor";
	    d3.cost=9000;
	    System.out.println(d3.name);
	    System.out.println(d3.color);
	    System.out.println(d3.breed);
	    System.out.println(d3.cost);
	    d3.run();
	    d3.eat();
	    d3.walk();
	    d3.sleep();
	    
	    
	}

}

