package com.gqt.corejava.methodoverloading;

class Calculator{
	int add(int a,int b) {
		return a+b;
	}

	int add(int a,int b,int c) {
		return a+b+c;
	}

	float add(int a,float b) {
		return a+b;
	}
    float add(float a,float b) {
    	return a+b;
    	
    }
    float add(float a,int b) {
    	return a+b;
    }
    double add(double a,double b) {
    	return a+b;
    }
    double add(double a,float b) {
    	return a+b;
    }
    double add(double a,double b,double c) {
    	return a+b+c;
    }
    double add(float a,float b,double c) {
    	return a+b+c;
    }
    double add(float a,int b,double c) {
    	return a+b+c;
    }
    double add(int a,float b,float c) {
    	return a+b+c;
    }
    
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c=30;
		float m=10.11f,n=20.22f,o=30.33f;
		double p=10.111,q=20.222,r=30.333;
		Calculator c1=new Calculator();
		System.out.println(c1.add(a, b));
		System.out.println(c1.add(a, b,c));
		System.out.println(c1.add(a, m));
		System.out.println(c1.add(m, n));
		System.out.println(c1.add(m, b));
		System.out.println(c1.add(p, q));
		System.out.println(c1.add(p, m));
		System.out.println(c1.add(p, q,r));
		System.out.println(c1.add(m, n,p));
		System.out.println(c1.add(m, b,r));
		System.out.println(c1.add(c,o, q));

	}

}
