package awtSwing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class awtusinganonamousclass {
	Frame f;
	Button b1, b2;
	TextField tf;

	awtusinganonamousclass(String str) {
		f = new Frame(str);
		b1 = new Button("Back");
		b2 = new Button("Ok");
		tf = new TextField("Write Something...");

		tf.setBounds(100, 70, 100, 40);
		b1.setBounds(100, 200, 40, 20);
		b2.setBounds(200, 200, 40, 20);

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if(e.getSource()==b1)
					tf.setText("I am Okay");
//				if(e.getSource()==b2)
//					tf.setText("Not Okay");
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
//				if(e.getSource()==b1)
//					tf.setText("I am Okay");
				if(e.getSource()==b2)
					tf.setText("Not Okay");
			}
		});

		f.add(b1);
		f.add(b2);
		f.add(tf);

		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		awtusinganonamousclass obj = new awtusinganonamousclass("INNER CLASS");

	}

}
