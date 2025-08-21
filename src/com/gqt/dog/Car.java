package com.gqt.dog;
class Luxury {
	String brand;
	String color;
	String name;
	int cost;
	void speed() {
		System.out.println("car speeds faster");
	}
	void milage() {
		System.out.println("car milage low");
	}
}

public class Car {

	public static void main(String[] args) {
		Luxury c1=new Luxury();
		c1.brand="Hundai";
		c1.color="black";
	    c1.name="I20";
	    c1.cost=1100000;
	    System.out.println(c1.brand);
	    System.out.println(c1.color);
	    System.out.println(c1.name);
	    System.out.println(c1.cost);
	    c1.speed();
	    c1.milage();
	    Luxury c2=new Luxury();
		c2.brand="Toyato";
		c2.color="Merun";
	    c2.name="Fortuner";
	    c2.cost=6000000;
	    System.out.println(c2.brand);
	    System.out.println(c2.color);
	    System.out.println(c2.name);
	    System.out.println(c2.cost);
	    c2.speed();
	    c2.milage();
	}
}
