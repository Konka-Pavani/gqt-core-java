package com.gqt.corejava.arrays;
import java.util.Scanner; 
class College {
		Scanner sc=new Scanner(System.in);
		String[][][] arr1;
		long[][][] arr2;
		long total_revenue;
		long revenue_amount;
		void create_Array() {
			System.out.println("Enter the number of colleges");
			int col=sc.nextInt();
			arr1=new String[col][][];
			arr2=new long[col][][];
			for(int i=0;i<arr1.length;i++) {
				System.out.println("inside the college no: "+(i+1));
				int n=sc.nextInt();
				arr1[i]=new String[n][];
				arr2[i]=new long[n][];
				for(int j=0;j<arr1[i].length;j++) {
					System.out.println("inside the classroom: "+(j+1));
					int l=sc.nextInt();
					arr1[i][j]=new String[l];
					arr2[i][j]=new long[l];
				}
				
			}
			System.out.println("array created");
			System.out.println("--------------");
		}
		void collectrevenueData() {
			for(int i=0;i<arr1.length;i++) {
				System.out.println("inside the college no: "+(i+1));
				for(int j=0;j<arr1[i].length;j++) {
					System.out.println("inside the class no: "+(j+1));
					for(int k=0;k<arr1[i][j].length;k++) {
						System.out.println("inside the capacity no: "+(k+1));
						System.out.println("enter the name of student: "+ (k+1));
						arr1[i][j][k]=sc.next();
						System.out.println("enter the revenue amount for each person :"+(k+1));
						arr2[i][j][k]=sc.nextLong();
						total_revenue+=arr2[i][j][k];
						
						
					}
				}
			}
			
		}
		void display_Data() {
		for(int i=0;i<arr1.length;i++) {
			System.out.println("inside the college no: "+(i+1));
			for(int j=0;j<arr1[i].length;j++) {
				System.out.println("inside the class no: "+(j+1));
				for(int k=0;k<arr1[i][j].length;k++) {
					System.out.println("inside the capacity no: "+(k+1));
					System.out.println("the name of student no"+ (k+1)+"is ="+	arr2[i][j][k]);
					System.out.println("total revenue= "+(k+1)+	arr1[i][j][k]);
				}
			}
		}
	}
}
class EduactionalTrust{
	public static void main(String[] args) {
		College c=new College();
		c.create_Array();
		c.collectrevenueData();
		c.display_Data();
		
	}
}
