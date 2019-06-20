package Threading;

public class myThread6 extends Thread {
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		for (int i = 0; i < 10; i++)
			System.out.println("DEMON_DAEMON");
	}
}
