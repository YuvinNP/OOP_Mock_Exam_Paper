package Question_1;

public class NumbersThread extends Thread {
	
	public void run() {
		
		for (int i = 1; i <= 100; i++) {
			
			System.out.println(i);
			System.out.println("Thread: " + Thread.currentThread().getName());
		}
	}

}
