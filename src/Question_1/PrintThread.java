package Question_1;

public class PrintThread extends Thread {

	ThreadMain obj;
	
	
	
	public PrintThread(ThreadMain obj) {
	
		this.obj = obj;
	}



	public  void run() {
		
		synchronized (obj) {
			
			try{obj.wait();}catch (Exception e) {}
			
			System.out.println(Thread.currentThread().getName());
			
			for (int i = 1; i <= 100; i++) {
				
				System.out.println(i);
			}
			
		}
			
	}
}
