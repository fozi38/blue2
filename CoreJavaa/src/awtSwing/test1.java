package awtSwing;

import java.awt.Frame;

public class test1 {
//	private static final long serialVersionUID = 1L;
	Frame f;
	public test1(String str) {
		f=new Frame(str);
		f.setSize(400,400);
		f.setVisible(true);
	}

	public static void main(String args[]) {
		test1 t=new test1("FirstFrame");
		
	}

}
