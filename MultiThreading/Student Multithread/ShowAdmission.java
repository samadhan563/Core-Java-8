package runnable_thread;

import utils.Utils;

public class ShowAdmission implements Runnable{

	Utils utils;
	boolean exit;
	public ShowAdmission(Utils utils) 
	{
		this.utils=utils;
	}
	
	@Override
	public void run()
	{
		System.out.println("Started thread...."+Thread.currentThread().getName());
		while(!exit)
			try {
				utils.readData();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Over thread...."+Thread.currentThread().getName());
		
	}
	public void stop()
	{
		exit=true;
	}

}
