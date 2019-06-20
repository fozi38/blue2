package awtSwing;

import java.awt.*;

public class test3 {
	Frame f;
	TextField t;
	Button b1, b2;

	public test3(String string) {
		f = new Frame(string);
		t = new TextField("Say Something");
		b1 = new Button("Cancel");
		b2 = new Button("Ok");
		t.setBounds(260, 50, 200, 60);
		b1.setBounds(260, 120, 80, 30);
		b2.setBounds(260, 160, 80, 30);
		outer o = new outer(this);
		b1.addActionListener(o);
		b2.addActionListener(o);

		f.add(t);
		f.add(b1);
		f.add(b2);

		f.setLayout(null);
		f.setVisible(true);
		f.setSize(800, 400);

	}

	public static void main(String[] args) {
		test3 t = new test3("ActionListening");

	}

}
