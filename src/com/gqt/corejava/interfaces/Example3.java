package com.gqt.corejava.interfaces;

import java.util.Scanner;

interface Shapess1{
	void collect();
	void calculate();
	void display();
}
class Circle11 implements Shapess1{
    private double r;
    private final double pi=3.1472;
    Scanner sc=new Scanner(System.in);
    double area;
	@Override
	public void collect() {
		// TODO Auto-generated method stub
		System.out.println("Enter the circle radius");
		r=sc.nextDouble();
		
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		area=pi*r*r;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("area of the shape is: "+area);
		
	}
	
}

class Rectangle11 implements Shapess1{
    private double length,breadth;
    Scanner sc=new Scanner(System.in);
    double area;
	@Override
	public void collect() {
		// TODO Auto-generated method stub
		System.out.println("Enter the length");
		length=sc.nextDouble();
		System.out.println("Enter the breadth");
		breadth=sc.nextDouble();
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		area=length*breadth;
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("area of the shape is: "+area);
		
	}
	
}

class Square11 implements Shapess1{
    private double side;
    Scanner sc=new Scanner(System.in);
    private double area;
	@Override
	public void collect() {
		// TODO Auto-generated method stub
		System.out.println("Enter the side");
		side=sc.nextDouble();
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		area=side*side;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}

class Geometry11{
	void hasShapes(Shapess1 c) {
		c.collect();
		c.calculate();
		c.display();
	}
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle11 c=new Circle11();
		Rectangle11 r=new Rectangle11();
		Square11 s=new Square11();
		
		Geometry11 g=new Geometry11();
		g.hasShapes(c);
		System.out.println("----------------------");
		g.hasShapes(r);
		System.out.println("-----------------------");
		g.hasShapes(s);
		

	}

}
