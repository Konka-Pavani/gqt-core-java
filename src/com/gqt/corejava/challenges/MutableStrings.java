package com.gqt.corejava.challenges;

public class MutableStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         StringBuffer sb1=new StringBuffer("Ramayana");
         StringBuffer sb2=new StringBuffer(" is the best mythological story");
         sb1.append(sb2);
         System.out.println(sb1);
         StringBuffer sb3=new StringBuffer("Ramayana");
         StringBuffer sb4=new StringBuffer(" is the best mythological story");
         sb3.append(sb4);
         System.out.println(sb3);
	}

}
