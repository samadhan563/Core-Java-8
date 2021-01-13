package thread;

public class OddPrinterTask extends Thread {
	private int start, end;

	public OddPrinterTask(String name, int start, int end) {
		super(name);
		this.start = start;
		this.end = end;
		start();
	}

	@Override
	public void run() {
		try {
			System.out.println("Executing thread "+currentThread().getName());
			for (int i = start; i <= end; i++)
				if (i % 2 != 0) {
					System.out.println(this.getName() + " thread " + i);
					sleep(500);
				}
			System.out.println("Execution of thread over "+currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
