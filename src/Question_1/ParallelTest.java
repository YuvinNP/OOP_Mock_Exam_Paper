package Question_1;

public class ParallelTest {

	public static void main(String[] args) throws InterruptedException {
		
		Calculation c = new Calculation();
		
		ThreadCal t1 = new ThreadCal(c, 1, 1000000);
		ThreadCal t2 = new ThreadCal(c, 1, 1000000);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Total: " + c.getTotal());
		
	}
}
