package com.gqt.corejava.arrays;

import java.util.Scanner;

class Array6 {
	Long[][][] arr;
	Scanner sc=new Scanner(System.in);
	long investment;
	long prev_profit;
	long sum_revenue;
	void createArray(){
		System.out.println("enter  langueges count");
		int lan=sc.nextInt();
		System.out.println("enter categories count");
		int cat=sc.nextInt();
		System.out.println("enetr movies count");
		int mov=sc.nextInt();
		arr=new Long[lan][cat][mov];
		System.out.println("array created");
		System.out.println("-----------");
		System.out.println(" enter the investment amount");
		investment=sc.nextLong();
		System.out.println(" enter the prev_profit amount");
		prev_profit=sc.nextLong();
		System.out.println("-----------");
		
	}
	void collectData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the languages no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the categories in each language :"+ (j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("enter the movies revenue in each category : "+(k+1));
					arr[i][j][k]=sc.nextLong();
					sum_revenue+=arr[i][j][k];
				}
			   
			}
		}
	}
	void displayRevenueData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the languages no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter the categories no in each languge:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("enter the name of movie no:"+(k+1)+" is= "+arr[i][j][k]);
				}
			}
		}
		if(sum_revenue>investment) {
			long profit=sum_revenue-investment;
			System.err.println("the profit made by the hemanth in this 2024-2025: "+profit);
			if(profit>prev_profit) {
				System.out.println("hemanth got profit than the previous year");
			}
		}
		else {
			System.out.println("loss made by hemanth in this 2024-2025:"+ (investment-sum_revenue));
		}
	}
}

public class Productionhouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Array6 p=new Array6 ();
		p.createArray();
		p.collectData();
		p.displayRevenueData();
		

	}

}
