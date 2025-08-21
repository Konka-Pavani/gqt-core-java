package com.gqt.corejava.swings;
import javax.swing.*;
public class Example1 {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		
		JButton b=new JButton("I am Pavani");
		b.setBounds(150, 200, 220, 50);
		f.add(b);

        f.setSize(500, 600);
        f.setLayout(null);
        f.setVisible(true);
		
		
	}

}
