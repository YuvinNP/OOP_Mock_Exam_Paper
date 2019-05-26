package Question_1;

public class ThreadCal extends Thread {

	private Calculation c;

	private int start;

	private int end;

	public ThreadCal(Calculation c, int start, int end) {

		this.c = c;
		this.start = start;
		this.end = end;
	}

	public void run() {

		synchronized (c) {
			c.sum(start, end);
		}
	}
}
