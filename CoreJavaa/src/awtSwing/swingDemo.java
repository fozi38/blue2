package awtSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class swingDemo implements ActionListener {
	JFrame f;
	Button b;
	JButton b1;
	JTextField tf;
	Container c;
	swingDemo(){
		f=new JFrame();
		b1=new JButton("Ok");
		tf=new JTextField("awt");
		b=new Button("okay");
		
		b.setBounds(40,40,100, 100);
		b1.setBounds(40,150,100, 100);
		tf.setBounds(150,40,100, 100);
		
//		Container c=f.getContentPane();
		
		f.add(b1);
		f.add(tf);
		f.add(b);
		
		b.addActionListener(this);
		
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
		}
		catch(Exception e){}
		
		
		f.setSize(400,400);
		f.setTitle("Swing");
		f.setLayout(null);
		f.setVisible(true);
		c=f.getContentPane();
		
		
		
	}
	public static void main(String[] args) {
		new swingDemo();
	}
	public void actionPerformed(ActionEvent e){
		tf.setText("abc");
	}

}
