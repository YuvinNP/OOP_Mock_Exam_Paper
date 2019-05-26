package Question_1;

public class ThreadMain {

	public static void main(String[] args) throws InterruptedException {
	
		PrintThread t1 = new PrintThread();
		
		Thread t2 = new Thread(new SLIITThread());
		
		
		t1.start();
		t2.start();
		
		
	}

}
