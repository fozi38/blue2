package awtSwing;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class ButtonUsingLayout implements ActionListener {
	JFrame f;
	JButton b1,b2,b3,b4,b5;
	CardLayout Card;
	Container c;
	ButtonUsingLayout(String s){
		f=new JFrame(s);
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		
		c=f.getContentPane();
		
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		c.add(b5);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		Card=new CardLayout(100,100);
		
		f.setLayout(Card);
		
		f.setSize(400, 400);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new ButtonUsingLayout("Buttons");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Card.previous(c);
		
	}

}
