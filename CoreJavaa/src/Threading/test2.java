package Threading;

public class test2 {

	public static void main(String[] args) {
		display d=new display();
		myThread4 t1=new myThread4(d,"LOGAN");
		myThread5 t2=new myThread5(d,"VICTOR");
		t1.start();
		t2.start();
	}

}
