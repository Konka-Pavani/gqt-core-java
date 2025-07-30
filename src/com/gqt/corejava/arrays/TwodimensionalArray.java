package com.gqt.corejava.arrays;

import java.util.Scanner;

class Program2{
	String arr[][];
	Scanner sc=new Scanner(System.in);
	void createArray(){
		System.out.println("enter class count");
		int cls=sc.nextInt();
		System.out.println("enetr stu count");
		int stu=sc.nextInt();
		arr=new String[cls][stu];
		System.out.println("array created");
		System.out.println("-----------");
		
	}
	void collectData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the class no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter the name of student no:"+(j+1));
				arr[i][j]=sc.next();
			}
		}
	}
	void displayData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the class no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter the name of student no:"+(j+1)+" is ="+ arr[i][j]);
			
			}
		}
	}
}

public class TwodimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program2 p=new Program2();
		p.createArray();
		p.collectData();
		p.displayData();
		

	}

}
