package Question_1;

public class PrintThread extends Thread {

	public  void run() {
		
			System.out.println(Thread.currentThread().getName());
			
			for (int i = 1; i <= 100; i++) {
				
				System.out.println(i);
			}
			
			
	}
}
