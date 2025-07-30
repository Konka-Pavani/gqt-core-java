package com.gqt.corejava.arrays;

import java.util.Scanner;

class Array5 {
	String arr[][][];
	Scanner sc=new Scanner(System.in);
	void createArray(){
		System.out.println("enter school count");
		int scl=sc.nextInt();
		arr=new String[scl][][];
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the count of class inside the school :"+(i+1));
			arr[i]=new String[sc.nextInt()][];
			for(int j=0;j<arr[i].length;j++) {
			System.out.println("enter the count students inside the class :"+(j+1));
			arr[i][j]=new String[sc.nextInt()];
		}
		}
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

public class Threedimensionaljacked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array5 p=new Array5();
		p.createArray();
		p.collectData();
		p.displayData();
		

	}

}
