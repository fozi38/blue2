package awtSwing;

import java.awt.*;
import java.awt.event.*;

public class test2 implements ActionListener {
	Frame f;
	TextField t;
	Button b1, b2;

	public test2(String string) {
		f = new Frame(string);
		t = new TextField("Say Something");
		b1 = new Button("Cancel");
		b2 = new Button("Ok");
		t.setBounds(260, 50, 200, 60);
		b1.setBounds(260, 120, 80, 30);
		b2.setBounds(260, 160, 80, 30);

		b1.addActionListener(this);
		b2.addActionListener(this);

		f.add(t);
		f.add(b1);
		f.add(b2);

		f.setLayout(null);
		f.setVisible(true);
		f.setSize(800, 400);

	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
			t.setText("Not Cancelled");
		if(e.getSource()==b2)
			t.setText("Not Okay");
	}

	public static void main(String[] args) {
		test2 t = new test2("ActionListening");

	}

}
