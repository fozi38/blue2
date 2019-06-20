package Threading;

public class myThread3 implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			try{
				System.out.println("myThread");
				Thread.sleep(5000);
				System.out.println("RUN");
			}
			catch(InterruptedException e){
				System.out.println("Interrupted");
			}
			
		}
	}

}
