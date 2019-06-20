package Threading;

public class test1 {
	public static void main(String args[]) throws InterruptedException {
		// Thread.currentThread().setName("saad");
		// System.out.println(Thread.currentThread().getName());
		myThread3 m = new myThread3();
		Thread t = new Thread(m, "saad");
		// t.setPriority(10);
		 t.start();
		// t.join(50000);
		t.interrupt();
		System.out.println("main");

	}

}
