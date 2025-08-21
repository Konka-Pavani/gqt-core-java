package com.gqt.corejava.swings;
import javax.swing.*;
public class Example3 {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		JLabel l=new JLabel("select known languages");
		l.setBounds(150, 150, 120, 80);
		f.add(l);
		
		JCheckBox c1=new JCheckBox("Hindi");
		c1.setBounds(150, 200, 220, 50);
		f.add(c1);
        
		JCheckBox c2=new JCheckBox("Telugu");
		c2.setBounds(150, 250, 220, 50);
		f.add(c2);
		
		JCheckBox c3=new JCheckBox("Tamil");
		c3.setBounds(150, 300, 220, 50);
		f.add(c3);
		

        f.setSize(500, 600);
        f.setLayout(null);
        f.setVisible(true);
		
		
	}

}
