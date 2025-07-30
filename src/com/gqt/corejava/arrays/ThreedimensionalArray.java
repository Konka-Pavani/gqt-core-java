package com.gqt.corejava.arrays;

import java.util.Scanner;

class Program6 {
	String arr[][][];
	Scanner sc=new Scanner(System.in);
	void createArray(){
		System.out.println("enter school count");
		int scl=sc.nextInt();
		System.out.println("enter class count");
		int cls=sc.nextInt();
		System.out.println("enetr stu count");
		int stu=sc.nextInt();
		arr=new String[scl][cls][stu];
		System.out.println("array created");
		System.out.println("-----------");
		
	}
	void collectData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the school no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the class no :"+ (j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("enter the name of student: "+(k+1));
					arr[i][j][k]=sc.next();
				}
			   
			}
		}
	}
	void displayData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the school no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter the class no:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("enter the name of student no:"+(k+1)+" is= "+arr[i][j][k]);
				}
			}
		}
	}
}

public class ThreedimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program6 p=new Program6 ();
		p.createArray();
		p.collectData();
		p.displayData();
		

	}

}
