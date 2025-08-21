package com.gqt.dog;

import java.util.Scanner;
class Farmer {
	double principle;
	double rate;
	double time;
	double si;
	void collectData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the principle:");
		principle=sc.nextDouble();
		System.out.println("enter the time");
		time=sc.nextDouble();
		rate=2.789;
	}
	void calculate() {
		si=(principle*rate*time)/100;
	}
	void display() {
		System.out.println("SI="+si);
	}
}

public class MainApp {

	public static void main(String[] args) {
		Farmer f1=new Farmer();
		Farmer f2=new Farmer();
		Farmer f3=new Farmer();
		System.out.println("Farmer-1");
		f1.collectData();
		f1.calculate();
		f1.display();
		System.out.println("---------");
		System.out.println("Farmer-2");
		f2.collectData();
		f2.calculate();
		f2.display();
		System.out.println("--------");
		System.out.println("Farmer-3");
		f3.collectData();
		f3.calculate();
		f3.display();
	}

}
