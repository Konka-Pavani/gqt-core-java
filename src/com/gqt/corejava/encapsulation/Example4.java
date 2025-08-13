package com.gqt.corejava.encapsulation;

import java.util.Scanner;

class Dog3{
	private String name;
	private String  colour;
	private String breed;
	private int age;
	private int cost;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
}
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog3 d2=new Dog3();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter dog name");
		d2.setName(sc.next());
		System.out.println("enter dog colour");
		d2.setColour(sc.next());
		System.out.println("enter dog breed");
		d2.setBreed(sc.next());
		System.out.println("enter dog cost");
		d2.setAge(sc.nextInt());
		System.out.println("enter dog name");
		d2.setCost(sc.nextInt());
		System.out.println(d2.getName());
		System.out.println(d2.getColour());
		System.out.println(d2.getBreed());
		System.out.println(d2.getAge());
		System.out.println(d2.getCost());
		
	}

}
