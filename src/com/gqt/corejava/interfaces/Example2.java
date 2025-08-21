package com.gqt.corejava.interfaces;

import java.util.Scanner;

abstract class Shapes{
	double area;
	abstract void collect();
	abstract void calculate();
	void dispaly() {
		System.out.println("Area of the shape is: "+area);
	}
}
class Circle extends Shapes{
    private double r;
    private final double pi=3.1472;
    Scanner sc=new Scanner(System.in);
	@Override
	void collect() {
		// TODO Auto-generated method stub
		System.out.println("Enter the circle radius");
		r=sc.nextDouble();
		
	}

	@Override
	void calculate() {
		// TODO Auto-generated method stub
		area=pi*r*r;
	}
	
}

class Rectangle extends Shapes{
    private double length,breadth;
    Scanner sc=new Scanner(System.in);
	@Override
	void collect() {
		// TODO Auto-generated method stub
		System.out.println("Enter the length");
		length=sc.nextDouble();
		System.out.println("Enter the breadth");
		breadth=sc.nextDouble();
	}

	@Override
	void calculate() {
		// TODO Auto-generated method stub
		area=length*breadth;
	}
	
}

class Square extends Shapes{
    private double side;
    Scanner sc=new Scanner(System.in);
	@Override
	void collect() {
		// TODO Auto-generated method stub
		System.out.println("Enter the side");
		side=sc.nextDouble();
	}

	@Override
	void calculate() {
		// TODO Auto-generated method stub
		area=side*side;
	}
	
}

class Geometry{
	void hasShapes(Shapes s) {
		s.collect();
		s.calculate();
		s.dispaly();
	}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		Rectangle  r=new Rectangle();
		Square s=new Square();
		
		Geometry g=new Geometry();
		g.hasShapes(c);
		System.out.println("----------------------");
		g.hasShapes(r);
		System.out.println("-----------------------");
		g.hasShapes(s);
		

	}

}
