package Threading;

public class myThread5 extends Thread {
	display d;
	String name;

	myThread5(display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wishm(name);
		d.wishn(name);
	}
}
