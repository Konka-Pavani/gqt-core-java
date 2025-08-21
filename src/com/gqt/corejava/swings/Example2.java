package com.gqt.corejava.swings;
import javax.swing.*;
public class Example2 {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		
		JButton b1=new JButton("Ok");
		b1.setBounds(150, 200, 220, 50);
		f.add(b1);
        
		JButton b2=new JButton("Submit");
		b2.setBounds(150, 250, 220, 50);
		f.add(b2);
		
		JButton b3=new JButton("Cancel");
		b3.setBounds(150, 300, 220, 50);
		f.add(b3);
        f.setSize(500, 600);
        f.setLayout(null);
        f.setVisible(true);
		
		
	}

}
