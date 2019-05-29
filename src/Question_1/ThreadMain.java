package Question_1;

public class ThreadMain {

	public static void main(String[] args) throws InterruptedException {
	
		ThreadMain threadMain = new ThreadMain();
		
		PrintThread t1 = new PrintThread(threadMain);
		
		Thread t2 = new Thread(new SLIITThread(threadMain));
		
		
		t1.start();
		t2.start();
		
		
	}

}
