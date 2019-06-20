package Threading;

public class test3 {

	public static void main(String[] args) {
		myThread6 t = new myThread6();
		t.setDaemon(true);
		t.start();
		for (int i = 0; i < 10; i++)
			System.out.println("MAIN");

	}

}
