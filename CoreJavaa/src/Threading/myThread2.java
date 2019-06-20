package Threading;

public class myThread2 extends myThread {
	public void start() {
		super.start();
		System.out.println("start");
	}

	public void run() {

		System.out.println("run");
	}

}
