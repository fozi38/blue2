package Threading;

public class myThread4 extends Thread {
	display d;
	String name;

	myThread4(display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wishn(name);
		d.wishm(name);
	}
}
