package com.gqt.corejava.arrays;
import java.util.Scanner;
public class UnstructuredArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Eter the student count");
        int n=sc.nextInt();
        //creating the array to store n students marks
        int arr[] =new int[n];
        //collecting &     marks of n students
        for(int i=0;i<arr.length;i++) {
        	System.out.println("enter the marks of student no="+(i+1));
        	arr[i]=sc.nextInt();
        }
        System.out.println("-----------");
        //display the marks inside the array 
        for(int i=0;i<arr.length;i++) {
        	System.out.println("The marks of student no: "+i+1+" is= "+arr[i]);
        }
	}

}
