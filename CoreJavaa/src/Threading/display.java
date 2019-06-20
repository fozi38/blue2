package Threading;

public class display {

	void wishm(String name) {
		synchronized (display.class) {
			for (int i = 0; i < 10; i++) {
				System.out.println("GoodMorning");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {

				}
				System.out.println(name);
			}

		}
	}

	void wishn(String name) {

		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.println("GoodNight");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {

				}
				System.out.println(name);
			}
		}
	}
}
