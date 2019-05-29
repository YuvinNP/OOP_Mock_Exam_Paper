package Question_1;

public class SLIITThread extends Thread {

	ThreadMain obj;

	public SLIITThread(ThreadMain obj) {
		
		this.obj = obj;
	}

	public void run() {

		synchronized (obj) {

			System.out.println(Thread.currentThread().getName());
			
			for (int i = 1; i <= 100; i++) {

				System.out.println("SLIIT");
			}
			obj.notify();

		}
	}
}
