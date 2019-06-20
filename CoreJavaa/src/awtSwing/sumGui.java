package awtSwing;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sumGui {
	Frame f;
	Button b;
	TextField tf1, tf2, tf3;

	sumGui(String str) {
		f = new Frame(str);
		b = new Button("Sum");
		tf1 = new TextField();
		tf2 = new TextField();
		tf3 = new TextField();

		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getSource()==b){
					int i1=Integer.parseInt(tf1.getText());
					int i2=Integer.parseInt(tf2.getText());
					int i3=i1+i2;
					tf3.setText(String.valueOf(i3));
				}
			}
		});
		
		f.add(b);
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);

		f.setLayout(new FlowLayout());
		f.setSize(400,400);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		sumGui s=new sumGui("SUM");
	}

}
