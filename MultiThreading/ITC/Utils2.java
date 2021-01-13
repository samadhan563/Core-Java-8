package itc;

public class Utils2 {
	private Emp e;
	private boolean dataReady;

	public synchronized void writeData(Emp ref) throws Exception {

		while(dataReady)
			wait();
		System.out.println("w entered --- " + Thread.currentThread().getName());
		Thread.sleep(30);
		// produce data
		e = ref;
		System.out.println("Write Data " + e);
		System.out.println("w exited --- " + Thread.currentThread().getName());
		dataReady=true;
		notify();
	}

	public synchronized Emp readData() throws Exception
	{
		while(!dataReady)
			wait();
		System.out.println("r entered --- " + Thread.currentThread().getName());
		// consume data
		System.out.println("Read  Data " + e);
		Thread.sleep(100);
		System.out.println("r exited --- " + Thread.currentThread().getName());
		dataReady=false;
		notify();
		return e;
	}

}
