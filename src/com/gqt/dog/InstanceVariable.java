package com.gqt.dog;
class Cars {
	String name;
	String brand;
	String color;
	int cost;
	void allocateData() {
		name="hundai";
		brand="I20";
		color="black";
	    cost=1100000;
		
	}
	void display() {
		System.out.println(name);
		System.out.println(brand);
		System.out.println(color);
		System.out.println(cost);
	}
}
public class InstanceVariable {

	public static void main(String[] args) {
		Cars c1=new Cars();
		c1.name="kiya";
		c1.allocateData();
		c1.display();

	}

}
