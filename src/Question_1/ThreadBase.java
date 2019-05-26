package Question_1;

public class ThreadBase {

	public static void main(String[] args) throws InterruptedException {
	
		NumbersThread t1 = new NumbersThread();
		NumbersThread t2 = new NumbersThread();
		NumbersThread t3 = new NumbersThread();
		
		t1.setName("Red");
		t2.setName("Blue");
		t3.setName("Green");
		
		t1.start();
		t2.start();
		t3.start();
		
		for (int i = 1; i <= 100; i++) {
			
			System.out.println("SLIIT");
		}
		
		
		System.out.println("Thread 1- state: " + t1.getState() + "-Alive: " + t1.isAlive());
		
	}

}
