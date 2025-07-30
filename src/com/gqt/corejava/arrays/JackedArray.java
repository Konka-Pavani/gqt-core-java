package com.gqt.corejava.arrays;

import java.util.Scanner;

class ArrayOperations {
	String arr[][];
	Scanner sc=new Scanner(System.in);
	void createArray(){
		System.out.println("enter class count");
		int cls=sc.nextInt();
		arr=new String[cls][];
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the count of students inside the class no : "+(i+1));
			arr[i]=new String[sc.nextInt()];
		}
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

public class JackedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOperations p=new ArrayOperations();
		p.createArray();
		p.collectData();
		p.displayData();
		

	}

}
