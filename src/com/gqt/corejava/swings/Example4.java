package com.gqt.corejava.swings;

import java.util.Scanner;

import javax.swing.*;
class Sol{
	String name;
	String email;
	double mobile;
	Scanner sc=new Scanner(System.in);
	 void getDetails() {
		System.out.println("enter details");
		name=sc.next();
		email=sc.next();
		mobile=sc.nextDouble();

	}
}
class Example4{
	public static void main(String[] args) {
		Sol s=new Sol();
		JFrame f=new JFrame();
		JLabel l=new JLabel(s)
		f.setSize(500, 600);
        f.setLayout(null);
        f.setVisible(true);
        }
}