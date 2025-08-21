package com.gqt.corejava.statics;
import java.util.Scanner;
class Raithu {
	double principle;
	static double rate;
	double time;
	double si;
	static {
		rate=2.789;
	}
	void collectData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the principle:");
		principle=sc.nextDouble();
		System.out.println("enter the time");
		time=sc.nextDouble();
	}
	void calculate() {
		si=(principle*rate*time)/100;
	}
	void display() {
		System.out.println("SI="+si);
	}
}

public class MainApp2{

	public static void main(String[] args) {
		Raithu f1=new Raithu();
		Raithu f2=new Raithu();
		Raithu f3=new Raithu ();
		System.out.println("Raithu-1");
		f1.collectData();
		f1.calculate();
		f1.display();
		System.out.println("---------");
		System.out.println("Raithu-2");
		f2.collectData();
		f2.calculate();
		f2.display();
		System.out.println("--------");
		System.out.println("Raithu-3");
		f3.collectData();
		f3.calculate();
		f3.display();
	}

}

