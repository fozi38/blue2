package awtSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class outer implements ActionListener {
	test3 t;

	outer(test3 t) {
		this.t = t;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == t.b1)
			t.t.setText("not bad");
		if (e.getSource() == t.b2)
			t.t.setText("not good");
	}
}
